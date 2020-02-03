package jslhrd5;

class Student{
	int bun;
	String name;
	int score;
	
	Student(){}
	
	Student(int bun, String name, int score){
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Student) {
			return bun == ((Student)obj).bun  &&  ((Student)obj).name.equals(name);
			
		}else {
			return false;
		}
	}
	
}


public class Exam_08 {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"홍길동",90);
		Student s2 = new Student(2,"김자바",80);
		
		if(s1.equals(s2)) {
			System.out.println("s1,s2는 같은 학생입니다.");
		}else {
			System.out.println("s1,s2는 다른 학생입니다.");
		}
		
	}
}
