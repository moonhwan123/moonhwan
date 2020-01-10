/*
메소드 - 일종의 심부름꾼
[메소드 정의] 
접근제어자   리턴타입   메소드명(매개변수){
	여기서 계산작업
}

접근제어자 - 누가 심부름을 시키는가 메소드를 호출할수 있는 권한 설정
		- public / private
		- 아무것도 안씀 : 동일한 공간
		
리턴타입 - 결과값

 */

/*
1. 메소드(함수) 사용법

 */


public class Exam_01 {
	
	// 1. 리턴 타입x(void), 매개변수x(괄호안에 아무것도x)
	static void printA() {
		System.out.println("Method test");
	}
	//이렇게 만든 메소드는 다른 메소드 또는 자기자신이 호출 한다.
	
	
	public static void main(String[] args) {
		//                    자료형       변수
		// main메소드 
		// void -> 리턴 타입 없음
		
		System.out.println("Method Call test Start");
		printA();
		System.out.println("Method Call test End");
		
		
		
	}
}
