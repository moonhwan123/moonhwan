import java.util.Scanner;

/*
키보드로 정수(2~1000)입력
	1) 2~입력값 까지의 소수를 출력
	2) 한 줄에는 5개씩 출력
	3) 마지막에 소수의 개수 출력
	4) 예시
	입력 : 50
	2  3  5  7  11
	13  .......
	소수갯수 : x
 */



public class Exam_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int num;
		
		while(true) {
			System.out.print("2~1000 사이의 정수 1개 입력 하세요(0을 입력 하면 종료) >> ");
			num = sc.nextInt();
			
			if(num == 0) break;
			
			if(num>=2 && num<=1000) {
				for(int j = 2; j<=num; j++) {
					
					for(int i = 2; i <= j; i++) {
						if(j%i==0) {
							if(j==i) {
								System.out.print(j+"\t");
								cnt++;
								if(cnt % 5==0) {
									System.out.println();
								}
								break; // for문 탈출
							}
							else break; // for문 탈출
							
						}
					}
					
				}
				System.out.println(num+"의 소수 갯수 : "+cnt);
			}else System.out.println("입력 오류!");
		}
		

		
		
		
		
		
		
	}

}
