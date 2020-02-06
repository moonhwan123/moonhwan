package treeset;

import java.util.*;

/*
추가) 배열은 실제 값이 저장 되지만
          리스트(컬렉션)는 "객체"가 저장 (주소가 저장)
	

[검색기능을 강화한 컬랙션]
TresSet 

 */
public class Exam_01 {
	public static void main(String[] args) {
		
//		Set set = new HashSet();
//		set.add(10); // 실제값 10 이 아니라 오토박싱 되어서 Integer객체가 저장됨
//		set.add(new Integer(10)); // 그래서 실질적으론 이렇게 해야됨
		
		TreeSet set = new TreeSet();
		
		for(int x = 0; set.size() < 6 ; x++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		// TresSet은 자동 정렬 되어서 출력됨
		
		
		Set set2 = new HashSet();
		
		for(int x = 0; set2.size() < 6 ; x++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		System.out.println(set2);
		
		
	}
}
