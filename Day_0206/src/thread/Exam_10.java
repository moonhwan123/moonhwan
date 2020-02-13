package thread;

import java.awt.Toolkit;

class Beep extends Thread{
	
	
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			tool.beep(); // 비프음 (소리)
			System.out.println("멍멍");
			try {
				Thread.sleep(500); 
			} catch (Exception e) {

			}
		}
		
	}//run 끝
	
	
}


public class Exam_10 {
	public static void main(String[] args) {
		
		Beep b = new Beep();
		
		b.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("콸콸");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
		

		
		
		
		
	}
}
