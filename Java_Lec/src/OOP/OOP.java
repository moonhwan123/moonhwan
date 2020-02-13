package OOP;

public class OOP {

	public static void main(String[] args) {
		/*
		 [Object Oriented Programming] - 객체 지향 프로그래밍
		 
		 	-객체지향 이론
		 		: 실제 세계는 '사물(객체)'로 이루어져 있으며
		 		: 발생하는 모든 '사건'들은 '사물(객체)'간의 상호 작용이다.
		 		
		 		: 이 개념을 토대로 프로그래밍 언어 접목 --> 객체지향 프로그래밍
		 		
		 		
		 	-특징
		 		1. 코드의 재사용성이 높다. (함수 또는 메서드)
		 		2. 코드를 관리하기 좋다.
		 		3. 프로그램의 신뢰성이 높아 진다.
		 		
		 	-'클래스' 와 '객체'
		 		1. 클래스는 일종의 설계도
		 		      객체는 그 설계도를 토대로 만들어진 실제 사물
		 		      아이폰 설계도 -> 아이폰(S/N : 111)
		 		      			아이폰(S/N : 222)
		 		
		 		2. 클래스(Class)
		 			정의 : 객체(사물)을 정의 해놓은 것(어떠한 객체를 만들 것인지)
		 			용도 : 객체를 생성
		 			
		 		3. 객체(Object)
		 			정의 : 실제로 존재하는 것
		 			용도 : 클래스에 정의된 대로 사용한다.
		 			
		 			
		 	-객체/인스턴스
		 		인스턴스 : 사례,경우,실체
		 				기본적으로는 객체와 같은 의미
		 				문장에 따라 구분한다.
		 					*클래스(설계도)를 통해 실제로 만들어진 객체를 '인스턴스'라고 한다.
		 					 	
		 				 아이폰은 객체이다.
		 				아이폰 설계도는 객체를 만들수 있다.
		 				내가 가진 아이폰은 인스턴스이다.
		 			
		 		객체의 구성 요소 : 속성, 기능
		 			속성 : 아이폰 색상,크기,카메라 갯수
		 			기능 : 사진을 찍는다, 전화를 건다, 인터넷을 한다
		 				
		 			1) 객체는 클래스에서 정의한 다수의 속성과 기능을 가질 수 있다.
		 			2) 속성 = 변수(멤버변수,필드)
		 			3) 기능 = 함수(메서드)
		 		
		 		인스턴스의 생성과 사용
		 			//클래스명 병수명;// 클래스의 객체를 참조하기 위한 참조변수를 선언
		 			//변수명 = new 클래스명();// 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		 
		 */
		
		TV tv; // TV클래스 타입의 참조변수 tv를 선언
		tv = new TV(); // TV인스턴스를 생성한 후, 생성된 TV 인스턴스 주소를 tv에 저장
		
		tv.channel = 7;
		System.out.println("현재 채널 : "+tv.channel);
		tv.channeldown();
		System.out.println("현재 채널 : "+tv.channel);
		// 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스 타입과 일치해야 한다.
		
		System.out.println();
		
		TV samsung_tv = new TV();
		

		
		samsung_tv.channel = 5;
		System.out.println("현재 채널 : "+samsung_tv.channel);
		samsung_tv.channeldown();
		System.out.println("현재 채널 : "+samsung_tv.channel);
		
		System.out.println();
		
		
		
		TV LG_tv = new TV();
		
		LG_tv.channel = 10;
		System.out.println("현재 채널 : "+LG_tv.channel);
		LG_tv.channelup();
		System.out.println("현재 채널 : "+LG_tv.channel);
		
		//참조변수에는 하나의 값(주소)만이 저장되고
		//둘 이상의 참조변수가 하나의 인스턴스를 참조는 가능하나,
		//하나의 참조변수로 여러개의 인스턴스를 가리키는 것은 안된다.
		
		
		//객체 배열
		
		TV[] tvArr = new TV[3];
		
//		tvArr[0] = new TV();
//		tvArr[1] = new TV();
//		tvArr[2] = new TV();
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i+10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelup();
			}
		
		
		
	}

	
}


//TV 클래스 만들기(설계도 작성)

//속성 : 색상, 길이, 크기, 높이, 채널....(변수)
//기능 : 켜기, 끄기, 볼륨 업다운, 채널 변경....(메서드)

class TV{
	//TV의 속성(멤버변수, 필드)
	String color; // 색상
	boolean power; // 전원
	int channel; // 채널
	
	//TV의 기능
	void power() {
		power = !power;
	}
	void channelup() {
		channel++;
	}
	void channeldown() {
		channel--;
	}
}













