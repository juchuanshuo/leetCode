package cn.com.jcs.leetCode.problem260.SingleNumberIII;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of numbers nums, in which exactly two elements appear only
 * once and all the other elements appear exactly twice. Find the two elements
 * that appear only once.
 * 
 * Example:
 * 
 * Input: [1,2,1,3,2,5] Output: [3,5] Note:
 * 
 * The order of the result is not important. So in the above example, [5, 3] is
 * also correct. Your algorithm should run in linear runtime complexity. Could
 * you implement it using only constant space complexity?
 */
public class Solution {
	public int[] singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			if (!set.add(num)) {
				set.remove(new Integer(num));
			}
		}
		int[] result = new int[2];
		int count = 0;
		for (int num : set) {
			result[count] = num;
			count++;
		}
		return result;
	}
}