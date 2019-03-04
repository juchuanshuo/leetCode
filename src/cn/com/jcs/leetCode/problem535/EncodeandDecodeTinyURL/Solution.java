package cn.com.jcs.leetCode.problem535.EncodeandDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;

/**
 * Note: This is a companion problem to the System Design problem: Design
 * TinyURL. TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short URL such
 * as http://tinyurl.com/4e9iAk.
 * 
 * Design the encode and decode methods for the TinyURL service. There is no
 * restriction on how your encode/decode algorithm should work. You just need to
 * ensure that a URL can be encoded to a tiny URL and the tiny URL can be
 * decoded to the original URL.
 */
public class Solution {
	Map<String,String> map = new HashMap<String, String>();
	int count = 0;
	StringBuffer url = new StringBuffer("http://tinyurl.com/");
	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String shortUrl = url.append(Integer.toHexString(count)).toString();
		map.put(shortUrl, longUrl);
		count++;
		return shortUrl;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return map.get(shortUrl);
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));