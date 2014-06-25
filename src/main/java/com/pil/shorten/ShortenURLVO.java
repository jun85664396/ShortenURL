package com.pil.shorten;

/**
 * http://github.com/jun85664396
 */
public class ShortenURLVO {
	private int idx;
	private String url;
	private String ip;
	private int count;

	public ShortenURLVO() {
		// TODO Auto-generated constructor stub
	}

	public ShortenURLVO(int idx, String url, String ip, int count) {
		super();
		this.idx = idx;
		this.url = url;
		this.ip = ip;
		this.count = count;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ShortenURLVO [idx=" + idx + ", url=" + url + ", ip=" + ip
				+ ", count=" + count + "]";
	}

}
