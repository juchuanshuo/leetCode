package cn.com.jcs.leetCode.problem371.SumofTwoIntegers;

import java.math.BigInteger;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the
 * operator + and -.
 * 
 * Example 1:
 * 
 * Input: a = 1, b = 2 Output: 3 Example 2:
 * 
 * Input: a = -2, b = 3 Output: 1
 */
public class Solution {
	public int getSum(int a, int b) {
		if (b < 0) {
			for (int i = 0; i > b; i--) {
				a--;
			}
		}
		for (int i = 0; i < b; i++) {
			a++;
		}
		return a;
	}
}