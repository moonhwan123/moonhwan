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

public class Exam_10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ball[][] = new int[2][45];
		int[] lotto = new int[6];
		int[] lotto2 = new int[6]; // 각 숫자의 횟수 저장용 배열

		// ball 배열 초기화
		for (int x = 0; x < ball[0].length; x++) {
			ball[0][x] += x + 1; // 1부터 45까지 저장
		}

		System.out.print("반복 횟수 : ");
		int banbok = sc.nextInt();

		// 반복 시작
		for (int o = 0; o < banbok; o++) {
			// 게임 100번 시작
			for (int x = 0; x < 100; x++) {
				for (int i = 0; i < lotto.length; i++) {
					int number = (int) (Math.random() * 45 + 1);
					lotto[i] = number;
					for (int y = 0; y < i; y++) { 
						if (lotto[i] == lotto[y]) {
							i--;
							break;
						}
					}
					ball[1][number - 1]++; // 갯수 카운트
				}
			} // 100번 게임 다돌림

			// ball 배열 정렬 (빈도수 기준 정렬,상위 TOP6구하기)
			for (int x = 0; x < ball[0].length - 1; x++) {
				for (int y = x + 1; y < ball[0].length; y++) {
					if (ball[1][x] < ball[1][y]) { // 빈도수를 기준으로 숫자를 정렬
						int temp = ball[1][x];
						ball[1][x] = ball[1][y];
						ball[1][y] = temp;

						temp = ball[0][x];
						ball[0][x] = ball[0][y];
						ball[0][y] = temp;
					}
				}
			} // 정렬끝

			// ball[0][0~5]번지의 값을 lotto[0~5]로 이동 후 오름차순 정렬
			for (int a = 0; a < 6; a++) {
				lotto[a] = ball[0][a];
				lotto2[a] = ball[1][a];
				for (int x = 0; x < lotto.length - 1; x++) {
					for (int y = x + 1; y < lotto.length; y++) {
						if (lotto[x] > lotto[y]) { 
							int temp = lotto[x];
							lotto[x] = lotto[y];
							lotto[y] = temp;
						}
					}
				}
			}
			// lotto배열 출력
			System.out.print((o + 1) + "회)\t");
			for (int a = 0; a < 6; a++) {
				System.out.print(lotto[a] + "\t");
			}
			System.out.println();
			// 각 숫자의 횟수 출력
			for (int a = 0; a < 6; a++) {
				System.out.print("\t"+lotto2[a] + "회");
			}
			//누적 갯수 초기화
			for (int x = 0; x < ball[0].length; x++) {
				ball[1][x] = 0; // 1부터 45까지 저장
			}
			System.out.println();
			
			
			
		} // 전체 for문 끝

	}

}
