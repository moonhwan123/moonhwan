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
		Super ss = new Child(); // ������ �ڽ��� ����ų�� �ִ�. ������ �����ذſ� ���ؼ� ��밡��
								// ��ü�� child�� ������ ������ ss�� ���ٱ����� ������ ������ذŸ� ����
		
		ss.x = 10;
//		System.out.println("y = " + ss.y);
		
//		Child cc = new Super();		
	}
}
