package OOP;

class MyMath{
	int a,b;
	//인스턴스 변수  a,b만을 이용하여 작업하므로 매개변수 필요없음
	int add() {return a+b;}
	int sub() {return a-b;}
	int mul() {return a*b;}
	int div() {return a/b;}
	
	//인스턴스 변수와 관계없이 매개 변수만으로 작업 가능
	static int add1(int a, int b) {return a+b;}
	static int sub1(int a, int b) {return a-b;}
	static int mul1(int a, int b) {return a*b;}
	static int div1(int a, int b) {return a/b;}
	
}

public class MyMathTest {

	public static void main(String[] args) {
		
		/*
		-인스턴스 메서드
			: 인스턴스 생성 후 '참조변수.메서드이름()'으로 호출
			: 인스턴스 변수나 인스턴스 메서드와 관련된 작업하는 메서드
			: 메서드 내에서 인스턴스 변수 사용 가능
			
		 
		-클래스 메서드(static 메서드)
			: 객체 생성 없이 '클래스이름.메서드이름()' 으로 호출
			: 인스턴스 변수나 인스턴스메서드와 관련 없는 작업을 하는 메서드
			: 클래스 메서드 내에서는 인스턴스 변수 사용 불가
			: 메서드 내에서 인스턴스 변수를 사용하지 않는 다면 static붙이는 것 고려
			
		 */
		
		//클래스 메서드
		System.out.println(MyMath.add1(200, 100));
		System.out.println(MyMath.sub1(200, 100));
		System.out.println(MyMath.mul1(200, 100));
		System.out.println(MyMath.div1(200, 100));
		
		System.out.println();
		
		MyMath mm = new MyMath();
		mm.a = 200;
		mm.b = 100;
		
		//인스턴스메서드는 객체 생성 후에만 호출이 가능함
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());

	}

}
