import java.util.Scanner;

/*
1.������ ������ ��,��,�� 
�� ã����
1219 10���� ���߼� ã����
 */



public class Exam_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է� �ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("����2�� �Է� �ϼ��� >> ");
		int b = sc.nextInt();
		System.out.print("����3�� �Է� �ϼ��� >> ");
		int c = sc.nextInt();
		
		int max, mid, min;
		
		if(a>b) { // a>b
			if(a>c) {
				max = a;
				if(b>c) {
					mid = b;
					min = c;
				}else { // b<c
					mid = c;
					min = b;
				}
			}else { // a<c
				max = c;
				mid = a;
				min = b;
			}
		}else { // a<b
			if(b>c) {
				max = b;
				if(a>c) {
					mid = a;
					min = c;
				}else { // a<c
					mid = c;
					min = a;
				}
			}else { // b<c
				max = c;
				mid = b;
				min = a;
			}
		}
		
		
		System.out.println("max = "+max);
		System.out.println("mid = "+mid);
		System.out.println("min = "+min);
		
		
		
		sc.close();
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
