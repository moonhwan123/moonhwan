package ExceptionTest;
/*
[�������� ������ �߻�]
	(1) throw ���
		1.������ new�� �̿��ؼ� �߻���Ű���� ����Ŭ������ ��ü ����
		2.Ű���� throw�� ���� �߻�
		
 */

public class ExceptionEx6 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("���� �߻���Ŵ");
			throw e;
			//throw new Exception("���� �߻�"); -> ���� ���� ����
		} catch (Exception e1) {
			System.out.println("���� �޼��� : "+e1.getMessage());
			e1.printStackTrace();
		}
		System.out.println("���α׷��� ��������");

	}

}
