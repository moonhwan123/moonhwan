package thread;

import java.awt.Toolkit;

class Beep extends Thread{
	
	
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			tool.beep(); // 厚橇澜 (家府)
			System.out.println("港港");
			try {
				Thread.sleep(500); 
			} catch (Exception e) {

			}
		}
		
	}//run 场
	
	
}


public class Exam_10 {
	public static void main(String[] args) {
		
		Beep b = new Beep();
		
		b.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("腻腻");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
		

		
		
		
		
	}
}
