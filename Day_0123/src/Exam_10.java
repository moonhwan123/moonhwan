import java.util.Arrays;
import java.util.Scanner;

/*

키보드로 게임 수 입력
게임수 : 5

1 : 19 20 34 35 40 43
.
.
5 : 1 10 17 34 38 40

[처리 조건]
1게임당 가상으로 100게임 후 발생 빈도가 높은
6개의 숫자를 추출해서 출력
 */

public class Exam_10 {

	public static void main(String[] args) {
		
		int ball[][] = new int[2][45];
		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int x = 0; x < ball[0].length; x++) {
			ball[0][x] += x+1;
		}
		
		
		
		for(int x = 0; x < 100; x++) {
			
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
			
			//게임 출력
//			Arrays.sort(lotto);
//			System.out.print((x+1)+"회)\t");
//			for(int a = 0; a < 6; a++) {
//				System.out.print(lotto[a]+"\t");
//			}
//			System.out.println();
			
			
			
			
		}

		//ball 배열 정렬
		for(int x = 0; x < ball[0].length-1; x++) {
			for(int y = x+1; y < ball[0].length; y++) {
				if(ball[1][x] < ball[1][y]) {
					int temp = ball[1][x];
					ball[1][x] = ball[1][y];
					ball[1][y] = temp;
					
					temp = ball[0][x];
					ball[0][x] = ball[0][y]; 
					ball[0][y] = temp;
				}
			}
			
		}

		
		//0번지부터 5번지 까지 출력
		for(int a = 0; a < 6; a++) {
			System.out.print(ball[0][a]+"\t");
		}
		
		
		
	}

}
