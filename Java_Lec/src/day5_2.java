import java.util.Scanner;

public class day5_2 {

	public static void main(String[] args) {
		
		/*
		 -조건문
		 	: 특정한 조건을 만족하면 명령문을 실행
		 	
		 	if문
		 		: 기본적인 조건문
		 		: 조건이 참일 때 실행
		 		: 만약 ~~면
		 			'만약' 조건에 만족하면 수행하라.
		 			만족하다 = True
		 			만족하지 않는다 = False
		 		if (조건식)
		 			명령문
		 			//여러 명령문 실행은{}
		 			 { 
		 				명령문
		 				명령문
		 			 } 
		 			 
		 		else
		 			: 조건식이 만족하지 않으면 '무조건' 여기를 실행
		 			: if문에 종속된다.
		 			: if문 하나당 하나만 사용 가능
		 */
		
		int a = 5;
		
		if (!(a>3))
		{
			System.out.println("a는 3보다 크다.");
		}
		
		System.out.println("검사 끝");
		
		
		//숫자 하나 입력 받고, 화면에 숫자 출력 (단, 0이면 "입력하신 숫자는 0입니다.")
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("숫자를 입력 하세요 : ");
		int num = sc.nextInt();
		
		if(num != 0)
		{
		System.out.println("입력 하신 숫자는 "+num+"입니다.");
		}
		
		else
		{
			System.out.println("입력하신 숫자는"+num+"입니다.");
		}
		*/
		
			
		// 윤년 만들기
		// 4로 나누어 떨어지고
		// 100으로 나누어 떨어 지지 않으면 윤년이다.
		// 그리고 따로 400으로 나누어 떨어지면 윤년
		// 년도 입력 후 윤년인지 아닌지를 판별 
		
		System.out.println("년도를 입력 하세요 : ");
		int year = sc.nextInt();
		
		if((year%4 ==0 && year %100 != 0)|| year%400==0)
		{
			System.out.println(year+"년은 윤년입니다.");
		}
		else
			
			System.out.println(year+"년은 윤년이 아닙니다.");
		
		
		sc.close();

	}

}
