import java.util.Scanner;

/*
1.������ ������ ���� ū�� ã��

2.������ ������ ���� ū�� ã��


 */



public class Exam_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է� �ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("����2�� �Է� �ϼ��� >> ");
		int b = sc.nextInt();
		System.out.print("����3�� �Է� �ϼ��� >> ");
		int c = sc.nextInt();
		
		
		// 1. ū�� ã�� - ���� ������ �̿�
		// ���ǿ����� (���ǽ�) ? ��:����;
		
		int max = (a>b) ? a:b;
		max = (max<c) ? c:max;
		
		System.out.println("max = " + max);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
