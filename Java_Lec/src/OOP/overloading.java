package OOP;

public class overloading {
	
	//int add(int a ,int b) {return a+b;}
	//int add(int c ,int d) {return a+b;} 오류
	//long add(int a ,int b) {return a+b;} 오류
	


	
	
	public static void main(String[] args) {
		/*
		 -메서드 오버로딩
		 	: 하나의 클래스에 같은 이름의 메서드를 여러개 정의하는 것
		 	
		 -오버로딩의 조건
		 	: 메서드 이름이 같아야 한다.
		 	: 매개변수의 개수 또는 타입이 달라야한다.
		 	: 매개변수는 같고 리턴 타입이 다른경우는 오버로딩이 성립하지 않음
		 	
		 -대표적인 예
		 	: System.out.println();
		 	: int add(int a, int b){return a+b;}
		 	  int add(float a, float b){return a+b;}
		 	  
		 -주의
		 	: 매개변수 이름이 다른것은 오버로딩X
		 	: 리턴 타입은 오버로딩 성립조건이 아님!
		 	
		 	static long add(int a ,long b) {return a+b;} // 성립
			static long add(long a ,int b) {return a+b;} // 성립
			add(3,5); >> 오류발생 어디가 Long인지 표시 해줘야함 >> 컴파일러나 컴퓨터가 위에 둘중 어디가 Long인지 모름
			>> add(3,5L);
		
		 	
		 */

		MyMath2 mm = new MyMath2();
		System.out.println("mm.add(3,3)의 결과 : "+mm.add(3, 3));
		System.out.println("mm.add(3L,3)의 결과 : "+mm.add(3L, 3));
		System.out.println("mm.add(3,3L)의 결과 : "+mm.add(3, 3L));
		System.out.println("mm.add(3L,3L)의 결과 : "+mm.add(3L, 3L));
		System.out.println("mm.add(3.3,3.3)의 결과 : "+mm.add(3.3, 3.3));
		
		//배열의 모든 요소의 합을 결과로 돌려주는 메소드
		int[] a = {100,200,300,400,500};
		System.out.println("mm.add(a)의 결과 : "+mm.add(a));
	}


}


class MyMath2{
int add(int a, int b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

long add(long a, int b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

long add(int a, long b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

long add(long a, long b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

double add(double a, double b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

int add(int[] a) {
	System.out.print("int add(int[] a) - ");
	int sum = 0;
	for (int i=0; i<a.length; i++) {
		sum = sum+a[i];
		}
	return sum;
}





}


