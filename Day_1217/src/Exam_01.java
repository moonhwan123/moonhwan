import java.io.IOException; // ctrl + shift + o


/*

[표준입출력] - System.in / System.out
	출력 - print(), println()
	입력 - System.in.read(); -> 1문자 입력 , 예외처리 필수 
	
 */

public class Exam_01 { // main이 있으면 실행클래스
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("입력하세요 : ");
		System.in.read();
		
	}

}
