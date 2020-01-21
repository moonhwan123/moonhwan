package jslhrd3;

/*
[중첩클래스(내부클래스,InnerClass)]
클래스안에 또다른 클래스가 존재 하는 것
상속과는 다른 개념이다.
내부클래스에서 외부 클래스의 멤버에 쉽게 접근
코드의 복잡성이 감소 , 클래스 관리의 용이성

1. 중첩(내부,Inner)클래스 
2. 정적 중첩
3. 지역 중첩
4. 익명 중첩


 */

/*
[1. 중첩클래스]
 */
class Outer{ // 클래스를 만드는건 어렵지 않지만 객체가 어떻게 생성되는지 알아보자
	private int x = 10;
	int y = 20;
	
	void disp() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	class Inner{
		int a = 100;
		void disp_in() {
			System.out.println("x = "+x); // 위에서private로 선언 했지만 사용할수 있음
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
	}
}



public class Exam_01 {
	public static void main(String[] args) {
		
		
		Outer ot = new Outer();
		ot.disp();
		
		System.out.println();
		
		//1번 방법
		Outer.Inner oi = ot.new Inner();
		oi.disp_in();
		
		
		System.out.println();
		//2번 방법
		Outer.Inner oi2 = new Outer().new Inner();
		oi2.disp_in(); // oi2.disp(); - 아우터 클래스의 메서드는 호출이 안된다. 
					   // 이런점 때문에 상속과는 개념이 다른것이다.
		
		
	}

}
