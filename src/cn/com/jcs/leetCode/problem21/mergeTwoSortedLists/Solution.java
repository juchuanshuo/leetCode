package cn.com.jcs.leetCode.problem21.mergeTwoSortedLists;

/**
 * 
 * @author jcs
 * @date 2019年1月14日-上午10:10:51
 * 
 * 
 *       Merge two sorted linked lists and return it as a new list. The new list
 *       should be made by splicing together the nodes of the first two lists.
 * 
 *       Example:
 * 
 *       Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4 Definition for
 *       singly-linked list. public class ListNode { int val; ListNode next;
 *       ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val > l2.val) {
			result = l2;
			l2 = l2.next;
		} else {
			result = l1;
			l1 = l1.next;
		}
		ListNode resultStart = result;
		boolean l1Bigger = false;
		while (l1 != null || l2 != null) {
			if (l1 == null && l2 != null) {
				result.next = l2;
				break;
			}
			if (l1 != null && l2 == null) {
				result.next = l1;
				break;
			}
			l1Bigger = l1.val > l2.val;
			if (l1Bigger) {
				result.next = l2;
				l2 = l2.next;
				result = result.next;
			} else {
				result.next = l1;
				l1 = l1.next;
				result = result.next;
			}
		}
		return resultStart;
	}
}