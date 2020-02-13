import java.io.IOException;

/*
[System.in.read();]
- 1문자를 키보드로 입력 받아서 '정수'로 변환

 */

public class Exam_04 {
	
	public static void main(String[] args) throws IOException {
		 
		System.out.print("입력 하세요 : "); // A를 입력한다고 가정 , 123을 입력한다고 가정 
		int ch1 = System.in.read();     // 65(A)         ,  49(1)
		int ch2= System.in.read();      // 13(\r)        ,  50(2)
		int ch3 = System.in.read();     // 10(\n)        ,  51(3)
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		
		
	}

}
