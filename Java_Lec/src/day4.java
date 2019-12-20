import java.util.Scanner;

public class day4 {

	public static void main(String[] args) {
		
		/*
		 -연산
		 	: 주어진 식을 계산하여 결과를 얻어내는 과정
		 	
		 -연산자
		 	: 특정한 연산을 수행하기 위해 사용하는 기호
		 	: 연산을 하는 '연산자' , 연산을 당하는 '피연산자'로 구성된다.
		 	
		 -산술연산자
		 	+ : 더하기
		 	- : 빼기
		 	* : 곱하기
		 	/ : 나누기
		 	% : 나머지
		 	
		 	
		 */
		
		// 두 수를 미리 설정수 사칙연산 수행 후 출력
		/*
		int a = 10;
		int b = 3;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		System.out.println();
		*/
		
		// 두 수를 입력 받아서 사칙 연산 수행 후 출력
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("두 수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("num1 + num2 = "+(num1+num2));
		System.out.println("num1 - num2 = "+(num1-num2));
		System.out.println("num1 * num2 = "+(num1*num2));
		System.out.println("num1 / num2 = "+(num1/num2));
		System.out.println("num1 % num2 = "+(num1%num2));
		System.out.println();
		*/
		
		/*
		 원 달러 환율 변환하기
		System.out.print("변환 할 원화를 입력 하세요 : ");
		int won = sc.nextInt();
		double rate = 1100;
		double dollar = won/rate;
		
		System.out.printf("%d원은 $%.2f 입니다.",won,dollar);
		System.out.println();
		*/
		/*
		System.out.print("초를 입력 하세요 : ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time/60) / 60;
		
		System.out.println(time + "초는 ");
		System.out.println(hour + "시간,  ");
		System.out.println(minute + "분, ");
		System.out.println(second + "초 입니다. ");
		System.out.println();
		*/
		
		/*
		 -단항 연산자
		 	: 피연산자가 하나인 연산자
		 		- : 부호 연산자(변수의 부호 변경)
		 		! : 부정 연산자(True -> False , False -> True)
		 		++ : 증가 연산자(변수에 1 증가, a++ 또는 ++a)
		 		-- : 감소 연산자(변수에 1 감소, a-- 또는 --a)
		 	
		 */
		/*
		int a = -1;
		int b = 2;
		System.out.println(a);
		System.out.println(-a);
		System.out.println(-b);
		
		boolean a_bool = true;
		boolean b_bool = false;
		System.out.println(!a_bool);
		System.out.println(!b_bool);
		
		int num1 = 1;
		System.out.println("현재 num1 = "+num1);
		num1++;
		System.out.println("현재 num1 = "+num1);
		*/
		
		/*
		 -증감 연산자
		 	전위 : 명령문 실행 전 연산
		 	후위 : 명령문 실행 후 연산
		 	
		 */
		
		// 아래는 증감 연산자의 전위 후위 비교하는 구문
		/*
		System.out.println("현재 num1 = "+num1);
		System.out.println("현재 num1 = "+ ++num1);
		System.out.println("현재 num1 = "+ num1++); // 여기서는 3이 출력되는데, 왜냐하면 프린트 문을 출력을 한뒤에 ++를 수행하기 때문이다.
		System.out.println("현재 num1 = "+ num1);
		*/
		
		int a,b,c,d;
		a=1;
		b=++a;
		c=a++;
		d=b++ + ++c;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		
		
		sc.close();
		
		
		
	
		
		
	}

}
