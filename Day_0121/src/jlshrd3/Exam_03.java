package jlshrd3;

/*
[3.������ø Ŭ����]
�޼ҵ� �ȿ��� ���ǵ� Ŭ����
������ġ  : �ܺ�Ŭ������ �޼��峪 �ʱ�ȭ ��
��� : ����� ���� ���ο����� ��밡��
 */

class Outer2{
	int x = 10;
	int y = 20;
	
	void disp() { // �޼��� ���� ���ǵ� Ŭ����
		class Inner2{
			int a = 100;
			int b = 200;
			
			void disp_in() {
				System.out.println("x = "+x);
				System.out.println("y = "+y);
				System.out.println("a = "+a);
				System.out.println("b = "+b);
			}
		} // Inner2 ��
		  // ���⼭ ��ü�� ���� �Ǿ���Ѵ�.
		  // ���������� ȣ�� �Ұ�
		Inner2 in2 = new Inner2();
		in2.disp_in();
	}//disp() �޼��� ��
	
	
}


public class Exam_03 {
	public static void main(String[] args) {
		
		Outer2 ot = new Outer2();
		ot.disp();
		
		
		
		
	}
}
