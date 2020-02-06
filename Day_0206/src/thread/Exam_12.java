package thread;

class AA extends Thread{
	
	@Override
	public void run() {
		for(int x = 1; x < 10; x++) {
			for(int y = 1; y < 5; y++) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	
	
}

class BB implements Runnable{
	
	@Override
	public void run() {
		int sum = 0;
		for(int x = 1; x < 10; x++) {
			System.out.println(x);
			sum+=x;
		}
		System.out.println("sum = " + sum);
	}
	
}


public class Exam_12 {
	public static void main(String[] args) {
		
		Thread aa = new AA();
		aa.start();
		BB bb = new BB();
		Thread bbb = new Thread(bb);
		bbb.start();
		
		
	}
}
