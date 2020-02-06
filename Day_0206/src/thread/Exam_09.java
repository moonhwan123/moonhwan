package thread;

import java.awt.Toolkit;

/*
[멀티 스레드]
 - 스레드 => 실행코드
 - 실시간예약 같은 곳에 자주 사용한다.
 
 1) Thread 클래스를 상속 받아서
 
  
 2) Runnable 인터페이스 구현
 	= 얘는 어떤 클래스가 다른 클래스를 상속 받은상태이면 Thread클래스를 상속 받을 수 없기 때문에 존재한다.

	
 */

public class Exam_09 {
	public static void main(String[] args) {

		Toolkit tool = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 10; i++) {
			tool.beep(); // 비프음 (소리)
			try {
				Thread.sleep(500); // sleep : 시피유를 잠깐 잠재운다 1000이 1초
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("콸콸");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}
}
