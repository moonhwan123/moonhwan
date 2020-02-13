import java.util.Scanner;

/*
키보드로 10개의 정수 data입력
합계를 출력
 */




public class Exam_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계
		int cnt = 0; // 누적형은 무조건 초기화 되어야함 , 대입형은 ㄱㅊ
		System.out.println("정수 10개 입력 >> ");
		while(true) {
			int a = sc.nextInt(); // 메모리 먹어도 GC때문에 ㄱㅊ 
			cnt ++;
			sum += a;
			if(cnt == 10) break;
		}
		
		System.out.println(cnt);
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
