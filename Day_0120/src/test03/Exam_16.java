package test03;

interface Car{
	void test();
}

class Truck implements Car{
	@Override
	public void test() {
		System.out.println("Truck Call");
		
	}
}

public class Exam_16 {
	public static void main(String[] args) {
		 
		Car c = new Truck();
		c.test();
		System.out.println("===============");
		
		//�������̽� �͸� ����
		//�͸��� ��ü
		Car cc = new Car() {
			public void test() {
				System.out.println("Car Call");
			}
		};
		cc.test();
		
		
		
		
		
		
	}
}
