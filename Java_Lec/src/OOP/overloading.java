package OOP;

public class overloading {
	
	//int add(int a ,int b) {return a+b;}
	//int add(int c ,int d) {return a+b;} ����
	//long add(int a ,int b) {return a+b;} ����
	


	
	
	public static void main(String[] args) {
		/*
		 -�޼��� �����ε�
		 	: �ϳ��� Ŭ������ ���� �̸��� �޼��带 ������ �����ϴ� ��
		 	
		 -�����ε��� ����
		 	: �޼��� �̸��� ���ƾ� �Ѵ�.
		 	: �Ű������� ���� �Ǵ� Ÿ���� �޶���Ѵ�.
		 	: �Ű������� ���� ���� Ÿ���� �ٸ����� �����ε��� �������� ����
		 	
		 -��ǥ���� ��
		 	: System.out.println();
		 	: int add(int a, int b){return a+b;}
		 	  int add(float a, float b){return a+b;}
		 	  
		 -����
		 	: �Ű����� �̸��� �ٸ����� �����ε�X
		 	: ���� Ÿ���� �����ε� ���������� �ƴ�!
		 	
		 	static long add(int a ,long b) {return a+b;} // ����
			static long add(long a ,int b) {return a+b;} // ����
			add(3,5); >> �����߻� ��� Long���� ǥ�� ������� >> �����Ϸ��� ��ǻ�Ͱ� ���� ���� ��� Long���� ��
			>> add(3,5L);
		
		 	
		 */

		MyMath2 mm = new MyMath2();
		System.out.println("mm.add(3,3)�� ��� : "+mm.add(3, 3));
		System.out.println("mm.add(3L,3)�� ��� : "+mm.add(3L, 3));
		System.out.println("mm.add(3,3L)�� ��� : "+mm.add(3, 3L));
		System.out.println("mm.add(3L,3L)�� ��� : "+mm.add(3L, 3L));
		System.out.println("mm.add(3.3,3.3)�� ��� : "+mm.add(3.3, 3.3));
		
		//�迭�� ��� ����� ���� ����� �����ִ� �޼ҵ�
		int[] a = {100,200,300,400,500};
		System.out.println("mm.add(a)�� ��� : "+mm.add(a));
	}


}


class MyMath2{
int add(int a, int b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

long add(long a, int b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

long add(int a, long b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

long add(long a, long b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

double add(double a, double b) {
	System.out.print("int add(int a ,int b) - ");
	return a+b;
}

int add(int[] a) {
	System.out.print("int add(int[] a) - ");
	int sum = 0;
	for (int i=0; i<a.length; i++) {
		sum = sum+a[i];
		}
	return sum;
}





}


