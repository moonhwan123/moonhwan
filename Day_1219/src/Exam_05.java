import java.util.Scanner;

/*
���� 2�� �Է� ũ�� ���ϱ�
 ��) 79,88 �Է½� 
 	= 79<=88
 	
 	70,60 �Է½�
 	= 70>=60
 	
 */


public class Exam_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ΰ��� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>=num2) {
			System.out.println(num1+">="+num2);
		}
		else{
			System.out.println(num1+"<="+num2);
		}
		
		sc.close();
		
	}

}
