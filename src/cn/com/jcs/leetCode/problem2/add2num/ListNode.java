package cn.com.jcs.leetCode.problem2.add2num;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
	
	public boolean hasNext() {
		if(this.next != null) {
			return true;
		} else {
			return false;
		}
	}
}