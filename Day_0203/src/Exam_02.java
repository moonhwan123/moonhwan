import java.util.List;
import java.util.ArrayList;

/*
set , indexOf , contains , get , size , add 
List중에서 가장 많이 쓰는 메서드들
 */

public class Exam_02 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
//		list.add(1234);  String 전용이라 정수는 안들어감
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Program");
		
		String str = list.get(0); // <String>지정 해주었기 때문에 가능하다.
		
		for(int x = 0; x< list.size(); x++) {
			System.out.println(list.get(x));
		}
//		System.out.println(list);
		
		boolean bool = list.contains("C++");
		System.out.println("list에 C++을 포함 하고 있는가 >> "+bool);
		
		int index = list.indexOf("C++");
		System.out.println("C++의 인덱스 값 >> "+index);
		
		list.set(0, "김길동");
		System.out.println("list.set(0, \"김길동\") >> "+list.get(0));
		
		
		//set , indexOf , contains , get , size , add 
		//가장 많이 쓰는 메서드들
		
		
	}
}
