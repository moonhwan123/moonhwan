package ExceptionTest;
/*
[����� ���� ����ó��]
 */
class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}

public class ExceptionEx9 {
	
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("���� �Է��� �߸� �Ǿ����ϴ�.");
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
