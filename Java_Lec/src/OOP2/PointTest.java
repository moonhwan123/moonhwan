package OOP2;
/*
 super()
 	-�θ��� ������
 	-�ڽ�Ŭ������ �ν��Ͻ� ������ -> �ڽĸ��+�θ��� = �ϳ��� �ν��Ͻ�
 	-�θ��� ����鵵 �ʱ�ȭ �ʿ� �� 
 	
 	object Ŭ������ ������ ��� Ŭ������ ������ ù�ٿ��� �����ڸ� ���� ȣ��
 	������ �����Ϸ��� �ڵ����� super(); ����
 	
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