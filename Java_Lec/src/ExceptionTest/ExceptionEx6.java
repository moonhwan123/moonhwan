package ExceptionTest;
/*
[고의적인 예외의 발생]
	(1) throw 사용
		1.연산자 new를 이용해서 발생시키려는 예외클래스의 객체 생성
		2.키워드 throw로 예외 발생
		
 */

public class ExceptionEx6 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의 발생시킴");
			throw e;
			//throw new Exception("고의 발생"); -> 위랑 같은 말임
		} catch (Exception e1) {
			System.out.println("에러 메세지 : "+e1.getMessage());
			e1.printStackTrace();
		}
		System.out.println("프로그램이 정상종료");

	}

}
