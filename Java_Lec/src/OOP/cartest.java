package OOP;

public class cartest {

	public static void main(String[] args) {
		/*
		Car k5 = new Car();
		Car k3 = new Car();
		Car k7 = new Car();
		
		k5.color = "red";
		k5.geartpye = "manual";
		k5.door = 4;
		
		k3.color = "blue";
		k3.geartpye = "auto";
		k3.door = 4;
		
		k7.color = "gold";
		k7.geartpye = "auto";
		k7.door = 4;
		
		System.out.println("k5�� ���� : "+k5.color);
		System.out.println("k5�� ���ӱ� ���� : "+k5.geartpye);
		System.out.println("k5�� �� ���� : "+k5.door);
		
		System.out.println("k3�� ���� : "+k3.color);
		System.out.println("k3�� ���ӱ� ���� : "+k3.geartpye);
		System.out.println("k3�� �� ���� : "+k3.door);
		
		System.out.println("k7�� ���� : "+k7.color);
		System.out.println("k7�� ���ӱ� ���� : "+k7.geartpye);
		System.out.println("k7�� �� ���� : "+k7.door);
		*/
		
		
		Car k3 = new Car("red","auto",2);
		Car k5 = new Car("blue","manual",4);
		Car k9 = new Car("green","auto",4);
		
		System.out.println("k5�� ���� : "+k5.color);
		System.out.println("k5�� ���ӱ� ���� : "+k5.geartpye);
		System.out.println("k5�� �� ���� : "+k5.door);
		
		
		
		
		
	}

}

class Car{
	String color; //����
	String geartpye; //��������
	int door; // ���� ����
	
	Car(){
		
	}
	Car(String c, String g, int d){
		color = c;
		geartpye = g;
		door = d;
	}
	Car(String c, String g){
		color = c;
		geartpye = g;
	}
	
	
}
