package OOP2;

/*
[다형성-PolyMorpism]
	-여러가지 형태를 가질 수 있는 능력
	-하나의 참조변수로 여러타입의 객체를 참조할 수 있는 것
	-부모타입의 참조변수로 자식타입의 객체를 다룰수 있다.
 */


class A{
	void methodA() {
		System.out.println("MethodA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("MethodB");
	}
}

public class PolyMorpism {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.methodA();
		
		B obj1 = new B();
		obj1.methodA();
		
		obj = new B();
		obj.methodA();

	}

}
