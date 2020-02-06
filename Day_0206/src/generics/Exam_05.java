package generics;

import java.util.*;

/*
[지네릭]
- 다양한 타입의 객체를 다루는 메소드나 클래스에 
    컴파일 시의 타입 체크를 해주는 기능
    
    강제로 형변환을 해주지 않아도됨


    
*/


public class Exam_05 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("홍길동");
		list.add(100);
		
		//generic타입을 안쓰면 이렇게 형 변환을 해줘야함
		String name = (String)list.get(0);
		int score = (int)list.get(1);
		
		//이렇게 하면 형변환이 필요 없어짐
		List<String> list2 = new ArrayList<String>();
		
		String name2 = list2.get(0);
		
		
		
	}
}
