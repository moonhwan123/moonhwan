import java.util.Scanner;

/*
1.세개의 정수중 가장 큰값 찾기

2.세개의 정수중 가장 큰값 찾기


 */



public class Exam_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int a = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int b = sc.nextInt();
		System.out.print("정수3을 입력 하세요 >> ");
		int c = sc.nextInt();
		
		
		// 1. 큰값 찾기 - 조건 연산자 이용
		// 조건연산자 (조건식) ? 참:거짓;
		
		int max = (a>b) ? a:b;
		max = (max<c) ? c:max;
		
		System.out.println("max = " + max);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
