package ExceptionTest;

public class ExceptionEx3 {
	public static void main(String[] args) {
		/*
		[try �� ������ ���� �߻� ��]
			1.�߻��� ���ܿ� ��ġ�ϴ� Catch ���� �ִ��� Ȯ��
			2.��ġ �ϴ� catch �� �����, �ش�catch �� ���� ���� ����
				��ü try-catch���� �������� ���� ���� ����
		[�߻� ���� ������]
			1.catch ���� ��ġ�� �ʰ� try-catch���� ���������� ���� ���
		 */
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(0/0); // �̰� �ְ� ������ ���� ����
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			e.printStackTrace(); // ���� �߻� ����� ȣ�� ���ÿ� �־��� �޼����� ������ �޽����� ȭ�鿡 ���
			System.out.println("���� �޽��� : "+e.getMessage()); // �߻��� ���� Ŭ������ �ν��Ͻ��� ����� �޽����� ���� �� �ִ�.
		} 
		
		System.out.println(6);
	
}
}
