package InnerClass;

/*
 내부클래스의 접근제어자
 	-변수에 사용가능한 접근제어자와 동일
 	-static 클래스만 static멤버 정의 가능
 	-내부 클래스도 외부 클래스의 멤버로 간주, 동일한 접근성
 	-외부 클래스의 지역변수는 final이 붙은 상수만 접근 가능
 */

public class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; --> 에러발생
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int Lv = 0; // JDK1.8 부터는 final생략가능
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerIv;
			
			int liv3 = lv;
			int liv4 = Lv;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
