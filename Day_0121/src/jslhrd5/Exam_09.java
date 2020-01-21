package jslhrd5;
/*
hashCode();
객체를 식별하기위한 고유한 값
 */

class Student2 {
	int bun;
	String name;
	int score;

	Student2() {
	}

	Student2(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	void print() {
		System.out.print(this.bun+"\t"+this.name+"\t"+this.score+"\n");

	}
	
	@Override
	public String toString() {
		return this.bun+"\t"+this.name+"\t"+this.score+"\n";
	}
	
}

public class Exam_09 {
	public static void main(String[] args) {
		
		
		Student2 s1 = new Student2(1,"홍길동",90);
		Student2 s2 = new Student2(1,"홍길동",90);
		System.out.println(s1.toString());
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2.hashCode());
		
		String str1 = "AAA";
		String str2 = new String("AAA");
		System.out.println("str1 = "+str1.hashCode());
		System.out.println("str2 = "+str2.hashCode());
		

		
		
		
		
		
		
		
		
	}
}
