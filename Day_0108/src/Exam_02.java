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


public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bin[] = new int[10];

 		//숫자 입력
		while(true) {
	 		int cnt = 0;
			System.out.print("2~1024 사이의 정수를 입력 하세요(-99입력시 종료) >>");
			int num = sc.nextInt();
			if(num==-99) break;
			if(num >= 2 && num <= 1024) {
		 		int mok, nmg;
				int temp = num;
				do{
					mok = temp/2;
					nmg = temp%2;
					bin[cnt] = nmg;
					temp = mok;
					cnt++;
				}while(mok!=0);	
				System.out.println("10진수 : "+num);
				System.out.print("2진수 : ");
				for(int j = cnt-1; j >= 0; j--) {
					System.out.print(bin[j]);
				}
				System.out.println();
			}else System.out.println("입력 오류 !");
		}
		
		
		
		
		
	}

}
