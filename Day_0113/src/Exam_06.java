class Point{
	int x; // ����� �ʱ�ȭ
	int y;

	
	Point(){ // "����Ʈ ������"�� �츮�� ���ص� �ڵ����� �������
		     // Ŭ���� �̸��� �Ȱ��� �޼��� = "������!"
		     // �׷��� �����ڸ� ������ �̰� ����ߵ� 
		System.out.println("AA");
	}
	Point(int a){ // �̷��� �����ڸ� ����� ������ ���� "����Ʈ ������"�� ����� ��ߵ�
		x = a;
		System.out.println("AAA");
	}
	Point(int a,int b){ // ���� �Ű������� "����"�� �ٸ����
		x = a;
		y = b;
		System.out.println("AAAA");
	}
	Point(int a,double b){ // ���� �Ű������� "����"�� �ٸ����
		x = a;
		double c = b;
		System.out.println("AAAA");
	}
	
	//�� ó�� �Ȱ��� �̸��� �޼��尡 ������ �����Ǵ°��� "�����ε�"
	//�޼��� �̸��� "������" �Ȱ��� �Ű�����(����,����)�� �ٸ���!
	//�̰��� �����ε��� ��Ģ
	
	//�޼���� �������� ��������?
	//-> ����Ÿ�԰� ���������ڰ� ����.
	
}

public class Exam_06 {
	public static void main(String[] args) {
		
		
		Point p1 = new Point(); // Ŭ���� ���� �� Point(); �޼��� �����µ� ���? -> ����Ʈ �����ڶ� �׷���.
		Point p2 = new Point(400);
		Point p3 = new Point(100,200);
		

		p1.x = 10; //���� �ʱ�ȭ
		System.out.println("p1.x = "+p1.x);
		System.out.println("p2.x = "+p2.x);
		System.out.println("p3.x = "+p3.x);
		System.out.println("p3.y = "+p3.y);
		
		
		
		
		
		
		
	}
}
