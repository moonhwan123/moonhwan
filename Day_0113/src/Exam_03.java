
class AA{ // ���(�޼���)�� ���� Ŭ����
	int x; //�������(�ν��Ͻ�����) , ��ü ������ ���� ����
	int y;
}

class BB{ // �Ӽ��� ���� Ŭ����
	int sum() {
		int x = 100; // ���� ���� -> �޼��尡 ȣ��ɶ� ����!! , �޼��尡 ������ ������
		return x;
	}
	void test(int n) { // n = �Ű����� (����)
		System.out.println("n = "+n);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		
		int a; // ����  (�굵 �ᱹ main�� ��������)
		AA aa = new AA();
		BB bb = new BB();
		
		aa = new AA(); // �̷��� �Ǹ� ����AA���� ���ο�AA�� ���ܼ� �װ� ����Ų��.
					   // �׷� ���� ���� ���������� �״�� �ִ�. �̰�� �ڹٴ� GC�� �˾Ƽ� �����.
		
		aa.x = 10;
		int s = bb.sum();

		
		//
		
		
	}
}
