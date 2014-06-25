package com.pil.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.pil.shorten.ShortenURL;
import com.pil.shorten.ShortenURLVO;

/**
 * http://github.com/jun85664396
 */
@Service
public class CommonServiceImpl implements CommonService {

	@Inject
	ShortenURL shortURL;

	@Override
	public Integer insert_url(ShortenURLVO vo) throws Exception {
		// TODO Auto-generated method stub
		return shortURL.insert_url(vo);
	}

	@Override
	public ShortenURLVO select_idx(ShortenURLVO vo) throws Exception {
		// TODO Auto-generated method stub
		return shortURL.select_idx(vo);
	}

	@Override
	public ShortenURLVO select_url(ShortenURLVO vo) throws Exception {
		// TODO Auto-generated method stub
		return shortURL.select_url(vo);
	}

}
