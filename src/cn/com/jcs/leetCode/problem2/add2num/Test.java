package cn.com.jcs.leetCode.problem2.add2num;

public class Test {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub ListNode start = new ListNode(10);
		 * ListNode node = start; ListNode temp = new ListNode(9); node.next =
		 * temp; node = node.next; node.next = temp; temp = new ListNode(8);
		 * node = node.next; node.next = temp; temp = new ListNode(7); node =
		 * node.next; node.next = temp; temp = new ListNode(6); node =
		 * node.next; node.next = temp; temp = new ListNode(5); node =
		 * node.next; node.next = temp; temp = new ListNode(4); node =
		 * node.next; node.next = temp; temp = new ListNode(3); node =
		 * node.next; node.next = temp; temp = new ListNode(2); node =
		 * node.next; node.next = temp; temp = new ListNode(1); node =
		 * node.next; node.next = temp; System.out.println(start.val); while
		 * (start.hasNext()) { start = start.next;
		 * System.out.println(start.val); }
		 */

		ListNode l1 = new ListNode(7);
		ListNode node1 = l1;
		ListNode temp1 = new ListNode(9);
		node1.next = temp1;
		node1 = node1.next;
		node1.next = temp1;
		temp1 = new ListNode(8);
		node1 = node1.next;
		node1.next = temp1;
		temp1 = new ListNode(7);
		node1 = node1.next;
		node1.next = temp1;

		ListNode l2 = new ListNode(7);
		ListNode node21 = l2;
		ListNode temp21 = new ListNode(9);
		node21.next = temp21;
		node21 = node21.next;
		node21.next = temp21;
		temp21 = new ListNode(8);
		node21 = node21.next;
		node21.next = temp21;
		temp21 = new ListNode(7);
		node21 = node21.next;
		node21.next = temp21;

		ListNode l3;
		ListNode node11 = l1, node2 = l2, node3;
		int val = (node11.val + node2.val) >= 10 ? (node11.val + node2.val) - 10 : (node11.val + node2.val);
		node3 = new ListNode(val);
		l3 = node3;
		while (node11.next != null) {
			node11 = node11.next;
			node2 = node2.next;
			val = (node11.val + node2.val) >= 10 ? (node11.val + node2.val) - 10 : (node11.val + node2.val);
			node3.next = new ListNode(val);
			node3 = node3.next;
		}
		System.out.println(l3.val);
		while (l3.hasNext()) {
			l3 = l3.next;
			System.out.println(l3.val);
		}
	}

}
