import java.util.Scanner;

/*
������ ������ �߰� ���� ã��
max , min �̷� ���� ���x
 */



public class Exam_13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է� �ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("����2�� �Է� �ϼ��� >> ");
		int b = sc.nextInt();
		System.out.print("����3�� �Է� �ϼ��� >> ");
		int c = sc.nextInt();
		
		int mid = 0;
		
		if(a>b) {
			if(b>c) {
				mid = b;
			}else { // b<c
				if(a>c) {
					mid = c;
				}else { // a<c
					mid = a;
				}
					
			}
		}else { // a<b
			if(a>c) {
				mid = a;
			}else { // a<c
				if(b<c) {
					mid = b;
				}else { // b>c
					mid = c;
				}
			}
				
		}
		
		System.out.println("����1 �Է� �� :"+ a);
		System.out.println("����2 �Է� �� :"+ b);
		System.out.println("����3 �Է� �� :"+ c);
		System.out.println("�� �� �߰� �� : " + mid);

		sc.close();

		

		
	}

}
