package OOP2;
/*
 super()
 	-부모의 생성자
 	-자식클래스의 인스턴스 생성시 -> 자식멤버+부모멤버 = 하나의 인스턴스
 	-부모의 멤버들도 초기화 필요 시 
 	
 	object 클래스를 제외한 모든 클래스의 생성자 첫줄에는 생성자를 필히 호출
 	생략시 컴파일러가 자동으로 super(); 생성
 	
 */
public class PointTest {

	public static void main(String[] args) {
		Point_3D p3 = new Point_3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}

}

class Point1{
	int x;
	int y;
	Point1(int x, int y){
		this.x = x;
		this.y = y;	
	}
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
	
}

class Point_3D extends Point1{
	int z;
	
	public Point_3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	String getLocation() {
		return "x : "+x+", y : "+y+", z : "+z;
	}
}