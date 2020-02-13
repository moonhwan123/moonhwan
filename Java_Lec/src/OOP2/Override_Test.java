package OOP2;

public class Override_Test {

	public static void main(String[] args) {
		/*
		[오버 라이딩]
			-조상클래스로 부터상속받은 메서드의 내용을 상속받은 클래스에 맞게 '변경하는것'
			
			-조건
				> 선언부가 같아야 한다.(이름,매개변수,리턴타입)
				> 접근제어자를 좁은 변경할 수 있다.
				> 조상클래스의 메서드보다 많은 수의 예외선언X
				
			-오버로딩
				> 기존에 없는 새로운 메서드를 정의
			-오버라이딩
				> 상속받은 메서드의 내용을 변경(재정의)
		 */
		point_XY xy = new point_XY();
		point_XY_3D xy_3d = new point_XY_3D();
		
		xy.x = 10;
		xy.y = 20;
		
		xy_3d.x = 40;
		xy_3d.y = 50;
		xy_3d.z = 100;
		
		System.out.println(xy.getLocation());
		System.out.println(xy_3d.getLocation());

	}

}
class point_XY{
	int x;
	int y;
	
	String getLocation() {
		return "x : " +x+ " ,y : "+y;
	}
}

class point_XY_3D extends point_XY{
	int z;
	String getLocation() {
		return "x : "+x+" ,y : "+y+ " ,z : " +z;
	}
	
}
