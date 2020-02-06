package thread;

import java.awt.Toolkit;

class BeepTask implements Runnable{
	
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			tool.beep(); 
			System.out.println("����");
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
		
		
//		beep.start(); => �̰� �ȵ�
		
		//�׷��� Runnable�� ���� �������� �� ������ �ѹ� �� ���ľ� �ȴ�.
		Thread thread = new Thread(beep);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("������");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
		
		
	}
}
