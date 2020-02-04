package lotto;

import java.util.*;

/*
[Set을 이용한 로또 번호 만들기] 
 */

public class SetLotto_01 {
	public static void main(String[] args) {

		Set set = new HashSet();
		
		// for문 이용
		for(int x = 0; set.size() < 6; x++) {
			int lotto = (int)(Math.random()*45+1);
			set.add(lotto);
		}
		
		// while문 이용 (Double Wrapper클래스 사용)
		while(set.size()<6) {
			Double d = Math.random()*45+1;
			set.add(d.intValue());
		}
		
		// 1차 출력
		System.out.println(set);
		
		// 정렬 후 출력
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}
}
