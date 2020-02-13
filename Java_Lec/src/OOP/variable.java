package OOP;

public class variable {

	public static void main(String[] args) {
		/*
		 선언 위치에 따른 변수의 종류
		 
		 -클래스 변수
		 	선언 위치 : 클래스 영역
		 	생성 시기 : 클래스가 메모리에 올라갈 때
		 		>인스턴스 변수 앞에 static
		 		>모든 인스턴스가 공통된 저장곤간을 공유
		 		>한 클래스의 모든 인스턴스 들이 공통적인 값을 유지 해야 하는 경우
		 		
		 		
		 -인스턴스 변수
		 	선언 위치 : 클래스 영역
		 	생성 시기 : 인스턴스가 생성되었을 때
		 		>인스턴스 생성 필수, 독립적인 저장 공간을 가지므로 서로 다른 값을 가질 수 있다.
		 		>인스턴스마다 고유한 상태를 유지해야 하는 경우 사용
		 		
		 -지역 변수
		 	선언 위치 : 클래스 영역 이외의 영역(메서드,생성자,초기화 블럭 내부)
		 	생성 시기 : 변수 선언문이 수행 되었을 때
		 		>메서드 내에서 선언되어 메서드 내에서만 사용가능
		 		>메서드가 종료되면 소멸
		 		
		 */
		
		System.out.println("Card.width : "+Card.width); // 클래스변수는 따로 변수선언 안해도 사용가능
		System.out.println("Card.height : "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 4;
		
		System.out.println("c1은 "+c1.kind+c1.num+"이며 , 크기는("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+c2.num+"이며 , 크기는("+c2.width+","+c2.height+")");
		
		c1.height = 50;
		c1.width = 100; // 전체가 바뀌어 버림 이렇게 하면
		
		System.out.println("c1은 "+c1.kind+c1.num+"이며 , 크기는("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+c2.num+"이며 , 크기는("+c2.width+","+c2.height+")");
		
		//인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로 각기 다른 값 유지
		//클래스 변수는 모든 인스턴스가 하나의 저장 공간을 공유하므로 항상 공통된 값
		
	}

}

class Card{
	String kind; 
	int num;
	// 무늬와 숫자는 제각각
	
	static int width = 100;
	static int height = 250;
}


