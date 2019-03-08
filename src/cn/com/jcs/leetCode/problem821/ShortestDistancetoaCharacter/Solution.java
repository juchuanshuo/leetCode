package cn.com.jcs.leetCode.problem821.ShortestDistancetoaCharacter;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string S and a character C, return an array of integers representing
 * the shortest distance from the character C in the string.
 * 
 * Example 1:
 * 
 * Input: S = "loveleetcode", C = 'e' Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1,
 * 0]
 * 
 * 
 * Note:
 * 
 * S string length is in [1, 10000]. C is a single character, and guaranteed to
 * be in string S. All letters in S and C are lowercase.
 */
public class Solution {
	public int[] shortestToChar(String S, char C) {
		char[] chs = S.toCharArray();
		int[] result = new int[chs.length];
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < S.length(); i++) {
			if (chs[i] == C) {
				li.add(i);
			}
		}
		for (int i = 0; i < S.length(); i++) {
			int min = Integer.MAX_VALUE;
			for (int a : li) {
				if (Math.abs(i - a) < min) {
					min = Math.abs(i - a);
				}
			}
			result[i] = min;
		}
		return result;
	}
}