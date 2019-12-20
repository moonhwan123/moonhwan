package OOP;

import java.util.Scanner;

public class method_ex {
	
	
	//구구단 메서드
	static void gugudan(int num) {
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("%d * %d = %d \n", num,i,(num*i));
		}
	}
	
	//사칙 연산 메서드
	static int calc(int num1, int num2, char op) {
		
		switch(op) {
		case'+':
			return num1 + num2;
		case'-':
			return num1 - num2;
		case'*':
			return num1 * num2;
		case'/':
			return num1 / num2;
		default:
			return 0;
		}	
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//3개의 숫자를 입력받아서 크기가 큰 순서대로 출력하는 프로그램.

		
		
		
		//1개의 숫자를 입력 받아서 구구단 출력하는 프로그램
		/*
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		gugudan(num);
		*/
		
		
		
		//숫자2개와 사칙연산자를 입력받아서 동작하는 간단한 계산기 프로그램
		/*
		System.out.print("두 숫자 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String str = sc.nextLine();
		char op = str.charAt(0);
		
		System.out.println(calc(num1,num2,op));
		*/
		
		
		
		
		
	}

}
