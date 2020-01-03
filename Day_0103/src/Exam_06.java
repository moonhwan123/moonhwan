import java.util.Scanner;

/*
키보드 입력
2. 정수 10개를 입력 합을 출력(단, 입력 값이 음수는 배제한다)
 */





public class Exam_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//while문 이용
/*		int cnt = 0; // 카운트 변수
		int total = 0; // 합계 변수
		
		while(cnt < 10) {
			System.out.print("정수를 입력하세요 >> ");
			int num = sc.nextInt();
			if(num > 0 ) {
				total += num;
				cnt++;
			}
		}
		System.out.println("합계 : " + total);
*/	
		
		
		//for문 이용
		int sum = 0; 
		for(int i = 1; i <= 10 ; i++) {
			System.out.print("정수를 입력하세요 >> ");
			int num = sc.nextInt();
			if(num > 0) {
				sum += num;
			}else i--; // 음수가 들어오면 i를 빼버림 
		}
		System.out.println("합계 : " + sum);
		
		//for(;;); -> for문의 무한반복
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}
}
