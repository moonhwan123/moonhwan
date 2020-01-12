import java.util.Scanner;

public class sam_08 {
	public static void main(String[] args) {
		
		System.out.println("[입력한 수 중 최대,최소 값을 찾는 프로그램 입니다.]");
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 999;
		
		while(true) {
			System.out.print("입력 (-99를 입력 하면 종료) : ");
			int num = sc.nextInt();
			if(num==-99) break;
			if(max < num) {
				max = num;
			}if(min > num) {
				min = num;
			}
			
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
