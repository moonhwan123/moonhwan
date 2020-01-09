import java.util.Scanner;

/*
키보드 입력(학생성적정보입력)(최대 10명)
1. 입력 (번호    이름     국어       영어      수학)
입력 : 1   홍길동    89 80 90
입력 : 2   최강민    3  1  5
입력 : -99 --> 종료

2. 출력_1
번호   이름   국어   영어   수학   총점   평균   석차

3. 출력_2 석차를 기준으로 출력(정렬)
번호   이름   국어   영어   수학   총점   평균   석차

 */



public class Exam_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[10][6]; // 번호 국어 영어 수학 총점 석차
		String name[] = new String[10]; // 이름
		double ave[] = new double[10]; // 평균
		
		
		int cnt = 0;
		//자료 입력
		while(cnt < 10) {
			System.out.print("입력 (번호    이름     국어       영어      수학): ");
			arr[cnt][0] = sc.nextInt(); // 번호
			if(arr[cnt][0]== -99) break;
			name[cnt]   = sc.next();    // 이름
			arr[cnt][1] = sc.nextInt(); // 국
			arr[cnt][2] = sc.nextInt(); // 영
			arr[cnt][3] = sc.nextInt(); // 수
			sc.nextLine();
			cnt++;
		}
		
		//총점, 평균 계산
		for(int x = 0 ; x < cnt; x++) {
			for(int y = 1; y < 4; y++) {
				arr[x][4] += arr[x][y];
			}
			ave[x] = ((int)(arr[x][4] / 3. * 100 + 0.5))/100.; // 평균
		}
		
		//석차 계산 
		for(int x = 0 ; x < cnt; x ++) {
			int r = 1; // 석차 계산용
			for(int y = 0; y < cnt; y++) {
				if(arr[x][4]<arr[y][4]) { // 총점기준 
					r++;
				}
			}
			arr[x][5] = r;
		}
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<5; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.print(ave[x]+"\t");
			System.out.print(arr[x][5]);
			System.out.println();
		}


		//석차를 기준으로 오름 차순 정렬
		for(int x = 0; x < cnt; x++) {
			for(int y = x+1; y < cnt;y++) {
				if(arr[x][4]<arr[y][4]) { 
					for(int k = 0; k < 6; k++) {
						int temp = arr[x][k];
						arr[x][k] = arr[y][k];
						arr[y][k] = temp;
					}
					double temp2 = ave[x];
					ave[x] = ave[y];
					ave[y] = temp2;
					String temp3 = name[x];
					name[x] = name[y];
					name[y] = temp3;
				}
			}
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<5; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.print(ave[x]+"\t");
			System.out.print(arr[x][5]);
			System.out.println();
		}
		
		
	}
}
