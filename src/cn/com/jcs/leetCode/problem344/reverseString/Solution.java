package cn.com.jcs.leetCode.problem344.reverseString;

/**
 * Input: "hello" Output: "olleh" Example 2:
 * 
 * Input: "A man, a plan, a canal: Panama" Output: "amanaP :lanac a ,nalp a ,nam
 * A"
 */
public class Solution {
	public String reverseString(String s) {
		StringBuffer result = new StringBuffer();
		char[] cha = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			result.append(cha[i]);
		}
		return result.toString();
	}
}