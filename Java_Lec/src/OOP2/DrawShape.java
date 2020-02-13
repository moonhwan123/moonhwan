package OOP2;

import java.awt.Frame;

public class DrawShape {
	
	public static void main(String[] args) {
		/*
		 포함관계(상속X)
		 	-클래스간의 관계를 맺어주는 방법
		 	-클래스 정의 시 멤버 변수에 다른 클래스 타입의 참조변수 선언
		
			-다중속성 사용 시 여러 복합적인 기능을 가진 클래스 구현이 가능하지만
			-서로 다른 클래스로 부터 상속 받은 멤버간의 이름이 같은 경우 구별 불가(단점)
			-대신 클래스 간의 관계가 보다 명확,코드를 더욱 신뢰 가능
			-비중이 높은 클래스 하나만 상속 관계로 나머지는 포함 관계
		
		Object Class
			-모든 클래스의 최고 조상 클래스
			-조상이 없는 클래스는 자동적으로  Object 클래스 상속
			-상속 계층에서 최상위에 위치
			-모든 클래스는 Object 클래스에 정의 된 11개의 메서드를 상속
			-toString,equals,hasCode()...;
		 */
		
		
		Point_1[] p = {
				new Point_1(100,100),
				new Point_1(140,50),
				new Point_1(200,100)
		};
		
		Circle c = new Circle(new Point_1(150,150),50);
		Triangle t = new Triangle(p);
		c.draw();
		t.draw();
	}
}

class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color = %s]\n",color);
	}
}

class Point_1{
	int x;
	int y;
	
	Point_1(){
		this(0,0);
	}
	Point_1(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape{
	Point_1 center;
	int r;
	
	Circle(Point_1 center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s\n",center.x,center.y,r,color);
	}
}

class Triangle extends Shape{
	Point_1[] p = new Point_1[3];
	
	public Triangle(Point_1[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("p1 = %s, p2 = %s, p3 = %s, color = %s \n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}
















