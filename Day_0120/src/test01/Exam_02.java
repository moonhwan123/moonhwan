package test01;
/*
[�������̵�]

 �޼ҵ���� ������ ��� �ڱ���� �켱��
 "���"���� �޼��带 "������" �ϴ°� - �������̵�
 ���� �ε��� �޸� �Ű������� �ٸ��� �� �� ����
 �������̵��� �̿��� ���� ������

super. / super() - ������ ������ �޼��� 

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
