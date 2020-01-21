package jslhrd3;

/*
[2.정적(static)중첩 클래스]
static 멤버만 포함

 */

class Outer1{
	int x = 100;
	static int y = 200;
	
	void disp() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
	
	static class Inner1{ // static(정적) 중첩 - 정적 멤버만 포함가능
		int a = 100;
		static int b = 200;
		void disp_in() { // 일반적인 멤버는 여기서 사용 불가하다.
//			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
	}
	
	
}


public class Exam_02 {
	public static void main(String[] args) {
		Outer1 ot = new Outer1();
		
//		Outer1.Inner1 oi = ot.new Inner1(); // 정적중첩일때는 이렇게 불가
		
		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.disp_in();
		
		System.out.println();
		System.out.println("Outer1.y = "+Outer1.y); // static이 붙는 것은 객체 생성 하지 않아도 OK -> 주로 값을 공유할때
		System.out.println("Outer1.Inner1.b = "+Outer1.Inner1.b);
		
		
		
		
		
		
	}
}
