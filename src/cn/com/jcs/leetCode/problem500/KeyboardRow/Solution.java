package cn.com.jcs.leetCode.problem500.KeyboardRow;

/**
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * Example:
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"] Output: ["Alaska", "Dad"]
 */
public class Solution {
	public String[] findWords(String[] words) {
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";
		String[] result = new String[words.length];
		int count = 0;
		for (String word : words) {
			String lowword = word.toLowerCase();
			char[] chs = lowword.toCharArray();
			char first = lowword.charAt(0);
			String firstInrow = "";
			if (row1.indexOf(first) > -1) {
				firstInrow = row1;
			} else if (row2.indexOf(first) > -1) {
				firstInrow = row2;
			} else {
				firstInrow = row3;
			}
			boolean allInOne = true;
			for (char ch : chs) {
				if (firstInrow.indexOf(ch) <= -1) {
					allInOne = false;
				}
			}
			if (allInOne) {
				result[count] = word;
				count++;
			}
		}
		return result;
	}
}