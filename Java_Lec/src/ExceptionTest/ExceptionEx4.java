package ExceptionTest;

public class ExceptionEx4 {
	public static void main(String[] args) {
		
		try {
			int a[] = {2,0};
			int b = 4;
			int c = b/a[1];
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �ʰ� ���� �߻�");
		} catch (ArithmeticException ae) {
			System.out.println("��� ���� �߻�");
		} catch(Exception ee) { // ���� ���� ���� �� �׳� �̰� �����
			System.out.println("���� �߻�");
		}
		
	}
	

}
