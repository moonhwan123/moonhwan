package OOP;

import java.util.Scanner;

public class method_ex {
	
	
	//������ �޼���
	static void gugudan(int num) {
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("%d * %d = %d \n", num,i,(num*i));
		}
	}
	
	//��Ģ ���� �޼���
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
		
		
		//3���� ���ڸ� �Է¹޾Ƽ� ũ�Ⱑ ū ������� ����ϴ� ���α׷�.

		
		
		
		//1���� ���ڸ� �Է� �޾Ƽ� ������ ����ϴ� ���α׷�
		/*
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		gugudan(num);
		*/
		
		
		
		//����2���� ��Ģ�����ڸ� �Է¹޾Ƽ� �����ϴ� ������ ���� ���α׷�
		/*
		System.out.print("�� ���� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String str = sc.nextLine();
		char op = str.charAt(0);
		
		System.out.println(calc(num1,num2,op));
		*/
		
		
		
		
		
	}

}
