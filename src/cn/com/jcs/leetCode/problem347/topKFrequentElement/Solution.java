package cn.com.jcs.leetCode.problem347.topKFrequentElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2] Example 2:
 * 
 * Input: nums = [1], k = 1 Output: [1] Note:
 * 
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements. Your
 * algorithm's time complexity must be better than O(n log n), where n is the
 * array's size.
 * 
 */
public class Solution {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Arrays.sort(nums);
		List<Integer> result = new ArrayList<>();
		if (nums.length == 1) {
			result.add(nums[0]);
			return result;
		}
		Map<Integer, Integer> re = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				count += 1;
				continue;
			}
			if (nums[i] != nums[i - 1]) {
				re.put(nums[i - 1], count);
				count = 1;
				if (i == (nums.length - 1)) {
					re.put(nums[i], count);
				}
				continue;
			}
			count++;
			if (i == (nums.length - 1)) {
				re.put(nums[i], count);
			}
		}
		int[] temp = new int[re.size()];
		for (int a : re.values()) {
			
		}
		return result;
	}
}