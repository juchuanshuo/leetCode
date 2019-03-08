package cn.com.jcs.leetCode.problem884.uncommonWordsFromTwoSentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * We are given two sentences A and B. (A sentence is a string of space
 * separated words. Each word consists only of lowercase letters.)
 * 
 * A word is uncommon if it appears exactly once in one of the sentences, and
 * does not appear in the other sentence.
 * 
 * Return a list of all uncommon words.
 * 
 * You may return the list in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: A = "this apple is sweet", B = "this apple is sour" Output:
 * ["sweet","sour"] Example 2:
 * 
 * Input: A = "apple apple", B = "banana" Output: ["banana"]
 * 
 * 
 * Note:
 * 
 * 0 <= A.length <= 200 0 <= B.length <= 200 A and B both contain only spaces
 * and lowercase letters.
 */
public class Solution {
	public String[] uncommonFromSentences(String A, String B) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		String[] str1 = A.split(" ");
		String[] str2 = B.split(" ");
		for (String s : str1) {
			map1.put(s, map1.get(s) == null ? 1 : map1.get(s) + 1);
		}
		for (String s : str2) {
			map2.put(s, map2.get(s) == null ? 1 : map2.get(s) + 1);
		}
		List<String> result = new ArrayList<String>();
		for (String s : map1.keySet()) {
			if (map1.get(s) == 1 && map2.get(s) == null) {
				result.add(s);
			}
		}
		for (String s : map2.keySet()) {
			if (map2.get(s) == 1 && map1.get(s) == null) {
				result.add(s);
			}
		}
		String[] result2 = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			result2[i] = result.get(i);
		}
		return result2;
	}
}