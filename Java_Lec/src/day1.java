
public class day1 {
	public static void main(String[] args) {	
		
		System.out.println("Hello Java"); //세미콜론  (;) : 문장의 끝을 알리는 기호
		
		/*
		 주석 (Comment)
		 	- 소스에 설명을 추가 하는 것  
		 	- 프로그램 수행에 영향을 미치지 않는다.
		 	- 한 줄 주석 : //뒤 부터 주석처리
		 	- 여러 줄 주석 : 지금 쓰고 있는 거 
		 */
		
		// 자바의 출력문 
		System.out.print("Hello World"); //개행 포함 되어 있지 않음
		
		System.out.println("Hello World"); //개행 포함 되어 있음 (자동 줄 바꿈)
		
		System.out.printf("Hello World\n"); //서식을 이용한 출력
		
		System.out.printf("%d",10);
		
		System.out.printf("%f",10.5);
		
		System.out.printf("%c", 'A');
		System.out.printf("%s", "ABC");
		System.out.println();
		System.out.printf("숫자 : ");
		System.out.println(10);
		System.out.print("문자 : ");
		System.out.println('A');
		
		System.out.printf("숫자 : %d 문자 : %c" ,10,'A');
		System.out.println();
		System.out.println("숫자 : "+ 10 +"문자 : "+'A');
		
		
		/*
		 -서식문자
		 %d : 10진수
		 %x : 16진수
		 %o : 8진수
		 %f : 실수형
		 %c : 문자
		 %s : 문자열
		 %b : Bool형
		 
		 -이스케이프 문자
		 \n : 개행
		 \t : 수평 탭
		 \r : 줄의 처음으로 커서 이동
		 \\ : \ 출력
		 \" : " 출력
		 \' : ' 출력
		 
		 */
		
		
		//"안녕하세요" 출력하기
		System.out.println("\"안녕하세요\"");
		// \n 사용하기
		System.out.printf("숫자 : %d \n문자 : %c\n",10,'A');
		System.out.println();
		
		/*
		 "안녕하세요"
		 나는 ooo 입니다.
		 나이는 oo 이고,
		 직업은 oo 입니다.
		 
		 printf문을 사용하여 출력
		 */
		
		System.out.printf("\"안녕하세요\"\n나는 %s 입니다.\n나이는 %d살 이고,\n직업은 %s 입니다.", 
				"홍길동",45,"의적");
		System.out.println();
		
		/*
		 -변수
		 	: 변하는 수 (프로그램이 진행되는 변경가능한 공간)
		 	: 프로그램 처리 과정에 데이터를 담아둘 수 있는 메모리의 공간
		 	
		 -변수의 선언
		 	형식 : 데이터 타입 변수 이름;
		 	ex) int a;
		 		int - 데이터 타입
		 		a - 변수명
		 		
		 -초기화
		 	int a = 1;
		 	초기값 : 변수를 선언한 후 최초의 값
		 */
		int a;
		a = 15; // 초기화를 하지 않을 시에는 에러 쓰레기값 존재
		System.out.println(a);
		
		/*
		 -변수의 생성 규칙
		 	변수의 이름은 영어 대소문자, 숫자, 특수문자($,_)만 가능
		 	영어 대소문자 구분 한다.
		 	변수의 시작은 숫자가 불가능하다.
		 	예약어 사용 불가능
		 	
		 	되도록 변수이름에 내용을 포함 하도록 하라
		 */
		
		
		/*
		 -데이터 타입
		 	정수형  : 정수(소수점이 아닌 자연수)를 저장 할 때 사용하는 데이터 타입
		 		byte : 1byte
		 		short : 2byte
		 		int : 4byte (이거 많이 씀)
		 		long : 8byte
		 		
		 	실수형 : 실수 (소수점)를 저장
		 		float : 4byte (소수점 이하 6자리까지 표기 마지막은 반올림)
		 		double : 8byte (소수점 이하 15자리 까지 표기, 이거 많이  씀)
		 		
		 	문자형 : 문자를 담을 수 있는 데이터 타입
		 		char : 2byte (아스키 코드가 아닌 유니 코드를 사용 하기 때문)
		 		
		 	논리형 : 
		 		True/False (대소문자 주의) : 참과 거짓을 나타냄
		 								  0은 거짓, 그외 에는 참 
		 		
		 	문자열형 : 
		 		String : 문자가 나열된 형태
		 		String a = "Hello";
		 		
		 		//wrapper 클래스
		 		  String b = new String("Hello");
		 */
		
		// 정수형 예제
		int num; // 정수형 int num 선언
		num = 10;
		System.out.println("num : "+num);
		num = 20;
		System.out.println("num : "+num);
		System.out.println("num+num : "+(num+num));
	
		float f;
		f = 0.123456789f;
		System.out.println("f = "+f);
		
		double d;
		d = 0.1234567891232352;
		System.out.println("d = " +d);
		
		byte num2 = 127;
		System.out.println("num2 = " + num2);
		byte num3 = (byte)128;
		System.out.println("num3 = " + num3); // 오버플로우 발생
		
		num2 = -128;
		num3 = (byte)-129;
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3); // 언더플로우 발생
		
		char ch;
		ch = 'A';
		System.out.println(ch);
		ch = 97; // char 형에 숫자를 쓰면 아스키 코드값 출력
		System.out.println(ch);
		ch = '\u0061'; // 유니코드 값
		System.out.println(ch);
		ch = 'A' +2;
		System.out.println(ch);
		
		/*
		 -형 변환
		 	: 변수나 상수의 데이터 타입을 다른 타입으로 변환
		 	자동 형변환(묵시적 형변환) : 크기에 맞춰서 알맞은 타입으로 형 변환
		 	명시적 형변환(캐스팅) : 프로그래머가 변수의 자료형으로 강제로 변환
		 */
		
		
		/*
		 -상수
		 	: 프로그램 실행 중 변경 할 수없는 고정된 값
		 	: final datetype 상수명 = 값;
		 */
		final double PIE = 3.14;
		
		System.out.println(PIE*10*10);
		System.out.println();
		
		int Num1 = 20;
		int Num2 = 25;
		int Num3 = 30;
		int sum = Num1+Num2+Num3;
		System.out.printf("Num1과 Num2와 Num3의 합은 : %d입니다.\n ", sum);
		
		char A = '?';
		System.out.printf("Hello%c" , A);
		
		String str1 = "My name is OOO";
		System.out.println(str1);
		System.out.println(A);
		
		double r = 10.0;
		final double PI = 3.14;
		
		double circle_area = r*r*PI;
		System.out.printf("반지름 %.2f 의 원 넓이는 %.2f 입니다.\n",r,circle_area);
		
		
		
		
		
		
		
	}
}
