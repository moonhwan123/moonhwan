package InnerClass;


/*
[���� Ŭ���� (Inner Class)]
	-Ŭ���� �ȿ� ����� Ŭ����
	-Ư�� Ŭ���������� �ַ� ���Ǵ� Ŭ����
	-GUI(AWT,SWING)�� �̺�Ʈ ó�� ��
	
	-����
		1. ����Ŭ�������� �ܺ� Ŭ������ ����� ���� ����
		2. �ڵ��� ���⼺�� ����
	
	-����Ŭ������ ������ Ư¡
		������ ������ġ�� ���� ������ ����(��ȿ������ ������ ����)
		
		1. �ν��Ͻ� Ŭ����
			������ġ : �ܺ�Ŭ������ ��� ����
			��� : �ܺ�Ŭ������ �ν��Ͻ� ��� ó�� Ȱ��, �ܺ� Ŭ������ �ν��Ͻ� ������ ���õ� �۾��� ���
		2. static Ŭ����
			������ġ : �ܺ�Ŭ������ ��� ����
			��� : �ܺ�Ŭ������ static��� ó�� ���
		3. local Ŭ����
			������ġ  : �ܺ�Ŭ������ �޼��峪 �ʱ�ȭ ��
			��� : ����� ���� ���ο����� ��밡��
		4. �͸� Ŭ����
			Ư¡ : Ŭ������ ����, ��ü�� ������ ���ÿ� �ϴ� �̸� ���� Ŭ����(��ȸ��)
			
		
 */

public class InnerEx {
	
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;  --> ���� �߻� static���� ���� X
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{ // �޼��� ���� Ŭ����
			int iv = 300;
//			static int cv = 300;  --> ���� �߻� static���� ���� X
			final static int CONST = 300;
		}
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		

	}

}
