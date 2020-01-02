import java.util.Scanner;

/*
키보드로 데이터 입력
1. 입력자료는 1 ~ 100 사이의 정수
2. 입력자료중 3의 배수이면서 7의 배수만 합계와 평균을 구하여 출력
3. 입력 자료가 7개이면 프로그램은 종료 된다.
4. 입력예시
	입력 자료 : 0
	"error 입력 범위가 아님"
	입력자료 : 8
	입력자료 : 77
	입력자료 : 200
	"error 입력 범위가 아님"
	.
	.
	.
	합계 : --
	평균 : --
 */

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		
		int num;
		while(true) {
			System.out.print("입력 자료 : ");
			num = sc.nextInt();
			if(num > 0 && num < 101) {
				if(num % 3 == 0 && num % 7 ==0) {
					sum += num;
					cnt++;
					if(cnt == 7) break;
				}
			}else {
				System.out.println("Error 입력범위 아님");
			}

		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/cnt);
		
		
		
		

		
	}

}
