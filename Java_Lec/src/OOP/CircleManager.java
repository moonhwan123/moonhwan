package OOP;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; //x,y,radius 초기화
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+this.x+","+this.y+")"+this.radius);
	}
}

public class CircleManager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i = 0; i<c.length; i++) {
			System.out.print("x,y,radius >>");
			double x = sc.nextDouble(); //x 값 읽기
			double y = sc.nextDouble(); //y 값 읽기
			int radius = sc.nextInt();	//radius 값 읽기
			c[i] = new Circle(x,y,radius); //Circle 객체 생성
		}
		for(int i = 0; i<c.length; i++) {
			c[i].show(); //모든 Circle객체 출력
		}
		sc.close();

	}

}
