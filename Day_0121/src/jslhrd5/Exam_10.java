package jslhrd5;

/*
clone�� ������ ���
��ǥ������ �迭,�÷���(java.util�ȿ� �ִ� ���)
 */

public class Exam_10 {
	public static void main(String[] args) {
		

		int a[] = {10,20,30,40,50};
		int b[] = a; // �ּҸ� �����Ѵ�. �ᱹ a[] , b[]�� ���� �ּҸ� ����Ű�� ����
		int c[] = a.clone(); // '��'�� ���簡 �ǰ�, �ּҴ� ������ �ȵ�
	
		b[0] = 77;
		c[1] = 99;
		
		System.out.println("a[] - ����");
		for(int x = 0 ; x < a.length; x++) {
 			System.out.print(a[x]+"\t");
		}
		System.out.println();
		
		System.out.println("b[] - a[]�� �ּҺ���");
		for(int x = 0 ; x < a.length; x++) {
 			System.out.print(b[x]+"\t");
		}
		System.out.println();
		
		System.out.println("c[] - a[]�� Ŭ��");
		for(int x = 0 ; x < a.length; x++) {
 			System.out.print(c[x]+"\t");
		}
		
	}
}
