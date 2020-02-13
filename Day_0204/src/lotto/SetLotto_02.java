package lotto;

import java.util.*;

/*
[Collections.shuffle(); 메서드 이용한 점수 만들기]
 */

public class SetLotto_02 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int x = 1; x < 46; x++) {
			set.add(new Integer(x));
		}
		System.out.println(set);
		
		
		List list = new ArrayList(set);
		
		Collections.shuffle(list);
		
		for(int x = 0 ; x < 6 ; x++) {
			System.out.print(list.get(x)+"\t");
		}
		
		
		
	}
}
