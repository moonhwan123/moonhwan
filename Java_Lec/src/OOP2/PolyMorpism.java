package OOP2;

/*
[������-PolyMorpism]
	-�������� ���¸� ���� �� �ִ� �ɷ�
	-�ϳ��� ���������� ����Ÿ���� ��ü�� ������ �� �ִ� ��
	-�θ�Ÿ���� ���������� �ڽ�Ÿ���� ��ü�� �ٷ�� �ִ�.
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
