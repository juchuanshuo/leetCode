package cn.com.jcs.leetCode.problem238.ProductofArrayExceptSelf;

/**
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Example:
 * 
 * Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division
 * and in O(n).
 * 
 * Follow up: Could you solve it with constant space complexity? (The output
 * array does not count as extra space for the purpose of space complexity
 * analysis.)
 * 
 * 
 */
public class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int productAll = 1;
		int count0 = 0;
		for (int digit : nums) {
			if (digit == 0) {
				count0++;
				continue;
			}
			productAll *= digit;
		}
		if (count0 >= 2) {
			return new int[nums.length];
		}
		for (int i = 0; i < nums.length; i++) {
			if (count0 > 0 && nums[i] != 0) {
				result[i] = 0;
				continue;
			} else if (count0 > 0 && nums[i] == 0) {
				result[i] = productAll;
				continue;
			}
			result[i] = productAll / nums[i];
		}
		return result;
	}
	
}