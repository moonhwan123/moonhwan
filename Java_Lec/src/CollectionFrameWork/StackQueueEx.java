package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		
		st.push("0");
		st.push("1");
		st.push("2");
		System.out.println("= Stack =");
		System.out.println(st);
		
//		System.out.println("st.pop() = "+st.pop());
		
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		Queue q = new  LinkedList();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Queue =");
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		

	}

}
