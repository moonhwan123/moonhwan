package ExceptionTest;

public class ExceptionEx5 {

	public static void main(String[] args) {
		

		
		try {
			System.out.println("�ܺη� ����");
			int c = 2/0;
			System.out.println("��������");
		} catch (ArithmeticException ae) {
			System.out.println("��� ���� �߻�");
		} finally {
			System.out.println("������ ���� ����"); //���� �߻� ������ ������� �����
		}

	}

}
