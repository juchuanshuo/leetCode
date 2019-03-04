package cn.com.jcs.leetCode.problem476.numberComplement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		for (int i = 0; i < Integer.toBinaryString(a).length(); i++) {
			b += Math.pow(2, i);
		}
		System.out.println(b);
		System.out.println(a^b);
	}

}
