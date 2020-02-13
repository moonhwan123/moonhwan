import java.util.Scanner;

public class sam_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int sum = 0;
		while(true) {
			System.out.print("가산할 정수를 입력 하세요(0을 입력하면 종료) >>");
			int num = sc.nextInt();
			if(num == 0) break;
			sum += num;
			cnt++;
		}
		
		System.out.println("누적합계 = "+sum);
		System.out.println("누적건수 = "+cnt);
		
	}
}
