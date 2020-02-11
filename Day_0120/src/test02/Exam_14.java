package test02;

interface Control{
	int MAX_VOLUME=10; // static final 생략
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 (jdk1.8부터 가능)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}else {
			System.out.println("무음해제");
		}
	}
	//스테틱 메소드
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	//인터페이스 구성요소
	//상수, 추상메소드, 디폴트메소드, 스테틱 메소드
}

class Tv implements Control {
	private int volume;
	
	void print() {
		System.out.println("Tv.volume = " + volume);
	}
	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}
	@Override
	public void turnOff() {
		System.out.println("TV OFF");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > Control.MAX_VOLUME) {
			this.volume = Control.MAX_VOLUME;
		}else if (volume < Control.MIN_VOLUME) {
			this.volume = Control.MIN_VOLUME;
		}
		System.out.println("현재 TV 볼륨은 "+ this.volume+ "입니다.");
	}
	
	
}



public class Exam_14 {
	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.turnOn();
		t.setVolume(15);
		t.setMute(true);
		
		
		
		
		
	}
}
