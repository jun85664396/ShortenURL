package com.pil.shorten;

/**
 * http://github.com/jun85664396
 */
public interface ShortenURL {
	public Integer insert_url(ShortenURLVO vo) throws Exception;

	public ShortenURLVO select_idx(ShortenURLVO vo) throws Exception;

	public ShortenURLVO select_url(ShortenURLVO vo) throws Exception;
}
