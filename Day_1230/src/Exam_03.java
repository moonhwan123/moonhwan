import java.util.Scanner;

/*
Ű����� ���� 2�� �Է� �� ũ�� ���ϱ�

 */



public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է� �ϼ��� >> ");
		int num1 = sc.nextInt();
		System.out.print("����2�� �Է� �ϼ��� >> ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("����1 > ����2");
		}
		if(num1 < num2) {
			System.out.println("����1 < ����2");
		}
		if(num1 == num2) {
			System.out.println("����1 == ����2");
		}
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}
}
