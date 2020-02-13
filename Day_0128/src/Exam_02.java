import java.util.Random;

public class Exam_02 {
	public static void main(String[] args) {
		
		//Math.random();
		//얘를 쓰나 밑에 놈을 쓰나 똑같음
		
		Random r = new Random();
		
		for(int x = 0; x < 10; x++) {
			int s = r.nextInt(45)+1;
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
	}
}
