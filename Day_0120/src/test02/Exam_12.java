package test02;
/*
[�������̽�(interface,����)]
���, �߻�޼ҵ� �� �ִ�. -> �����ϰ� ��ɸ��� �������ִ�.
�����ڵ� �������̽� ��ü
���߻���� ���ؼ� ���


 */

interface Car{
	static final int MAX = 100;
	void test();
	int sum(int x, int y);
	//�տ� abstract �Ⱥٿ��� �ȴ�.
}

//�������̽� ����
class Truck implements Car{
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

public class Exam_12 {
	public static void main(String[] args) {

		
		
		
		
		
	}
}
