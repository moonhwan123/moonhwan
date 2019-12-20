package ExceptionTest;

public class ExceptionEx5 {

	public static void main(String[] args) {
		

		
		try {
			System.out.println("외부로 접속");
			int c = 2/0;
			System.out.println("연결해제");
		} catch (ArithmeticException ae) {
			System.out.println("산술 오류 발생");
		} finally {
			System.out.println("무조건 연결 해제"); //예외 발생 유무와 관계없이 실행됨
		}

	}

}
