package cn.com.jcs.leetCode.problem2.add2num;

import java.math.BigInteger;

/**
 * You are given two non-empty linked lists representing two non-negative
 * longegers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
 * 465 = 807. Definition for singly-linked list. public class ListNode { long
 * val; ListNode next; ListNode(long x) { val = x; } }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3;
		ListNode node1 = l1, node2 = l2, node3;
		BigInteger val1 = new BigInteger("0");
		BigInteger val2 = new BigInteger("0");
		BigInteger count = new BigInteger("1");
		while (node1 != null || node2 != null) {
			if (node1 != null) {
				val1 = val1.add(count.multiply(new BigInteger(node1.val+"")));
				node1 = node1.next;
			}
			if (node2 != null) {
				val2 = val2.add(count.multiply(new BigInteger(node2.val+"")));
				node2 = node2.next;
			}
			count = count.multiply(new BigInteger("10"));
		}
		BigInteger val3 = val1.add(val2);
		BigInteger temp = val3;
		node3 = new ListNode(temp.mod(new BigInteger("10")).intValue());
		l3 = node3;
		temp = temp.divide(new BigInteger("10"));
		while (!"0".equals(temp.toString())) {
			int a = temp.mod(new BigInteger("10")).intValue();
			node3.next = new ListNode(a);
			node3 = node3.next;
			temp = temp.divide(new BigInteger("10"));
		}
		return l3;
	}
}
