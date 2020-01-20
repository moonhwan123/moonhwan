package test01;

class A{
	
}
class B extends A{
	
}



public class Exam_07 {
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B(); // 조상클래스가 자식 객체를 가리킴
//		B b1 = new A();
//		B b1 = (B)a1;
		
		B b3 = new B();
		A a3 = b3;
		B b4 = (B)a3;
		
	}
}
