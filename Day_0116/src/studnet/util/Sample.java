package studnet.util;


/*
private : �ش� Ŭ�������� �� ��� ����(�ܺ��� ���� x)

default : ���� �����ڰ� ������ �Ǹ� �ڵ����� ����Ʈ��,���°� �ƴ� -> "���� ��Ű��" �ȿ����� �󸶵��� ��� ����

protected : ���� ��Ű�� + ��Ű���� �޶� ��� �����϶��� ��밡��

public : ���� ����(�ٸ� ��Ű���� ��� import�ϸ� �ȴ�.)

���� ���� ���� �Ŵ� private or public
�Ϲ������� Ŭ�������� public�� �����Ѵ�.

 */

public class Sample {
	private int a = 10;
	void test() {
		int s = a+20; // a������ ��뿡 ������ ���� ���� Ŭ���� �ȿ� �ֱ� ������
	}
}


class BB{
	Sample sam = new Sample();
	void test() {
//		sam.a = 20;
		sam.test();
	}
}