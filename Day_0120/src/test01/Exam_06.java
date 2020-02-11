package test01;

class Super {
	int x = 100;
	void aa() {
		System.out.println("x = " + x);
	}
}

class Child extends Super {
	int y = 200;
	void aa() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	void bb() {
		System.out.println("x = " + x);
	}
}

class ChildA extends Super {
	int y = 300;
	
}

public class Exam_06 {
	public static void main(String[] args) {

		Super s = new Super();
		s.aa();
		System.out.println();
		
		Child c = new Child();
		c.aa();
		c.bb();
		
		System.out.println("===================");
		Super ss = new Child(); // 조상은 자식을 가리킬수 있다. 본인이 물려준거에 한해서 사용가능
								// 객체는 child가 생성이 되지만 ss는 접근권한이 본인이 상속해준거만 가능
		
		ss.x = 10;
//		System.out.println("y = " + ss.y);
		
//		Child cc = new Super();		
	}
}
