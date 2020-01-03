import java.util.Scanner;

/*
키보드로 정수 입력
1. 입력 범위 (2 ~ 100)
2. 입력된 수를 2진수로 변환후 출력
3. 입력 예시
	정수 입력 : 101
	입력오류 --> 재입력
	정수 입력 : 10
	10진수 (10) = 2진수 (1010)
 */


public class Exam_07 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("2~100 사이의 정수를 입력 하세요 >>");
			num = sc.nextInt();
			if(num > 1 && num < 101) {
				break;
			}else System.out.println("입력 오류 !");
		}
		
		int temp = num;
		String bin = ""; // 2진수 기억용
		int mok, nmg;
		
		do{
			mok = temp/2;
			nmg = temp%2;
			bin = nmg + bin; // 여기
			temp = mok;
		}while(mok != 0);
		
		System.out.println("10진수("+num+")"+" = "+"2진수("+bin+")");
		
		
		
		
		
	}

}
