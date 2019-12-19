import java.util.Scanner;

/*
정수 2개 입력 크기 비교하기
 예) 79,88 입력시 
 	= 79<=88
 	
 	70,60 입력시
 	= 70>=60
 	
 */


public class Exam_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두개를 입력하세요 : ");
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
