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
		
		System.out.println("k5의 색상 : "+k5.color);
		System.out.println("k5의 변속기 종류 : "+k5.geartpye);
		System.out.println("k5의 문 갯수 : "+k5.door);
		
		System.out.println("k3의 색상 : "+k3.color);
		System.out.println("k3의 변속기 종류 : "+k3.geartpye);
		System.out.println("k3의 문 갯수 : "+k3.door);
		
		System.out.println("k7의 색상 : "+k7.color);
		System.out.println("k7의 변속기 종류 : "+k7.geartpye);
		System.out.println("k7의 문 갯수 : "+k7.door);
		*/
		
		
		Car k3 = new Car("red","auto",2);
		Car k5 = new Car("blue","manual",4);
		Car k9 = new Car("green","auto",4);
		
		System.out.println("k5의 색상 : "+k5.color);
		System.out.println("k5의 변속기 종류 : "+k5.geartpye);
		System.out.println("k5의 문 갯수 : "+k5.door);
		
		
		
		
		
	}

}

class Car{
	String color; //색상
	String geartpye; //변속종류
	int door; // 문의 갯수
	
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
