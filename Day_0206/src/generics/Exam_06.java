package generics;

import java.util.*;

class Box{
	private Object obj;
	
	public void set(Object o) {
		obj = o;
	}
	
	public Object get() {
		return obj;
	}
	
}

class Apple{
	
}

public class Exam_06 {
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple ap = (Apple)box.get();
		
		
		
		
	}
}
