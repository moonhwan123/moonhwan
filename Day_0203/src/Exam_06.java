import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam_06 {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		
		str.add("김자바");
		str.add("홍길동");
		str.add("Java");
		str.add("1234");
		str.add("Korea");
		
		System.out.println("===정렬 전===");
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println("===정렬 후===");
		Collections.sort(str);
		for(String s : str) {
			System.out.println(s);
		}
		
		//근데 여기서 사용자 정의 클래스는 정렬이 불가 하다
		
		
		
	}
}

