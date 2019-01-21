package cn.com.jcs.leetCode.problem11.containerWithMostWater;

/**
 * 
 * @author jcs
 * @date 2019年1月10日-下午2:07:00
 * 
 *       Given n non-negative integers a1, a2, ..., an , where each represents a
 *       point at coordinate (i, ai). n vertical lines are drawn such that the
 *       two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which
 *       together with x-axis forms a container, such that the container
 *       contains the most water.
 * 
 *       Note: You may not slant the container and n is at least 2.
 * 
 *       Example: Input: [1,8,6,2,5,4,8,3,7] Output: 49
 */
public class Solution {
	public int maxArea(int[] height) {
		int max = 0;
		for (int x1 = 1; x1 < height.length; x1++) {
			for (int x2 = x1 + 1; x2 <= height.length; x2++) {
				int y = (height[x1 - 1] - height[x2 - 1]) > 0 ? height[x2 - 1] : height[x1 - 1];
				if ((x2-x1)*y>max) {
					max = (x2-x1)*y;
				}
			}
		}
		return max;
	}
}