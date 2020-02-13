import java.util.*;

/*
[Set을 출력하는 여러가지 방법들]
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("123");
		set.add("AAAA");
		set.add("CCCC");
		
		// 1) '확장 for문'을 이용한 출력
		for(String str : set) {
			System.out.println(str);
		}
		
		// 2) Iterator로 변환하여 원하는 값 삭제 
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("AAAA")) {
				iter.remove();
			}
		}
		
		for(String str : set) {
			System.out.println(str);
		}
		
		
		
	}
}
