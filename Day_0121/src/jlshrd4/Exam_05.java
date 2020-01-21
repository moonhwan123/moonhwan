package jlshrd4;

import java.io.IOException;

/*
[에외 처리]
최상위 클래스 - Exception





 */

/*
[try-catch를 이용한 예외 처리]
 */
public class Exam_05 {
	public static void main(String[] args) {

		// try안에는 예외가 일어날수 있는 가능성이 있는 코드를 넣어 준다.
		// 그래서 e라는 변수가 그 예외를 받는다.
		try {
			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) {
			System.out.println("예외가 발생");
			// "하나의 try문 안에 여러개의 catch문"이 올수 있다.
			// 하지만 아래로 갈수록 범위가 큰 에러여야 한다.
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// "예외 발생과 관계없이" 수행
			// 발생해도 수행 안해도 수행 -> 무조건 수행
		}
		
		
		
		
		
		
		

	}
}
