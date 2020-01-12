import java.util.Scanner;

public class sam_09 {
	public static void main(String[] args) {
		
		System.out.println("[입력한 수 중 최대,최소 값을 찾는 프로그램 입니다.]");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초기 값을 입력 하세요 : ");
		int num = sc.nextInt();
		int max = num;
		int min = num;
		
		while(true) {
			System.out.print("비교할 값들을 입력 하세요(-99입력시 종료) : ");
			num = sc.nextInt();
			if(num == -99) break;
			
			if(max < num) {
				max = num;
			}
			if(min > num) {
				min = num;
			}
				
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}

}
