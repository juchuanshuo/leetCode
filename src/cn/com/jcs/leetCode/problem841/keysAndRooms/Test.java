package cn.com.jcs.leetCode.problem841.keysAndRooms;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> rooms = new ArrayList<>();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		a.add(1);
		b.add(2);
		c.add(3);
//		rooms.add(a);
//		rooms.add(b);
//		rooms.add(c);
		rooms.add(d);
		System.out.println(new Solution().canVisitAllRooms(rooms));
	}

}
