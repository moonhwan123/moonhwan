package test01;
/*
[���]
����� �޴� ���� �ٸ� �� ��� ������(���� ����� ��Ģ������ �Ұ�)
Private�� ����� �Ұ�
Ŭ������ Ŭ���� ���� "���"
<<OOO>> : �������̽�
�������̽��� Ŭ���� ���̿��� "����" �Ѵ�. ��� ��
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
	// private���� �ϰ� ��� ����
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
