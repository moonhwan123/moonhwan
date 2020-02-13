package ExceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int flag ;
			
			do {
				System.out.print("곱하고자 하는 두 정수 입력 >>");
				
				flag = 1;
				
				try {
				
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				System.out.println("두수의 곱은 : "+num1*num2);
				
			} catch (InputMismatchException e) {
				
				flag = 0;
				System.out.println("정수를 입력 하세요");
				sc.nextLine();//Enter 키 까지 읽어서 버린다.
				
			}
				
		}while(flag == 0);	
			
		

	}

}
