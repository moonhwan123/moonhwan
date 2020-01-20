package test02;
/*
[인터페이스(interface,명세서)]
상수, 추상메소드 만 있다. -> 순수하게 기능만을 가지고있다.
개발코드 인터페이스 객체
다중상속을 위해서 사용


 */

interface Car{
	static final int MAX = 100;
	void test();
	int sum(int x, int y);
	//앞에 abstract 안붙여도 된다.
}

//인터페이스 구현
class Truck implements Car{
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

public class Exam_12 {
	public static void main(String[] args) {

		
		
		
		
		
	}
}
