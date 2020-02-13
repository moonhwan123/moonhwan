package OOP;

public class BlockTest {
	
	static {
		System.out.println("static {}");
		
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		
		/*
		 [변수의 초기화]
		 	-변수를 선언하고, 처음으로 값을 저장
		 	-지역변수는 사용전 필히 초기화
		 	-멤버변수(인스턴스,클래스변수)와 배열은 각 타입의 기본값으로 자동 초기화됨
		 	
		 	boolean : false
		 	char : '\u0000'
		 	byte : 0
		 	short : 0
		 	int : 0
		 	long : 0L
		 	float : 0.0f
		 	double : 0.0 또는 0.0d
		 	참조형 변수 : null
		 	
		 [멤버변수의 초기화]
		 	1.명시적 초기화
		 		Ex) int door = 4;
		 			Engine e = new Engine();
		 	2.생성자
		 	3.초기화 블럭
		 		-인스턴스 초기화 블럭 : {}
		 			>생성자에서 공통적으로 수행되는 작업에 사용
		 			>인스턴스 생성될 때마다 실행(단, 생성자보다 먼저 실행됨)
		 		-클래스 초기화 블럭 : static{}
		 			>클래스 변수의 복잡한 초기화에 사용
		 			>클래스 로딩시에 실행
		 */
		
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt= new BlockTest();
		System.out.println("실행순서에 유의 하자!");
		
	}

}
