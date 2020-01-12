import java.util.Scanner;

public class sam_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2이상의 정수중 소수판별할 정수를 1개 입력 하세요 >> ");
		int num = sc.nextInt();
		int nmg;
		
		for(int i = 2; i <= num; i++) {
			nmg = num % i;
			if(nmg==0) {
				if(i == num) {
					System.out.println("소수");
				}else {
					System.out.println("소수아님");
					break;
				}
			}
		}
		
		
	}
}
