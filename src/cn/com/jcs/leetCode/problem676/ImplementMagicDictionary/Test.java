package cn.com.jcs.leetCode.problem676.ImplementMagicDictionary;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicDictionary m = new MagicDictionary();
		m.buildDict(new String[] { "hello", "leetcode" });
		System.out.println(m.search("leetCode"));
	}

}
