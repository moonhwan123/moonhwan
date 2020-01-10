import java.util.Scanner;

public class sam_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초기 값을 입력 하세요 : ");
		int num = sc.nextInt();
		int max = num;
		int min = num;
		
		while(true) {
			System.out.print("비교할 값들을 입력 하세요 : ");
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
