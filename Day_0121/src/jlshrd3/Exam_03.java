package jlshrd3;

/*
[3.지역중첩 클래스]
메소드 안에서 정의된 클래스
선언위치  : 외부클래스의 메서드나 초기화 블럭
사용 : 선언된 영역 내부에서만 사용가능
 */

class Outer2{
	int x = 10;
	int y = 20;
	
	void disp() { // 메서드 내에 정의된 클래스
		class Inner2{
			int a = 100;
			int b = 200;
			
			void disp_in() {
				System.out.println("x = "+x);
				System.out.println("y = "+y);
				System.out.println("a = "+a);
				System.out.println("b = "+b);
			}
		} // Inner2 끝
		  // 여기서 객체가 생성 되어야한다.
		  // 독자적으로 호출 불가
		Inner2 in2 = new Inner2();
		in2.disp_in();
	}//disp() 메서드 끝
	
	
}


public class Exam_03 {
	public static void main(String[] args) {
		
		Outer2 ot = new Outer2();
		ot.disp();
		
		
		
		
	}
}
