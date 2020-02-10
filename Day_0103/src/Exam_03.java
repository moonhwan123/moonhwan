import java.util.Scanner;

/*
2자리 이내 정수를 입력
1 ~ 입력된 정수 까지 합계를 계산
 */



public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num; // 지역변수를 밖으로 빼주어서 사용할수 있게끔 해줌
		int sum = 0;
		while(true) {
			System.out.print("2자리 이내 정수를 입력 하세요(1~99) >> ");
			num = sc.nextInt();
			
			if(num > 0 && num < 100) {
				for(int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1부터 "+num+"까지의 합계는 : "+sum);
				break; // 이 break가 없으면 다른데서 만들어 줘야함
			}
			System.out.println("2자리 이내의 숫자를 입력하세요!");
		}
		
		
		
	


		
		
		
		
		
		
		
		
	}
}
