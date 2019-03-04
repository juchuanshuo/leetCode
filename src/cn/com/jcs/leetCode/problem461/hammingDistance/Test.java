package cn.com.jcs.leetCode.problem461.hammingDistance;

import java.nio.channels.spi.AbstractSelectionKey;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100, y = 1090;
		int a = x^y;
		int c = Integer.bitCount(a);
		System.out.println(c);
	}

}
