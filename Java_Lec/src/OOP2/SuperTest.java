package OOP2;

public class SuperTest {

	public static void main(String[] args) {
		/*
		 Super - ��������
		 
		 this
		 	-�ν��Ͻ� �ڽ��� ����Ű�� ��������
		 	-�ν��Ͻ��� �ּ� ����
		 super
		 	-�θ��� ����� �ڽ��� ����� �����ϴ� �뵵�� ���
		 	-this�� ����
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