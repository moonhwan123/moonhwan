package OOP2;
/*
 참조변수의 형변환
 	-서로 상속관계에 있는 타입간의 형변환만 가능
 	-자식 타입에서 부모타입으로 형변환 시 생략 가능
 */
public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = fe;//Car fe = (Car)new FireEngine():
//		car.water();
		fe2 = (FireEngine)car;//자식타입 <-부모타입
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










