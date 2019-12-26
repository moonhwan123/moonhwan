import java.io.IOException;

/*
표준입력
System.in.read(); -- 1문자 입력 -- 정수로 변환
반드시 예외처리 필요
 */


public class Exam_02 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("1문자 입력 하세요 >> ");
		
		System.in.read();
		System.in.read();
		int ch = System.in.read(); // 'A'를 입력하면 A에 해당하는 아스키 코드 값이 들어감  
		                           //   \n - 10번 ,\r - 13번 , A - 65번 , a - 97번 
		
		System.out.print("ch = "+ch);
		System.out.println();
		
		System.out.print("1문자 입력 하세요 >> ");
		char ch_1 = (char)System.in.read(); // 강제 형변환
		System.out.println("ch_1 = "+ch_1);
		
		
		
		
		
		
	}

}
