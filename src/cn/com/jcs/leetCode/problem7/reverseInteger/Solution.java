package cn.com.jcs.leetCode.problem7.reverseInteger;

import java.math.BigInteger;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123 Output: 321 Example 2:
 * 
 * Input: -123 Output: -321 Example 3:
 * 
 * Input: 120 Output: 21 Note: Assume we are dealing with an environment which
 * could only store integers within the 32-bit signed integer range: [−2^31,
 * 2^31 − 1]. For the purpose of this problem, assume that your function returns
 * 0 when the reversed integer overflows.
 */
public class Solution {
	public int reverse(int x) {
		String xString = String.valueOf(x);
		long result = 0l;
		boolean isMinus = false;
		if (xString.contains("-")) {
			xString = xString.replace("-", "");
			isMinus = true;
		}

		StringBuffer buffer = new StringBuffer();
		char[] cha = xString.toCharArray();
		for (int i = xString.length() - 1; i >= 0; i--) {
			buffer.append(cha[i]);
		}
		String parseString = buffer.toString();
		if (isMinus) {
			parseString = "-" + parseString;
		}
		result = Long.parseLong(parseString);
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			result = 0;
		}
		return (int) result;
	}
}
