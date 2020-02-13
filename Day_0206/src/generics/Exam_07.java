package generics;

import java.util.*;

class Box2<T>{
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		
		Box2<String> box = new Box2<String>();
		
		box.set("홍길동");
		String name = box.get();
		
		Box2<Integer> box2 = new Box2<Integer>();
		
		box2.set(1);
		int age = box2.get();
		
		
		
		
	}
}
