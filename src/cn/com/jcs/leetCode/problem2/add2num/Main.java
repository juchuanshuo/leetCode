package cn.com.jcs.leetCode.problem2.add2num;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("0");
		BigInteger c = new BigInteger("0");
		int count = 1;
		for (int i = 0; i < 1000; i++) {
			b = b.add(new BigInteger(i*count+""));
			count *= 10;
		}
		System.out.println(b);
		/*
		 * ListNode l3; ListNode node1 = l1, node2 = l2, node3; BigInteger val1
		 * = new BigInteger("0"); BigInteger val2 = new BigInteger("0"); int
		 * count = 1; while (node1 != null || node2 != null) { if (node1 !=
		 * null) { val1 = val1.add(new BigInteger(node1.val * count + ""));
		 * node1 = node1.next; } if (node2 != null) { val2 = val2.add(new
		 * BigInteger(node2.val * count + "")); System.out.println(val2); node2
		 * = node2.next; } count *= 10; } BigInteger val3 = val1.add(val2);
		 * BigInteger temp = val3; System.out.println(val1 + "--" + val2 + "--"
		 * + val3);
		 * 
		 * node3 = new ListNode(temp.mod(new BigInteger("10")).intValue()); l3 =
		 * node3; temp = temp.divide(new BigInteger("10")); while
		 * (temp.intValue() != 0) { int a = temp.mod(new
		 * BigInteger("10")).intValue(); node3.next = new ListNode(a); node3 =
		 * node3.next; temp = temp.divide(new BigInteger("10")); } return l3;
		 */
	}

}
