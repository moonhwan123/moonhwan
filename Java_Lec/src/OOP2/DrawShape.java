package OOP2;

import java.awt.Frame;

public class DrawShape {
	
	public static void main(String[] args) {
		/*
		 ���԰���(���X)
		 	-Ŭ�������� ���踦 �ξ��ִ� ���
		 	-Ŭ���� ���� �� ��� ������ �ٸ� Ŭ���� Ÿ���� �������� ����
		
			-���߼Ӽ� ��� �� ���� �������� ����� ���� Ŭ���� ������ ����������
			-���� �ٸ� Ŭ������ ���� ��� ���� ������� �̸��� ���� ��� ���� �Ұ�(����)
			-��� Ŭ���� ���� ���谡 ���� ��Ȯ,�ڵ带 ���� �ŷ� ����
			-������ ���� Ŭ���� �ϳ��� ��� ����� �������� ���� ����
		
		Object Class
			-��� Ŭ������ �ְ� ���� Ŭ����
			-������ ���� Ŭ������ �ڵ�������  Object Ŭ���� ���
			-��� �������� �ֻ����� ��ġ
			-��� Ŭ������ Object Ŭ������ ���� �� 11���� �޼��带 ���
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
















