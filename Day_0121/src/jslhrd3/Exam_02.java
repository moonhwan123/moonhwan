package jslhrd3;

/*
[2.����(static)��ø Ŭ����]
static ����� ����

 */

class Outer1{
	int x = 100;
	static int y = 200;
	
	void disp() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
	
	static class Inner1{ // static(����) ��ø - ���� ����� ���԰���
		int a = 100;
		static int b = 200;
		void disp_in() { // �Ϲ����� ����� ���⼭ ��� �Ұ��ϴ�.
//			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
	}
	
	
}


public class Exam_02 {
	public static void main(String[] args) {
		Outer1 ot = new Outer1();
		
//		Outer1.Inner1 oi = ot.new Inner1(); // ������ø�϶��� �̷��� �Ұ�
		
		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.disp_in();
		
		System.out.println();
		System.out.println("Outer1.y = "+Outer1.y); // static�� �ٴ� ���� ��ü ���� ���� �ʾƵ� OK -> �ַ� ���� �����Ҷ�
		System.out.println("Outer1.Inner1.b = "+Outer1.Inner1.b);
		
		
		
		
		
		
	}
}
