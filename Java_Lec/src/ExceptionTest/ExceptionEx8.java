package ExceptionTest;

public class ExceptionEx8 {

	public static void main(String[] args) {
		try {
			System.out.println("�ܺ� try");
			try {
				System.out.println("���� try");
				Exception e = new Exception();
				throw e; 
			} catch (Exception e) {
				System.out.println("���� Exception : "+ e);
				System.out.println("���� ������ �ѹ� ��");
				throw e;
			} finally {
				System.out.println("finally ���� ���");
			}
		} catch (Exception e) {
			System.out.println("�ܺ� Exception : " + e);
		}
		System.out.println("����");
	}

}
