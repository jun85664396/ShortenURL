package com.pil.service;

import com.pil.shorten.ShortenURLVO;

/**
 * http://github.com/jun85664396
 */
public interface CommonService {
	public Integer insert_url(ShortenURLVO vo) throws Exception;

	public ShortenURLVO select_idx(ShortenURLVO vo) throws Exception;

	public ShortenURLVO select_url(ShortenURLVO vo) throws Exception;
}
