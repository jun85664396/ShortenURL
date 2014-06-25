package com.pil.stringconverter;

/**
 * http://github.com/jun85664396
 */
public class StringConverter {
	public static String encoding(long idx, String res) {
		if (idx >= 62) {
			long loop = (idx / 62) - 1;
			idx -= (loop + 1) * 62;
			res += encoding(loop, res);
		}
		if (idx >= 36) {
			idx += 6;
		}
		if (idx >= 10) {
			idx += 7;
		}
		return res += (char) (idx + 48);
	}

	public static long decode(String res) {
		String capitalLetter = "^[A-Z]";
		String smallLetter = "^[a-z]";
		if (res.matches(capitalLetter)) {
			return res.hashCode() - 48 - 7;
		} else if (res.matches(smallLetter)) {
			return res.hashCode() - 48 - 6 - 7;
		} else {
			return res.hashCode() - 48;
		}
	}

	public static long decoding(String res) {
		long output = 0;
		for (int i = res.length(); i > 0; i--) {
			if (i == res.length())
				output += decode(res.substring(i - 1, i));
			else {
				output += (Math.pow(62, res.length() - i))
						* (decode(res.substring(i - 1, i)) + 1);
			}
		}
		return output;
	}
}
