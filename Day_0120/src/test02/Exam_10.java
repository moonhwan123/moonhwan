package test02;

/*
[�߻� Ŭ����] - �̿ϼ� ���赵
abstract Ű���� ���
new ��� �Ұ�(��ü ���� �Ұ�)

�߻�޼��尡 1���� ������ ������ �߻�Ŭ������ �Ǿ�ߵ�

�� ������Ʈ�� ������ �߻�Ŭ������ ����� ������ �� Ŭ������ ��� �޾ƾߵǴµ�
�߻� �޼ҵ带 ���������� �������̵� �ؾߵ�
����� ���,�޼ҵ带 ���ϼ� �ְ� ����ϴ°��� ����


 */
abstract class AA{
	int x = 100;
	void test() {
		System.out.println("x = " + x);
	}
 	abstract int sum(int x, int y); // �߻�޼��� , ����� ����� �ִ°�
	
}

class BB extends AA{
	@Override
	int sum(int x, int y) {
		
		return x+y;
	}
}





public class Exam_10 {
	public static void main(String[] args) {
		
		AA a = new BB();
		a.sum(1, 500);
		
		
		
	}
}
