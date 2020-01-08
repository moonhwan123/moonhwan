import java.util.Scanner;

/*
키보드 (2~1024)입력
입력 값을 2진수 변환해서 출력
입력 값이 -99 이면 종료 

예시)
입력 : 10 
2진수 : 1010
입력 : 1
입력 오류
입력 : 127
2진수 : 1111111
 */


public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = {'0','1','2','3','4','5','6'
				,'7','8','9','A','B','C','D','E','F'};
		
		char bin[];
		
		while(true) {
			bin = new char[12];
			String binary = "";
			int cnt=0;
			System.out.print("10진수 : ");
			int dec = sc.nextInt();
			if(dec == -99) break;
			System.out.print("변환 하고 싶은 진수 입력(2,8,16) : ");
			int jin = sc.nextInt();
			
			if(dec >= 2 && dec <= 3000) {
				int temp = dec;
				int mok;
				int nmg;
				do {
					mok = temp/jin;
					nmg = temp%jin; 
					bin[cnt] = str[nmg]; // 배열 이용
					binary = str[nmg]+binary; // 문자열 연산 이용
					temp = mok;
					cnt++;
				}while(mok!=0);
				System.out.print(jin+"진수 : ");
				for(int j = cnt-1; j >= 0; j--) {
					System.out.print(bin[j]);
				}
				System.out.println();
				System.out.println(jin+"진수 : " +binary);
			}else System.out.println("입력 오류");
		}
	
		
	}

}