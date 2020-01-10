import java.util.Scanner;

/*
키보드로 (번호 이름 국어 영어 수학 전산)
입력 : 1  홍길동  77 88 99 80 
.	.	.
입력 : -99 --> 입력종료(최대 10명)

출력
번호   이름   국어   영어   수학   전산   총점   평균(정수만)
.
.
합계             xx  xx   xx  xx  xx  xx
평균             xx  xx   xx  xx  xx  xx

전체 평균 이상인 학생만 밑에다가 출력
번호   이름   평균
 x   x   x
 */

public class Exam_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[11][7];
		String[] name = new String[10];
		double[] ave = new double[6];
		int cnt;
		//입력 부분
		for(cnt = 0; cnt < 10; cnt++) {
			System.out.print("입력(번호 이름 국어 영어 수학 전산) : ");
			arr[cnt][0] = sc.nextInt(); // 번호
			if(arr[cnt][0]==-99)break;
			name[cnt] = sc.next();
			arr[cnt][1] = sc.nextInt(); // 국어
			arr[cnt][2] = sc.nextInt(); // 영어
			arr[cnt][3] = sc.nextInt(); // 수학
			arr[cnt][4] = sc.nextInt(); // 전산
			sc.nextLine();
			arr[cnt][5] = arr[cnt][1] + arr[cnt][2] + arr[cnt][3] + arr[cnt][4]; 
			arr[cnt][6] = arr[cnt][5]/4;
		}
		//합계 구하는 부분
		for(int x = 0; x < cnt; x++) {
			for(int y = 1; y < 7; y++) {
				arr[10][y] += arr[x][y]; 
			}
		}
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t전산\t총점\t평균");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<7; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("============================================================");
		
		//합계 출력 부분
		System.out.print("합계 : "+"\t\t");
		for(int x = 1 ; x < arr[0].length; x++) {
			System.out.print(arr[10][x]+"\t");
		}
		
		//평균 출력 부분
		System.out.println();
		System.out.print("평균 : "+"\t\t");
		for(int x = 0 ; x < ave.length; x++) {
			ave[x] = (int)(arr[10][x+1]/(double)cnt*100+0.5)/100.;
			System.out.print(ave[x]+"\t");
		}
		System.out.println();
		//전체 평균 이상인 학생
		System.out.println("[전체 평균 이상인 학생]");
		System.out.println("번호\t이름\t평균");
		for(int x = 0; x < cnt; x++) {
			if(arr[x][6]>ave[5]) {
				System.out.print(arr[x][0]+"\t");
				System.out.print(name[x]+"\t");
				System.out.println(arr[x][6]);
			}
		}
		
		
		
	}

}
