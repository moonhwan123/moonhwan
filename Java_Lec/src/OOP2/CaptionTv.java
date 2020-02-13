package OOP2;

class point{
	int x = 10;
	int y = 10;
	
}
class point3D extends point {
	// int x; 필요 x
	// int y; 필요 x
	int z;
}

//===========================================

class TV{
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelup() {++channel;}
	void channeldown() {--channel;}
}

class CaptionTv_test extends TV{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption)
			System.out.println(text);
	}
}


public class CaptionTv {

	public static void main(String[] args) {
		
		/*
		[상속]
			-기존의 클래스를 재사용해서 새로운 클래스 작성
			-두 클래스를 조상과 자손(부모,자식)의 관계를 맺어 주는 것
			-자손 클래스는 조상클래스의 모든 멤버를 상속(생성자,초기화 블럭은 상속안됨)
			-자손의 멤버 갯수는 조상보다 적을 수 없다.(같거나 많다.)
			-사용법  
				>> class 자손클래스 extends 조상클래스{
				
				  }
		 */
		point p = new point();
		System.out.println(p.x);
		System.out.println(p.y);
		
		point3D p3d = new point3D();
		System.out.println(p3d.x);
		System.out.println(p3d.y);
		System.out.println();
		
		
		CaptionTv_test ctv = new CaptionTv_test();
		ctv.channel = 10;
		ctv.channelup();
		System.out.println(ctv.channel);
		ctv.caption = true;
		ctv.displayCaption("Hello world");
		

	}

}
