package OOP;

public class FactorialTest {

	public static void main(String[] args) {
		/*
		 -재귀 호출
		 	: 메서드 내에서 자기자신을 반복적으로 호출
		 	: 재귀호출은 반복문으로 바꿀 수 있으며 반복문 보다 성능이 나쁨
		 	: 이해하기 쉽고, 간결한 코드작성 가능
		 	
		 	예 ) 팩토리얼,제곱,트리운행,폴더목록표시
		 */
		
		
		
		
		//제곱연산
		
		int x = 2;
		int n = 5;
		
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x,i);
		}
		System.out.println(result);
		
		//펙토리얼
		//5! = 1x2x3x4x5
		
		System.out.println(fact(5));
		

	}
	
	static long fact(int n) {
		long result = 0;
		
		if(n == 1)
			return 1;
		
		return n*fact(n-1);
	}
	
	
	
	static long power(int x,int n) {
		
		if(n ==1 )
			return x;
		
		return x*power(x,n-1);
	}

}
