package test01;
/*
[상속]
상속을 받는 순간 다른 거 상속 못받음(다중 상속은 원칙적으로 불가)
Private는 상속이 불가
클래스와 클래스 간의 "상속"
<<OOO>> : 인터페이스
인터페이스와 클래스 사이에는 "구현" 한다. 라고 함
 */

class AA{
	int a = 10;
	int b = 20;
	
	private int c = 30;
	
	void print(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class BB extends AA{
	// private제외 하고 상속 받음
	int d = 100;
	
	void test() {
		System.out.println("a = " + (a+100));
		System.out.println("b = " + (b+100));
//		System.out.print("c = " + (c+100));
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA a1 = new AA();
		BB b1 = new BB();
		
		a1.print();
		b1.print();
		
		b1.test();
		
		
		
	}
}
