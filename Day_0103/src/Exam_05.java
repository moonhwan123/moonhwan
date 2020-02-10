import java.util.Scanner;

/*
키보드 입력
1. 정수 10개를 입력 후 합을 출력하시오

2. 정수 10개를 입력 합을 출력(단, 입력 값이 음수는 배제한다)
 */





public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//for문 이용
		int sum = 0; 
		for(int i = 1; i <= 10 ; i++) {
			System.out.print("정수를 입력하세요 >> ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("합계 : " + sum);
		
		
		//while문 이용
		
		
		
		
		
	
		
	}
}
