
public class Exam_08 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int x = 0; x < lotto.length; x++) {
			lotto[x] = (int)(Math.random()*45+1);
			//���⼭ �ߺ� üũ(for�� �̿�)
			for(int y = 0; y < x; y++) { // x=0�϶��� �۵�����
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
