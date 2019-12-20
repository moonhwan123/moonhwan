import java.util.Scanner;

public class day7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 -반복문
		 	: 조건에 만족하면 수행한다.(조건문과 동일)
		 		>단, 조건에 만족하지 않을때 까지
		 		
		 	1. while문
		 		조건식이 참이면 명령문 수행
		 		if문과 기본구조가 같다
		 			>if문 : 조건이 참이면 수행하고 끝
		 			>while문 : 조건이 참이면 수행하고 다시 조건식을 비교
		 			
		 			
		 	2. do~while문
		 		while문의 변형된 형태
		 		명령문을 실행 후 조건을 검사 
		 		최소 한번은 명령문이 실행된다.
		 		
		 	3. for문
		 		특정한 횟수동안 작업 반복
		 		초기화,조건식,증감식
		 		
		 		
		 		
		 -반복문 공통 사항
		 
		 	break문 : 반복문을 빠져 나간다. (탈출)
		 	continue문 : 반복문의 첫 문장으로 돌아 간다. (조건식 검사하러 올라감)
		 	
		
		 			
		 */
		
		
		/*
		int num = 0;
		while(num<3) {
			System.out.println(num);
			num++; 
		}
		System.out.println("End"); //반복문이 끝나고 실행된다.
		System.out.println();
		*/
		
		
		
		// (1) num = 0, 0<3 만족하여 수행 (print 및 num++수행)
		// (2) num = 1, 1<3 만족하여 수행 (print 및 num++수행)
		// (3) num = 2, 2<3 만족하여 수행 (print 및 num++수행)
		// (4) num = 3, 3<3 만족하지 않아서 끝 
		// 조건 비교 -> 만족 -> 수행 -> 조건 비교 ....... 반복
		
		
		/*
		-조건변수
			: 조건변수에 따라 반복횟수가 정해진다.
		
		 초기값 (조건 변수 생성)
		 while(조건식) ->(조건변수 사용)
		 	명령문(반복 수행하고 싶은 코드 + 조건변수의 변화식)
		 	
		 	조건변수의 변화식은 얼마든지 자유롭게 사용가능
		 	단, 조건식이 만족하도록 구성
		 	
		 */
		
		
		
		//반복횟수 지정
		/*
		int count;
		
		System.out.print("반복 횟수 입력 : ");
		count = sc.nextInt();
		while(count>0)
		{
			System.out.println("count = " +count);
			count--;
		}
		*/
		
		
		
		/*
		System.out.println();
		
		
		int i = 6;
		while(--i != 0)
		{
			System.out.println(i);
			
		}
		*/
		
		
		
		// 반복횟수 지정
		// 1~9 까지 숫자 증가
		
	
		// 명령문 먼저 만들고 반복문 씌우는게 편하다
		
		
		
		
		/*  연습 문제
		 1~10 까지 합 구하기
		 [출력 결과]
		 1~10 까지의 합은 55이다.
		 */
		/*
		System.out.println();
		int K = 0;
		int sum_K = 0;
		
		while(K<11) {
		sum_K += K;
		K++;
		}
		System.out.println(sum_K);
		*/
		
		
		
		
		
		
		
		//특정 조건을 만족하면 탈출하는 반복문
		/*
		int num;
		int sum = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("숫자 입력 >>");
			num = sc.nextInt();
			
			if(num != 0) {
				sum+=num;
			}
			else {
				flag = false;
			}
		}
		System.out.println("입력하신 값의 합은 "+sum+"입니다.");
		*/
		
		/*
		 입력 받은 단 구구단 출력하기
		 [출력결과]
		 단을 입력 하세요 : 5
		 
		 5 * 1 = 5
		 5 * 2 = 10
		 .
		 .
		 .
		 */
		/*
		int M = 0;
		int result;
		System.out.print("단을 입력 하세요 : ");
		int dan = sc.nextInt();
		
		
		while(M<9) {
		M++;
		result = dan * M;
		System.out.printf("%d * %d = %d \n", dan , M , result);
		}
		*/
		
		/*
		int num = 0;
		
		do {
		System.out.println("=================");
		System.out.println("1. 새로만들기");
		System.out.println("2. 불러오기");
		System.out.println("3. 옵션");
		System.out.println("4. 끝내기");
		System.out.println("=================");
		System.out.print("선택 : ");
		num = sc.nextInt();
		}while(num < 1 || num > 4); // 세미 콜론 주의
		
		System.out.println("선택한 메뉴는 = "+num);
		*/
		
		
		
		/*
		 숫자 맞추기
		 1~100 까지 랜덤으로 정답 숫자를 생성
		 반복문 앞에서 숫자를 입력 받고, 숫자가 정답이면 탈출
		 
		 [출력 결과]
		 숫자 입력 : 50
		 더 큰 수를 입력 하세요
		 숫자 입력 : 80
		 더 작은 수를 입력 하세요
		 숫 자 입력 : 70
		 정답입니다!
		 3회 만에 맞추 셨습니다.
		 */
		
		/*
		int ran_sut,ip_sut;
		int count = 0;
		ran_sut = (int)(Math.random()*100+1);
		
		do {
			System.out.print("숫자 입력 : ");
			ip_sut = sc.nextInt();
			count++;
			
			if (ip_sut > ran_sut) 
				System.out.println("더 작은 수를 입력 하세요");
			else if (ip_sut < ran_sut) 
				System.out.println("더 큰 수를 입력 하세요");
			else {
				System.out.println("정답 입니다!");
				break;
			}
		}while(true);
		
		System.out.println(count+"회 만에 맞추셨습니다.");
		*/
		
		
		//break문
		//반복문 종료
		//만나면 반복문 탈출
		
		/*
		int sum = 0;
		int i = 0;
		while(true) {
			if(sum>500)
				break;
			++i;
			sum+=i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
		*/
		
		
		
		//continue문
		//조건식으로 점프
		/*
		int num = 0;
		int sum = 0;
		
		while(num<=100) {
			if(num % 3 == 0) {
				num++;
				continue;
			}
				
			sum+=num;
			num++;
		}
		System.out.println("합은 : "+sum);
		*/
		
		
		
		// 0 부터 시작해서 99까지 짝수들의 합을 구하는 프로그램
		
		/*
		int num = 0;
		int sum = 0;
		
		while(num<99) {
			if(num % 2 != 0) {
				num++;
				continue;
			}
		
		sum+=num;
		num++;
		}
		System.out.println("0부터 99까지 짝수의 합은 : "+sum);
		*/
		
		/*
		int num = 0;
		for(num = 0; num < 10; num++) {
			System.out.println(num);
		}
		*/
		
		// 구구단 (입력 받은 단을 출력)
		/*
		int dan;
		int gop = 0 ;
		int result = 0;
		
		System.out.print("단을 입력 하세요 >> ");
		dan = sc.nextInt();
		
		
		for(gop = 1; gop < 10; gop+=1) {
			result = dan * gop;
			System.out.printf("%d * %d = %d\n", dan, gop,result);
		}
		*/
		
		//두개의 초기값 두개의 증감식
		/*
		for(int i=1 , j=10; i<10; i++,j--)
			System.out.printf("%d \t %d\n",i,j);
		System.out.println();
		*/
		// 중첩 반복문
		/*
		for(int J = 1; J<=5; J++)
		{
			for(int A = 1; A<=5; A++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		System.out.println();
		
		// 구구단(2~9단 출력하기)
		int Dan=0;
		int W=0;
		int Result=0;
		
		for(Dan=2; Dan<=9; Dan++) {
			for(W=1; W<=9; W++) {
				Result = Dan * W;
				System.out.printf("%d * %d = %d \n",Dan,W,Result);
			}
			System.out.println();
		}
			
		
		/*
		 o
		 oo
		 ooo
		 oooo
		 ooooo
		 */
		
		int hang=0;
		int yull=0;
		
		for(hang = 0; hang<=4; hang++) {
			for(yull = 0; yull<=hang; yull++) {
				System.out.print("o");
			}
			System.out.println();
		}
		
		// 이름붙은 반복문
		Loop1: for(int i = 2; i<= 9; i++) {
			for(int j = 1; j<= 9; j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
				if(j==5)
				continue Loop1; // 이름 붙인곳으로 이동
			}
			System.out.println();
		}
		
		
		
		
	}

}
