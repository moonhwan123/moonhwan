package InnerClass;

/*
 ����Ŭ������ ����������
 	-������ ��밡���� ���������ڿ� ����
 	-static Ŭ������ static��� ���� ����
 	-���� Ŭ������ �ܺ� Ŭ������ ����� ����, ������ ���ټ�
 	-�ܺ� Ŭ������ ���������� final�� ���� ����� ���� ����
 */

public class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; --> �����߻�
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int Lv = 0; // JDK1.8 ���ʹ� final��������
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerIv;
			
			int liv3 = lv;
			int liv4 = Lv;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
