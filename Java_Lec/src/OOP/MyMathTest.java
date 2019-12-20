package OOP;

class MyMath{
	int a,b;
	//�ν��Ͻ� ����  a,b���� �̿��Ͽ� �۾��ϹǷ� �Ű����� �ʿ����
	int add() {return a+b;}
	int sub() {return a-b;}
	int mul() {return a*b;}
	int div() {return a/b;}
	
	//�ν��Ͻ� ������ ������� �Ű� ���������� �۾� ����
	static int add1(int a, int b) {return a+b;}
	static int sub1(int a, int b) {return a-b;}
	static int mul1(int a, int b) {return a*b;}
	static int div1(int a, int b) {return a/b;}
	
}

public class MyMathTest {

	public static void main(String[] args) {
		
		/*
		-�ν��Ͻ� �޼���
			: �ν��Ͻ� ���� �� '��������.�޼����̸�()'���� ȣ��
			: �ν��Ͻ� ������ �ν��Ͻ� �޼���� ���õ� �۾��ϴ� �޼���
			: �޼��� ������ �ν��Ͻ� ���� ��� ����
			
		 
		-Ŭ���� �޼���(static �޼���)
			: ��ü ���� ���� 'Ŭ�����̸�.�޼����̸�()' ���� ȣ��
			: �ν��Ͻ� ������ �ν��Ͻ��޼���� ���� ���� �۾��� �ϴ� �޼���
			: Ŭ���� �޼��� �������� �ν��Ͻ� ���� ��� �Ұ�
			: �޼��� ������ �ν��Ͻ� ������ ������� �ʴ� �ٸ� static���̴� �� ���
			
		 */
		
		//Ŭ���� �޼���
		System.out.println(MyMath.add1(200, 100));
		System.out.println(MyMath.sub1(200, 100));
		System.out.println(MyMath.mul1(200, 100));
		System.out.println(MyMath.div1(200, 100));
		
		System.out.println();
		
		MyMath mm = new MyMath();
		mm.a = 200;
		mm.b = 100;
		
		//�ν��Ͻ��޼���� ��ü ���� �Ŀ��� ȣ���� ������
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());

	}

}
