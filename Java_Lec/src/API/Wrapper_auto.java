package API;

public class Wrapper_auto {

	public static void main(String[] args) {
		
		int i1 = 10;
//		Integer wi = new Integer(i1);    --> �ڽ�
		Integer wi = i1; // --> ����ڽ�
		
//		int i2 = Integer.valueOf(wi);     --> ��ڽ�
		int i2 = wi; // --> ���� ��ڽ�
		
		double dl = 3.14;
		Double wd = dl; // -->  ����ڽ�
		double dl2 = wd; // -->  �����ڽ�
		
		
		/*
		���������� ����(Wrapper) Ŭ������ ���Ե� ���� 
		== , != �� ���� �� �����ڸ� �̿��Ͽ� ���� �� �Ұ�
		�ν��Ͻ� �������� ���� heap �޸𸮿� ���� ����ǰ� ������ �������� ������.
		
		equals() �޼��� �̿� �Ǵ� , �����͸� ��ڽ��Ͽ� ���� ��
		
		
		 */
		

	}

}
