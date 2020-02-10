import java.util.Scanner;


public class sosu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int tcnt=0;
		int scnt=0;
		int ssum=0;
		
		while(true) {
			System.out.print("2~100 사이의 정수를 입력 하세요 >> ");
			number = sc.nextInt();
			
			if(number == -99) break;
			
			if(number >=2 && number<=100) {
				tcnt++;
				for(int i = 2; i<=number; i++) {
					if(number%i==0) {
						if(number==i) {
							scnt++;
							ssum+=number;
						}
						else break;
					}
					
				}
			}
			else System.out.println("입력오류");
		}
		
		System.out.println("입력 갯수 : "+tcnt);
		System.out.println("소수 개수 : "+scnt);
		System.out.println("소수 합 : "+ssum);
		
	}

}
