package cn.com.jcs.leetCode.problem136.singleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * Input: [2,2,1] Output: 1 Example 2:
 * 
 * Input: [4,1,2,1,2] Output: 4
 */

public class Solution {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i += 2) {
			if (i == nums.length - 1) {
				result = nums[i];
				break;
			}
			if (nums[i] != nums[i + 1]) {
				result = nums[i];
				break;
			}
		}
		return result;
	}
}