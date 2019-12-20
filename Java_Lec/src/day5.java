import java.util.Scanner;

public class day5 {

	public static void main(String[] args) {
		
		/*
		 -대입 연산자
		 	
		 	= : 왼쪽의 피연산자에 오른쪽  대입
		 		num = 1 + 2
		 	
		 	복합 대입 연산자
		 		a+=b : a = a + b
		 		a-=b : a = a - b
		 		a*=b : a = a * b
		 		a/=b : a = a / b
		 
		 	
		 
		 
		 */
		
		/*
		int a = 3, b = 3, c = 3;
				a+=3;
				b*=3;
				c%=2;
				
		System.out.println("a="+a+"\nb="+b+"\nc="+c);
		System.out.println();
		b += a;
		c -=a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		*/
		
		
		/*
		 -비교 연산자
		 
		 	: 양변을 비교하여 같으면 True 다르면 False
		 	
		 	== : 같다 
		 	>  : 크다
		 	<  : 작다
		 	>= : 크거나 같다
		 	<= : 작거나 같다
		 	!= : 같지 않다
		 
		 
		 */
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a+b<=c);
		System.out.println(a+b>c);
		System.out.println();
		
		System.out.println('a'>'b'); // 문자는 자동으로 아스키 코드표에 있는 값으로 계산한다.
		System.out.println(!(3!=2));
		System.out.println();
		
		String str = "Hello Java";
		System.out.println(str == "Hello java");
		// 자바에서는 대소문자 다르게 취급
		System.out.println(str.equals("Hello Java"));
		
		
		/*
		 -논리 연산자
		 
		 	: 여러가지 조건을 동시에 검사하는 경우 사용
		 	: 비교하는 두 값이 Boolean 형태 이여야함
		 	
		 	&&(AND) : 둘다 True 일때 True
		 	||(OR) : 둘 중 하나만 True면 True
		 	!(NOT) : True -> False , False -> True
		 	
		 */
		System.out.println();
		
		int d = 10;
		System.out.println(5<d && d<15); // 5 < x < 15
		System.out.println((5<d && d<15) && d%2==0);
		
		//char ch = 'a';
		// (ch >= 'A') && (ch <= 'Z') ;
		
		/*
		 -비트연산
		 	
		 	비트 AND(&) : 비트 단위의 AND연산
		 	비트 OR(|) : 비트 단위의 OR연산
		 	비트 XOR(^) : 비트 단위의 XOR연산
		 	비트 NOT(~) : 부호 반전
		 	
		 -시프트 연산자
		 	>> : 오른쪽으로 비트 이동 (비트 하나 이동 / 2)
		 	<< : 왼쪽으로 비트 이동 (비트 하나 이동 * 2)
		 	
		 */
		System.out.println();
		int bit_a = 17;
		int bit_b = 5;
		
		System.out.println(bit_a&bit_b);
		System.out.println(bit_a|bit_b);
		System.out.println(bit_a>>1);
		System.out.println(bit_a>>2);
		System.out.println(bit_b<<1);
		
		/*
		 -삼항 연산자
		 	
		 	: 항이 세개인 연산자
		 	: 조건식의 결과에 따라 결과 반환
		 	: 조건? 항목1(참) : 항목2(거짓)
		 */
		
		System.out.println();
		int age= 17;
		System.out.println(age>19?"성인":"청소년");
		
		// 연습문제
		// 두 개의 값을 입력 받고 , 두 수중에 가장 큰 수를 화면에 출력해라
		// 응용 , 세 개의 수를 입력 받고, 가장 큰수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력 하세요 :");
		int num_A = sc.nextInt();
		int num_B = sc.nextInt();
	
		System.out.println("두 수중 큰 수는 "+(num_A<num_B?num_B:num_A));
		
		sc.close();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
