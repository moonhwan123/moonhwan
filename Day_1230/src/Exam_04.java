import java.util.Scanner;

/*
���� 2�� �Է� �� 
�� ���� ���̰� 10 �̻� �̸� 
ū���� -5 ���� ���� +5
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է� �ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("����2�� �Է� �ϼ��� >> ");
		int b = sc.nextInt();
		
		// �Ʒ��� �� ���� ���� ��� ( ū ������ ���� �� ���� ) 
		
		int c = 0;
		
		if(a>=b) {
			c = a-b;
		}
		if(a<b) {
			c = b-a;
		}
		
		// ���̰� 10 �̻����� ���� �Ǵ�
		
		if(c>=10) {
			if(a>=b) {
				a = a-5;
				b = b+5;
			}
			if(a<b) {
				a = a+5;
				b = b-5;
			}
		}
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		sc.close();
		
		
	}
}
