import java.util.Scanner;

/*
키보드로 데이터 입력
1. 입력자료는 1 ~ 100 사이의 정수
2. 입력 자료 중 7의 배수의 합
3. 전체자료(오류포함)이 20개이면 프로그램 종료
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
	입력자료 20개 입력시 
	입력자료 20개 중 오류율(%) : xx %
	입력자료 20개 중 7의 배수의 비율(%) : xx %
	7의배수의 합계 : --
	7의배수의 평균 : --
 */

public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt_total = 0;
		int cnt_7bae = 0;
		int cnt_Error = 0;
		
		int num;
		do{
			System.out.print("입력 자료 : ");
			num = sc.nextInt();
			cnt_total ++;
			if(num > 0 && num < 101) {
				if(num % 7 ==0) {
					sum += num;
					cnt_7bae ++;
					
				}
			}else {
				cnt_Error ++;
				System.out.println("Error 입력범위 아님");
			}

		}while(cnt_total < 20);
		
		System.out.println("입력자료 20개 중 오류율(%) : " + ((double)cnt_Error / cnt_total)*100+"%");
		System.out.println("입력자료 20개 중 7의 배수의 비율(%) : " + ((double)cnt_7bae / cnt_total)*100+"%");
		
		System.out.println("7의 배수의 합계 : "+sum);
		
		double ave = (double)sum/cnt_7bae;
		System.out.println("7의 배수의 평균 : " + (int)((ave*100)+0.5)/100.);

		
	}

}
