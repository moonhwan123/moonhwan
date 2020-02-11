package test01;
/*
[오버라이딩]

 메소드명이 동일한 경우 자기것이 우선임
 "상속"받은 메서드를 "재정의" 하는것 - 오버라이딩
 오버 로딩과 달리 매개변수를 다르게 할 수 없음
 오버라이딩을 이용한 것이 다형성

super. / super() - 조상의 변수와 메서드 

 */

class CC{
	int x = 10;
	
	void test() {
		System.out.println("x = " + x);
	}
}

class DD extends CC{
	int y = 100;
	
	void test() {
		//System.out.print("x = " + x);
		super.test();
		System.out.println("y = " + y);
	}
}


public class Exam_02 {
	public static void main(String[] args) {
		
		CC c1 = new CC();
		c1.test();
		
		System.out.println("===================");
		
		DD d1 = new DD();
		d1.test();
		
		
		
		
		
	}
}
