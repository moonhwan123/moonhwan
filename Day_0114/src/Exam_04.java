/*
������ ���� 
1. ���� ����(static) -> Ŭ���� ����(�޸𸮰� �ε� �ɶ� ����,�޼ҵ� ������ �������)
2. ��� ����(�ν��Ͻ� ����)
3. ���� ����(�Ű� ����)
 */

class BB{
	int a = 10; // ���(�ν��Ͻ�)����
	static int b = 20; // Ŭ����(����)����
			    // static������ ��� ��ü�� �����Ѵ�.
}


public class Exam_04 {
	public static void main(String[] args) {
		
		BB b1 = new BB();
		
		BB b2 = new BB();
		
		System.out.println("b1.a = "+b1.a);
		System.out.println("b1.b = "+b1.b);
		System.out.println("b2.a = "+b2.a);
		System.out.println("b2.b = "+b2.b+"\n");
		
		b1.b++;
		System.out.println("b1.b++;"+"\n");
		
		System.out.println("b1.a = "+b1.a);
		System.out.println("b1.b = "+b1.b);
		System.out.println("b2.a = "+b2.a);
		System.out.println("b2.b = "+b2.b);
		
		
		
	}
}
