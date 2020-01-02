import java.util.Scanner;

/*
키보드입력 
자료 무제한 입력

EX) 10,80,60,90,95 ........
입력 자료중 50~90 사이의 자료만 사용
단, 입력 자료에 음수가 입력 되면 종료와 동시에 합계, 평균 출력
 */


public class Exam_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		int num = 1;
		
		System.out.println("정수를 입력하세요(50~90까지의 숫자만 합산 됩니다) , 음수를 입력하면 종료 >>");
		while(num>0) { 
			num = sc.nextInt();
			if(num >= 50 && num <= 90) {
				cnt ++;
				sum += num;
			}
		}
		
		System.out.println("sum = "+sum);
		System.out.println("ave = "+(double)sum/cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
