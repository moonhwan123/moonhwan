
public class Exam_08 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int x = 0; x < lotto.length; x++) {
			lotto[x] = (int)(Math.random()*45+1);
			//여기서 중복 체크(for문 이용)
			for(int y = 0; y < x; y++) { // x=0일때는 작동안함
				if(lotto[x] == lotto[y]) {
					x--;
					break;
				}
			}
		}
		
		
		for(int x = 0 ; x < 6; x++) {
			System.out.print(lotto[x]+"\t");
		}
		
		
		
		
	}
}
