/*
String(byte[] bytes)
byte[] �迭�� String���� ��ȯ
 */



public class Exam_02 {
	
	public static void main(String[] args) {
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String s = new String(bytes);
		System.out.println("s = "+s);
		
		String ss = new String(bytes,6,4);
		System.out.println("ss = "+ss);
		

		
	}
}
