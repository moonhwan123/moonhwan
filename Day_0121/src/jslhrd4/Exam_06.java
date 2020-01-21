package jslhrd4;

import java.io.IOException;

/*
[throws를 이용한 예외 처리]
throws : "나를 호출한 사람"에게 에러를 던진다.
throw : 에러의 강제 발생 , 임의적으로 에러 발생시키기
	->이 둘의 차이 숙지

예외처리 2가지 방법 숙지 
직접처리 하던지, 떠넘기던지
 */

class AA {
	char input() throws IOException {
		char ch = (char) System.in.read();
		return ch;
	}
}

class BB {
	char input() {
		char ch = '\0';
		try {
			ch = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ch;
	}
}

public class Exam_06 {

	public static void main(String[] args) {

		AA a = new AA();
		try {
			char c1 = a.input(); // 여기서는 예외가 발생 
			System.out.println("입력  값 : " + c1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		if(ddd) {
//			throw new Exception();
//		}
		
		
		BB b = new BB();
		char c2 = b.input(); // 여기서는 에러가 발생 하지 않는다. 위에서 예외 처리를 했기 때문에
		System.out.println("입력  값 : " + c2);

	}

}
