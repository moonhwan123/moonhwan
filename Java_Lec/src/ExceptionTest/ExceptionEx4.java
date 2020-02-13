package ExceptionTest;

public class ExceptionEx4 {
	public static void main(String[] args) {
		
		try {
			int a[] = {2,0};
			int b = 4;
			int c = b/a[1];
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과 오류 발생");
		} catch (ArithmeticException ae) {
			System.out.println("산술 오류 발생");
		} catch(Exception ee) { // 무슨 오류 인지 모름 그냥 이거 쓰면됨
			System.out.println("오류 발생");
		}
		
	}
	

}
