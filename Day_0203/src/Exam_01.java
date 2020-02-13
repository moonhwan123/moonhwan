import java.util.ArrayList;

/*
[Collection Framework - 자바의 자료구조]

Collection 인터페이스를 상속한 인터페이스 (List,Set) , Map

List (순서가 있고, 중복 허용) - 순서가 있으므로 인덱싱이 가능
	-> ArrayList, Vector, LinkedList 
	-> ArrayList는 "동기화 지원x" , Vector는 "동기화 지원o"
	
Set (순서가 없고, 중복 불가) - 순서가 없으므로 인덱스로 접근 불가
	
Map (키<k>, 값<v>이 쌍으로 저장 / 순서가 있고, 키의 중복 불가)

	
 */

public class Exam_01 {
	public static void main(String[] args) {
		
	
		ArrayList list = new ArrayList(); // 디폴트 생성자
		
		ArrayList list2 = new ArrayList(10); // 크기 지정
		
		System.out.println("list Empty : " + list.isEmpty());
		System.out.println("list size : " + list.size());
		
		list.add("123");
		list.add(123);
		list.add(3.14);
		list.add('A'); // 뭐든지 다 저장 가능
		
		System.out.println("list Empty : " + list.isEmpty());
		System.out.println("list size : " + list.size());
		
//		String s = list.get(0); -> 오브젝트라서 스트링에 저장안됨
		String s = (String)list.get(0); // -> 그래서 이렇게 형변환을 시켜 줘야함
		int a = (int)list.get(1);
		
		System.out.println("list[0] : " + list.get(0)); // 저장된 것을 꺼내오기
		
		
		
		
		
		
	}
}

