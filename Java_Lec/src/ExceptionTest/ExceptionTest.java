package ExceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int flag ;
			
			do {
				System.out.print("���ϰ��� �ϴ� �� ���� �Է� >>");
				
				flag = 1;
				
				try {
				
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				System.out.println("�μ��� ���� : "+num1*num2);
				
			} catch (InputMismatchException e) {
				
				flag = 0;
				System.out.println("������ �Է� �ϼ���");
				sc.nextLine();//Enter Ű ���� �о ������.
				
			}
				
		}while(flag == 0);	
			
		

	}

}
