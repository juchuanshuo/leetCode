package cn.com.jcs.leetCode.problem557.reverseWordsInAStringIII;

/**
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1: Input: "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL
 * tsetnoc" Note: In the string, each word is separated by single space and
 * there will not be any extra space in the string.
 */
public class Solution {
	public String reverseWords(String s) {
		String[] split = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String sp : split) {
			StringBuffer temp = new StringBuffer();
			char[] cha = sp.toCharArray();
			for (int i = sp.length() - 1; i >= 0; i--) {
				temp.append(cha[i]);
			}
			sb.append(temp.toString()+" ");
		}
		return sb.toString().substring(0, sb.length()-1);
	}
}