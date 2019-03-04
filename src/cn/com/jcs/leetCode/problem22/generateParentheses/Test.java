package cn.com.jcs.leetCode.problem22.generateParentheses;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> results = new Solution().generateParenthesis(3);
		for (String s : results)
			System.out.println(s);
	}

}
