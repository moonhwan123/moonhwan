import java.util.*;

/*
[Stack]
 */

public class Exam_06 {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("AAAA");
		s.push("BBBB");
		s.push("CCCC");
		s.push("DDDD");
		System.out.println(s);
		System.out.println(s.pop() + "�� pop�Ѵ�.");
		System.out.println(s.peek()+ "�� peek�Ѵ�.");
		System.out.println(s);
		
		
		
	}
}
