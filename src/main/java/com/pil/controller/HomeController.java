package com.pil.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pil.service.CommonServiceImpl;
import com.pil.shorten.ShortenURLVO;
import com.pil.stringconverter.StringConverter;

/**
 * http://github.com/jun85664396
 */
@Controller
public class HomeController {
	@Inject
	CommonServiceImpl service;

	// private static final Logger logger = LoggerFactory
	// .getLogger(HomeController.class);

	@RequestMapping(value = "/shortenURL", method = RequestMethod.POST)
	public @ResponseBody String shortenURL(HttpServletRequest request) {
		String res = "";
		long idx = 0;
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		String url = request.getParameter("url");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		ShortenURLVO vo = new ShortenURLVO();
		ShortenURLVO check = new ShortenURLVO();
		if (url.matches(".*http://.*"))
			url = url.replace("http://", "");
		if (url.matches(".*https://.*"))
			url = url.replace("https://", "");
		vo.setUrl(url);
		vo.setIp(ipAddress);
		try {
			check = service.select_idx(vo);
			if (check == null) {
				service.insert_url(vo);
				idx = vo.getIdx();
			} else {
				idx = check.getIdx();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res = StringConverter.encoding(idx, res);
		return res;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}

}
