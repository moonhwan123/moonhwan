import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
[Set 인터페이스] : 순서가 없고, 중복도 불가

- 구현된 클래스 : HashSet


 */


public class Exam_02 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("TomCat");
		set.add("Java"); // Java가 두개 지만 하나밖에 출력 안됨
		set.add("Python");
		
		System.out.println(set);
		System.out.println(set.size()); // 중복하나가 제거 되어서 6이아닌 5가 찍힌다.
		
		
		List list = new ArrayList();
		
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("TomCat");
		list.add("Java");
		list.add("Python");
		
		System.out.println(list);
		
		
		
		
		
	}
}
