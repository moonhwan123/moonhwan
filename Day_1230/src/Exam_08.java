import java.util.Scanner;

/*
1.������ ������ ���� ū�� ã��

2.������ ������ ���� ū�� ã��


 */



public class Exam_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է� �ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("����2�� �Է� �ϼ��� >> ");
		int b = sc.nextInt();
		System.out.print("����3�� �Է� �ϼ��� >> ");
		int c = sc.nextInt();
		
		
		// 1. ū�� ã��
		int max = 0;
		
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else { // a<b
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		
		System.out.println("max = " + max);
		
		// 2. ������ ã��
		int min = 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
