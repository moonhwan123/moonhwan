import java.io.IOException;

/*
문제) 키보드로 1문자 입력
	입력된 문자를 이용해서 (*) 입력된 경우
	    *
	   ***
	  *****
	 *******
	*********
 */


public class Exam_06 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("원하는 문자 입력 : ");
		char a = (char)System.in.read();
		
		System.out.println("     "+a);
		System.out.println("    "+a+a+a);
		System.out.println("   "+a+a+a+a+a);
		System.out.println("  "+a+a+a+a+a+a+a);
		System.out.println(" "+a+a+a+a+a+a+a+a+a);
		
		
		
		
		
		
	}

}
