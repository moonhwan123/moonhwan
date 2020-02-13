package OOP;
/*
 [생성자에서 다른 생성자 호출하기]
 	this() - 생성자 호출, this - 참조변수,인스턴스 자신을 가르킨다.
 	
 	-생성자 이름으로 클래스 이름대신 this를 사용
 	-한 생성자에서 다른 생성자를 호출할 때는 반드시 첫줄에서만 가능
 		>초기화 작업 도중 다른 생성자를 호출 시, 호출된 다른 생성자 내에서도 맴버변수들이 값이 초기화 될 수 있음
 */
public class CarTest2 {

	public static void main(String[] args) {
		Car1 k3 = new Car1("red","auto",2);
		Car1 k5 = new Car1();
		Car1 k7 = new Car1(k3);
	}

}


class Car1{
	String color; //색상
	String geartype; //변속종류
	int door; // 문의 갯수
	Car1(){
		this("white","manual",3);
	}
	Car1(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	Car1(Car1 a){
		this.color = a.color;
		this.geartype = a.geartype;
		this.door = a.door;
		
	}
}
	
