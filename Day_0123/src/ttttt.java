import java.util.Scanner;

public class ttttt {

	public static void main(String[] args) {
		
		
		int ball[][] = new int[2][45];
		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int x = 0; x < ball[0].length; x++) {
			ball[0][x] += x+1;
		}
		
		for(int i = 0; i < lotto.length; i++) {
			int number = (int)(Math.random()*45+1);
			lotto[i] = number;
			//여기서 중복 체크(for문 이용)
			for(int y = 0; y < i; y++) { // x=0일때는 작동안함
				if(lotto[i] == lotto[y]) {
					i--;
					break;
				}
				
			}
			ball[1][number-1]++;
		}
		
		for(int x = 0 ; x < 6; x++) {
			System.out.print(lotto[x]+"\t");
		}
		System.out.println();
		
		for(int x = 0; x < ball.length; x++) {
			for(int y = 0; y < ball[0].length; y++) {
				System.out.print(ball[x][y]+" ");
			}
			System.out.println();
		}
		
		
	}
}

