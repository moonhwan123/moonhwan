import java.util.Scanner;

/*
1.세개의 정수중 가장 큰값 찾기

2.세개의 정수중 가장 큰값 찾기


 */



public class Exam_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int a = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int b = sc.nextInt();
		System.out.print("정수3을 입력 하세요 >> ");
		int c = sc.nextInt();
		
		
		// 1. 큰값 찾기
		int max = 0;
		
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else { // a<b
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		
		System.out.println("max = " + max);
		
		// 2. 작은값 찾기
		int min = 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
