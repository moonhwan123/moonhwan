package ExceptionTest;
/*
[사용자 정의 예외처리]
 */
class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}

public class ExceptionEx9 {
	
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("나이 입력이 잘못 되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
