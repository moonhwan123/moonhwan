/*
[�޼ҵ� ȣ�� ���]
1. ���� ���� ȣ��


 */
public class Exam_06 {
	public static void main(String[] args) {
		
		System.out.println("--------��ȯ��---------");
		int a = 10, b = 20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		// a, b ��ȯ 
		System.out.println("--------��ȯ��---------");
		swap(a,b); // �� �ȹٲ���? ->  ���� ���� ȣ���̴� �̰�, a��b ��°�� �Ѿ� ���°� �ƴϰ�
		           //              a�ǰ�,b�ǰ��� �Ѿ� ����

		
/*		
		int c = a;
		a = b;
		b = c;
*/
		System.out.println("a = "+a);
		System.out.println("b = "+b);		

	}
	
	static void swap(int x,int y) { // �������� ȣ��
		int c = x;
		x = y;
		y = c;
	}
	

}
