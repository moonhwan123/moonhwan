package InnerClass;


/*
[내부 클래스 (Inner Class)]
	-클래스 안에 선언된 클래스
	-특정 클래스에서만 주로 사용되는 클래스
	-GUI(AWT,SWING)의 이벤트 처리 시
	
	-장점
		1. 내부클래스에서 외부 클래스의 멤버에 쉽게 접근
		2. 코드의 복잡성이 감소
	
	-내부클래스의 종류와 특징
		변수의 선언위치에 따른 종류와 동일(유효범위와 성질도 유사)
		
		1. 인스턴스 클래스
			선언위치 : 외부클래스의 멤버 변수
			사용 : 외부클래스의 인스턴스 멤버 처럼 활용, 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용
		2. static 클래스
			선언위치 : 외부클래스의 멤버 변수
			사용 : 외부클래스의 static멤버 처럼 사용
		3. local 클래스
			선언위치  : 외부클래스의 메서드나 초기화 블럭
			사용 : 선언된 영역 내부에서만 사용가능
		4. 익명 클래스
			특징 : 클래스의 선언, 객체의 생성을 동시에 하는 이름 없는 클래스(일회성)
			
		
 */

public class InnerEx {
	
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;  --> 에러 발생 static변수 선언 X
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{ // 메서드 안의 클래스
			int iv = 300;
//			static int cv = 300;  --> 에러 발생 static변수 선언 X
			final static int CONST = 300;
		}
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		

	}

}
