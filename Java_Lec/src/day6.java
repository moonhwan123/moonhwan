import java.util.Scanner;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학점계산기
		//System.out.println("점수를 입력 하시오 : ");
		Scanner sc = new Scanner(System.in);
		
		//int jumsu=sc.nextInt();
		/*
		if(jumsu>=90)
			System.out.println("A");
		
			
		if( jumsu>=80 && jumsu<90)
			System.out.println("B");
		
			
		if(jumsu>=70 && jumsu<80)
			System.out.println("C");
		
			
		if(jumsu>=60 && jumsu<70)
			System.out.println("D");
		
		if(jumsu<60)
			System.out.println("F");
		*/
		
		
		
		/*
		 -else if
		 	: if문 조건식이 만족하지 않으면 수행
		 	: if문 조건식이 만족하지 못할때 다른 조건 검사
		 	: if문에 종속(하나의 if문에 여러개의 else if 문 가능)
		 	
		 -switch~case문
		 	: 하나의 조건식으로 많은 경우의 수 처리 
		 	: 조건식의 결과는 정수 또는 문자 (문자열 도 되긴함)
		 	: switch(조건식)
		 	  {
		 	  	case 값1 :
		 	  		//조건식의 결과와 값1과 같은경우 실행
		 	  		break;
		 	  	case 값2 :
		 	  		//조건식의 결과와 값2과 같은경우 실행
		 	  		break;
		 	  	default :
		 	  		//조건식의 결과와 일치하는 값이 없을 때 실행(if문의 else와 동일)
		 	  }
		 */
		
		
		
		/*
		if(jumsu>=90)
			System.out.println("A");
		else if(jumsu>=80)
			System.out.println("B");
		else if(jumsu>=70)
			System.out.println("c");
		else if(jumsu>=60)
			System.out.println("D");
		else 
			System.out.println("F");
		*/
		
		
		
		//홀짝 판별기
		//짝수면 "짝수 입니다." 홀수이면 "홀수 입니다." 0이면 "애매하네요~"
		/*
		System.out.println("아래에 숫자를 입력 하세요");
		int num_1 = sc.nextInt();
		
		if (num_1 != 0) {
			if (num_1 %2 == 0)
				System.out.println("짝수 입니다.");
			else
				System.out.println("홀수 입니다.");
		}
		else
			System.out.println("애매하네요~");
		*/
		
		
		
		
		//로그인 프로그램 
		//id = java , pw = abc123
		/*
		System.out.print("ID 입력 : ");
		String id,pw;
		
		id = sc.nextLine();
		
		if(id.equals("java")) {
			System.out.println("ID 일치");
			System.out.print("PW 입력 : ");
			pw = sc.nextLine();
			if(pw.equals("abc123")) {
				System.out.println("PW일치");
				System.out.println("로그인 성공");
			}
			else
				System.out.println("패스워드 불일치");
		}
		else
			System.out.println("ID 불일치");
		*/
		
		
		
		
		// 학점 계산기 2
		// +,- 도 표시한다. ex) 98이상이면 + 94미만은 -
		/*
		System.out.print("점수 입력 : ");
		int jum = sc.nextInt();
		System.out.println("당신의 점수는"+jum+"점 입니다.");
		
		if (jum>=90)
		{
			if (jum>=98)
				System.out.println("당신의 학점은 A+ 입니다.");
			else if (jum>93)
				System.out.println("당신의 학점은 A0 입니다.");
			else
				System.out.println("당신의 학점은 A- 입니다.");
		}
		
		else if (jum>=80)
		{
			if (jum>=88)
				System.out.println("당신의 학점은 B+ 입니다.");
			else if (jum>83)
				System.out.println("당신의 학점은 B0 입니다.");
			else
				System.out.println("당신의 학점은 B- 입니다.");
		}
		
		else if (jum>=70)
		{
			if (jum>=78)
				System.out.println("당신의 학점은 C+ 입니다.");
			else if (jum>73)
				System.out.println("당신의 학점은 C0 입니다.");
			else
				System.out.println("당신의 학점은 C- 입니다.");
		}
		
		else if (jum>=60)
		{
			if (jum>=68)
				System.out.println("당신의 학점은 D+ 입니다.");
			else if (jum>63)
				System.out.println("당신의 학점은 D0 입니다.");
			else
				System.out.println("당신의 학점은 D- 입니다.");
		}
		else
			System.out.println("당신의 학점은 F 입니다.");
		 */
		/*
		char grade =' ';
		char opt = '0';
		System.out.print("점수 입력:");
		int jumsu = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다. \n",jumsu);
		
		if(jumsu >= 90) {
			grade = 'A';
			if(jumsu>=98) {
				opt = '+';
			}
			else if(jumsu<94) {
				opt = '-';
			} 
		System.out.printf("당신의 학점은 %c%c 입니다.",grade,opt);	
		}
		
		if(jumsu >= 80) {
			grade = 'B';
			if(jumsu >= 88) {
				opt = '+';				
			}
			else if(jumsu < 84) {
				opt = '-';
			}
		}
		System.out.printf("당신의 학점은 %c%c 입니다.",grade,opt);
		*/
		
		
		
		/*
		//조건식의 결과는 정수 또는 문자 (문자열 도 되긴함)
		
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		switch(num) 
		{
		case 1 :
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		case 3 :
			System.out.println("셋");
			break;
		default :
			System.out.println("그외 ~");
			break;
		}
		*/
		
		
		//학점 계산기 (switch~case문)
		/*
		char grade = ' ';
		System.out.print("점수를 입력 하세요 : ");
		int score = sc.nextInt();
		
		switch(score/10)
		{
			case 10 :
			case 9 :
				grade = 'A';
				// 여기에 if문 switch문 넣어도 상관 없음
				break;
			case 8 :
				grade = 'B';
				break;	
			case 7 :
				grade = 'C';
				break;	
			case 6 :
				grade = 'D';
				break;
			default :
				grade ='F';
				break;
		}
		System.out.printf("당신의 등급은 %c입니다." , grade);
		*/
		
		
		
		
		
		//회원 등급에 따라 권한 출력하기
		//스위치~케이스문 사용
		//3등급 - 삭제,쓰기,읽기
		//2등급 - 쓰기,읽기
		//1등급 - 읽기
		
		/*
		System.out.print("당신의 회원등급을 입력해주세요 : ");
		int grade;
		grade = sc.nextInt();
		
		switch(grade)
		{
		case 3:
			System.out.println("삭제권한 부여");
		case 2:
			System.out.println("쓰기권한 부여");
		case 1:
			System.out.println("읽기권한 부여");
		}
		
		*/
		
		
		char gender;
		String regNo="";
		
		System.out.print("당신의 주민 번호를 입력하세요(123456-1234567) : ");
		regNo = sc.nextLine();
		
		gender = regNo.charAt(7);
		
		switch (gender)
		{
		case'1':
		case'3':
			System.out.println("당신은 남자입니다.");
			break;
		case'2':
		case'4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민번호 입니다.");
		}
		// 스위치문 안에 스위치 문 넣어서 2000년 이후 이전에 출생한 자 인지 판단 할 수 있다.
		
		sc.close();
		
	}

}
