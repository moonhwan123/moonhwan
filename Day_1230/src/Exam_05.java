import java.util.Scanner;

/*
정수 2개 입력 후 
두 수의 차이가 10 이상 이면 
큰수에 -5 작은 수에 +5
 */

public class Exam_05 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력 하세요 >> ");
		int a = sc.nextInt();
		System.out.print("정수2을 입력 하세요 >> ");
		int b = sc.nextInt();
		
		// 아래는 두 수의 차이 계산 ( 큰 수에서 작은 수 빼기 ) 
		
		int c = 0;
		
		if(a>=b) { // 참일때
			c = a-b;
		}else { // 거짓일때
			c = b-a;
		}
		
		// 차이가 10 이상인지 조건 판단
		
		if(c>=10) {
			if(a>=b) {
				a = a-5;
				b = b+5;
			}else {
				a = a+5;
				b = b-5;
			}
		}
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		sc.close();
		
		
	}
}
