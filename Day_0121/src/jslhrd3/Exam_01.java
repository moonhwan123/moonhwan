package jslhrd3;

/*
[��øŬ����(����Ŭ����,InnerClass)]
Ŭ�����ȿ� �Ǵٸ� Ŭ������ ���� �ϴ� ��
��Ӱ��� �ٸ� �����̴�.
����Ŭ�������� �ܺ� Ŭ������ ����� ���� ����
�ڵ��� ���⼺�� ���� , Ŭ���� ������ ���̼�

1. ��ø(����,Inner)Ŭ���� 
2. ���� ��ø
3. ���� ��ø
4. �͸� ��ø


 */

/*
[1. ��øŬ����]
 */
class Outer{ // Ŭ������ ����°� ����� ������ ��ü�� ��� �����Ǵ��� �˾ƺ���
	private int x = 10;
	int y = 20;
	
	void disp() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
	class Inner{
		int a = 100;
		void disp_in() {
			System.out.println("x = "+x); // ������private�� ���� ������ ����Ҽ� ����
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
	}
}



public class Exam_01 {
	public static void main(String[] args) {
		
		
		Outer ot = new Outer();
		ot.disp();
		
		System.out.println();
		
		//1�� ���
		Outer.Inner oi = ot.new Inner();
		oi.disp_in();
		
		
		System.out.println();
		//2�� ���
		Outer.Inner oi2 = new Outer().new Inner();
		oi2.disp_in(); // oi2.disp(); - �ƿ��� Ŭ������ �޼���� ȣ���� �ȵȴ�. 
					   // �̷��� ������ ��Ӱ��� ������ �ٸ����̴�.
		
		
	}

}
