package OOP2;
/*
 ���������� ����ȯ
 	-���� ��Ӱ��迡 �ִ� Ÿ�԰��� ����ȯ�� ����
 	-�ڽ� Ÿ�Կ��� �θ�Ÿ������ ����ȯ �� ���� ����
 */
public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = fe;//Car fe = (Car)new FireEngine():
//		car.water();
		fe2 = (FireEngine)car;//�ڽ�Ÿ�� <-�θ�Ÿ��
		fe2.water();
		
		
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~~~");
	}
	void stop() {
		System.out.println("Stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("Water~~~~~");
	}
}










