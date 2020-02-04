import java.util.*;

/*
[Queue]
 */
public class Exam_07 {
	public static void main(String[] args) {
		
		Queue que = new LinkedList();
		
		que.offer("AAAA");
		que.offer("BBBB");
		que.offer("CCCC");
		que.offer("DDDD");
		
		System.out.println(que.poll());
		System.out.println(que);
		
		
		
		
	}
}
