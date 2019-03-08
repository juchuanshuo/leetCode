package cn.com.jcs.leetCode.problem905.SortArrayByParity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [3,1,2,4] Output: [2,4,3,1] The outputs [4,2,3,1], [2,4,1,3], and
 * [4,2,1,3] would also be accepted.
 * 
 * 
 * Note:
 * 
 * 1 <= A.length <= 5000 0 <= A[i] <= 5000
 */
public class Solution {
	public int[] sortArrayByParity(int[] A) {
		Arrays.sort(A);
		List<Integer> single = new ArrayList<Integer>();
		List<Integer> doubl = new ArrayList<Integer>();
		for (int a : A) {
			if (a % 2 == 0) {
				doubl.add(a);
			} else {
				single.add(a);
			}
		}
		int count = 0;
		for (int a : doubl) {
			A[count] = a;
			count++;
		}
		for (int a : single) {
			A[count] = a;
			count++;
		}
		return A;
	}
}