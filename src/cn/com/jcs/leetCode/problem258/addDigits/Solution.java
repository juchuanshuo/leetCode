package cn.com.jcs.leetCode.problem258.addDigits;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * Example:
 * 
 * Input: 38 Output: 2 Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it. Follow up: Could you do it without any
 * loop/recursion in O(1) runtime?
 */
public class Solution {
	/*
	 * public int addDigits(int num) { while (num / 10 != 0) { int temp = 0; for
	 * (char s : String.valueOf(num).toCharArray()) { temp +=
	 * Integer.parseInt(s+""); } num = temp; } return num; }
	 */
	public int addDigits(int num) {
		if (num / 10 == 0) {
			
		}
		return num;
	}
}