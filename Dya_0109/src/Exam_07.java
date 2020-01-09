/*
 과목                            총점
 1  2  3  4  5  xx
 6  7  8  9  10 xx
 11 12 13 14 15 xx
 16 17 18 19 20 xx
 21 22 23 24 25 xx
 xx xx xx xx xx xx 
 과목별 총점
 */
public class Exam_07 {
	public static void main(String[] args) {
		
		int a[][] = new int[6][6];
		int cnt = 0;
		//입력 작업
		for(int x = 0; x < a.length-1; x++) {
			for(int y = 0; y < a.length-1; y++) {
				cnt++;
				a[x][y] = cnt;
				a[x][5] += a[x][y];
				a[5][y] += a[x][y];
				a[5][5] += a[x][y];
			}
		}
		

		
		//출력 작업
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a.length; y++) {
				System.out.print(a[x][y]+"\t");
			}
			System.out.println();
		}
		
	}
}
