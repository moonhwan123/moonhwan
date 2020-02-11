package test01;

//3번에서 한거 테스트


class Tv{
	String model;
	int inch;
	
	Tv(String model, int inch){
		this.model = model;
		this.inch = inch;
	}
	
	void printTv() {
		System.out.println("Tv 모델 : " + model);
		System.out.println("Tv 크기 : " + inch);
	}
}

final class DigitalTv extends Tv { // 상속 관계에 final을 붙이면 더이상 상속을 허락 하지 않겠다. 라는 의미
	
	DigitalTv(){ // 무조건 조상클래스의 "디폴트 생성자"가 실행됨
		super("삼성",16); // 조상클래스의 생성자(조상에 디폴트생성자 없으면 이런식으로 강제로 호출 해줘야됨)
	}
	
}

//class SmartTv extends DigitalTv{
	
//}

public class Exam_04 {
	public static void main(String[] args) {
		
		
		
		
	}
}
