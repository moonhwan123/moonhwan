import java.util.Scanner;

/*
[소수 판별 하기]
키보드 입력 
1) -99가 입력시 프로그램 종료
2) 입력 범위는 2 ~ 100 
2) 입력 자료중 소수의 갯수와 합을 구하여 출력

입력 : -6 --> 입력 자료 아님
입력 오류 
입력 : 3,7,15,67,45,38,-99
...
입력 : -99 --> 입력 자료 아님
입력 자료 수 : xx
소수 갯수 : xx
소수 합계 : xx

 */
public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tcnt=0;
		int pcnt=0;
		int psum=0;
		
		while(true) {
			System.out.print("정수를 입력 하세요 (2~100) >> ");
			int num = sc.nextInt();
			
			// 입력 오류 체크
			if(num == -99) {
				break;
			}
			
			if(num>=2 && num<=100) {
				tcnt++;
				for(int i = 2; i <= num; i++) {
					
					if(num%i ==0) {
						if(num==i) {
							pcnt++;
							psum+=num;
							break; // for문 탈출
						}
						else {// 여기서 else는 쓰나 안쓰나 크게 차이 없음
							break; // for문 탈출
						}
					}
				}

			}else System.out.println("입력 오류");

		}
		
		System.out.println("총 입력 자료 수 : "+tcnt);
		System.out.println("소수 갯수 : "+pcnt);
		System.out.println("소수 합 : "+psum);
		

	}

}
