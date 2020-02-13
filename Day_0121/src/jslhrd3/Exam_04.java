package jslhrd3;
/*
[4. 익명중첩 클래스]

특징 : 클래스의 선언, 객체의 생성을 동시에 하는 이름 없는 클래스(일회성)
            기존 클래스의 특정 메소드를 오버라이딩 하여 사용하는 방식
            오버라이딩이 목적이라 익명 구현할때 새로운 메소드는 생성 불가

 */

class Inner4{
	void aaa() {
		System.out.println("aaaaaa");
	}
	void bbb() {
		System.out.println("bbbbbb");
	}
}

public class Exam_04 {
	
	public static void main(String[] args) {
		
		Inner4 in4 = new Inner4();
		
		in4.aaa();
		in4.bbb();
		System.out.println("=========익명중첩 실시==========");
		//인터페이스의 익명구현과 동일
		Inner4 in = new Inner4(){
			void aaa() {
				System.out.println("aaaaaa가 익명 중첩 되었습니다.");
			}
		};
		
		in.aaa();
		in.bbb();
		
	}
	
}
