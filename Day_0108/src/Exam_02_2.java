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


public class Exam_02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bin[];
		while(true) {
			bin = new int[10];
			int cnt=0;
			System.out.print("10진수 : ");
			int dec = sc.nextInt();
			if(dec == -99) break;
			if(dec >= 2 && dec <= 1024) {
				int temp = dec;
				int mok;
				int nmg;
				do {
					mok = temp/2;
					nmg = temp%2; 
					bin[cnt] = nmg;
					temp = mok;
					cnt++;
				}while(mok!=0);
				System.out.print("2진수 : ");
				for(int j = cnt-1; j >= 0; j--) {
					System.out.print(bin[j]);
				}
				System.out.println();
			}else System.out.println("입력 오류");
		}
	
		
	}

}
