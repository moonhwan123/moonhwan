import java.util.Scanner;

/*
키보드로 10개의 점수를 입력 받아서
배열에 저장후 총점, 평균을 구하여 출력해라

 */

public class Exam_03 {
	
	public static void main(String[] args) {
		
		//입력작업
		Scanner sc = new Scanner(System.in);
		
		int jumsu[] = new int[10];
		int sum = 0;
		
		
		
		for(int i = 0 ; i<10 ; i++) {
			System.out.print(i+"번째 학생의 점수를 입력하세요 : ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		
		int ave = sum/jumsu.length;
		ave = (int)(ave*10+0.5)/10;
		
		
		int cnt = 0;
		
		//출력작업
		for(int i = 0 ; i<jumsu.length ; i++) {
			System.out.print(i+"번째 학생의 점수는 "+jumsu[i]+"\t");
			
			cnt ++;
			if(cnt == 5) {
				System.out.println();
				cnt = 0;
			}
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("총점\t평균");
		System.out.println(sum+"\t"+ave);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
