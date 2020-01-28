import java.util.Random;

public class Exam_02 {
	public static void main(String[] args) {
		
		//Math.random();
		//¾ê¸¦ ¾²³ª ¹Ø¿¡ ³ðÀ» ¾²³ª ¶È°°À½
		
		Random r = new Random();
		
		for(int x = 0; x < 10; x++) {
			int s = r.nextInt(45)+1;
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
	}
}
