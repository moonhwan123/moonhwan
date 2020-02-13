import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("Jsp");
		set.add("Servlet");
		set.add("Container");
		set.add("Content");
		System.out.println("1 : " + set);
		
		List list = new ArrayList(set);
		
		System.out.println("2 : " + list);
		System.out.println("3 : " + list.get(2));
		
		Collections.sort(list); // 기본자료형과 문자열만 가능
		System.out.println("4 : " + list);
		
		
		
	}
}
