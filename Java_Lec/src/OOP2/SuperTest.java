package OOP2;

public class SuperTest {

	public static void main(String[] args) {
		/*
		 Super - 참조변수
		 
		 this
		 	-인스턴스 자신을 가리키는 참조변수
		 	-인스턴스의 주소 저장
		 super
		 	-부모의 멤버와 자신의 멤버를 구별하는 용도로 사용
		 	-this와 동일
		 */
		Child c = new Child();
		c.method();

	}

}

class Parent{
	int x = 10;
}
class Child extends Parent{
	
	int x = 20;
	
	void method() {
		System.out.println("x = "+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x);
	}
}
