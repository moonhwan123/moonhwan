import java.util.Scanner;

public class sam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 999;
		
		while(true) {
			System.out.print("ют╥б : ");
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
