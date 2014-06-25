package com.pil.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pil.service.CommonServiceImpl;
import com.pil.shorten.ShortenURLVO;
import com.pil.stringconverter.StringConverter;

/**
 * http://github.com/jun85664396
 */
@Controller
public class DefaultSpringController {
	@Inject
	CommonServiceImpl service;

	@RequestMapping(method = RequestMethod.GET, value = "{qry}")
	public void main(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String input = request.getRequestURI().toString();
		input = input.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "");
		long idx = StringConverter.decoding(input);
		ShortenURLVO vo = new ShortenURLVO();
		vo.setIdx(idx);
		try {
			vo = service.select_url(vo);
			if (vo == null) {
				request.setAttribute("error", "Page Not Found. xD");
				request.getRequestDispatcher("/").forward(request, response);
			} else {
				response.sendRedirect("http://" + vo.getUrl());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
