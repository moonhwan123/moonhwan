package thread;

import java.awt.Toolkit;

class BeepTask implements Runnable{
	
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			tool.beep(); 
			System.out.println("빼액");
			try {
				Thread.sleep(500); 
			} catch (Exception e) {

			}
		}
		
	}
	
}


public class Exam_11 {
	public static void main(String[] args) {
		
		Runnable beep = new BeepTask();
		BeepTask beep2 = new BeepTask();
		
		
//		beep.start(); => 이거 안됨
		
		//그래서 Runnable을 구현 했을때는 이 과정을 한번 더 거쳐야 된다.
		Thread thread = new Thread(beep);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("끼에엑");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
		
		
	}
}
