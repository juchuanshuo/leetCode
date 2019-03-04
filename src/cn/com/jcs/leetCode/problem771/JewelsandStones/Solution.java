package cn.com.jcs.leetCode.problem771.JewelsandStones;

import java.util.ArrayList;
import java.util.List;

/**
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have. Each character in S is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type of
 * stone from "A".
 * 
 * Example 1:
 * 
 * Input: J = "aA", S = "aAAbbbb" Output: 3 Example 2:
 * 
 * Input: J = "z", S = "ZZ" Output: 0 Note:
 * 
 * S and J will consist of letters and have length at most 50. The characters in
 * J are distinct.
 */
public class Solution {
	public int numJewelsInStones(String J, String S) {
		char[] jewels = J.toCharArray();
		char[] stones = S.toCharArray();
		List<Character> li = new ArrayList<Character>();
		for (char c : jewels) {
			li.add(c);
		}
		int result = 0;
		for (char stone : stones) {
			if (li.contains(stones)) {
				result++;
			}
		}
		return result;
	}
}