package ExceptionTest;

public class ExceptionEx7 {
	
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception {
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;
	}


	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("���ο��� ó��");
		}
		
		
	}

}
