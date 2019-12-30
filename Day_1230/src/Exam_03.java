import java.util.Scanner;

/*
키보드로 정수 2개 입력 후 크기 비교하기

 */



public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("정수1 > 정수2");
		}
		if(num1 < num2) {
			System.out.println("정수1 < 정수2");
		}
		if(num1 == num2) {
			System.out.println("정수1 == 정수2");
		}
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}
}
