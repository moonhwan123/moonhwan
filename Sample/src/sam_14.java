import java.util.Scanner;

public class sam_14 {
	public static void main(String[] args) {
		
		System.out.println("[2부터 입력한 수까지의 소수의 갯수를 출력합니다.]");
		
		Scanner sc = new Scanner(System.in);
		
		int i = 2;
		int j = 2;
		int nmg;
		int cnt = 0;
		System.out.print("입력 : " );
		int num = sc.nextInt();
		while(i != num) {
			nmg = i % j;
			if(nmg == 0) {
				if(i==j) {
					cnt++;
				}
				if(i==num) break;
				i++;
				j = 2;
			}else j++;
		}
		System.out.println("2부터 "+num+"까지의 소수의 갯수는 "+cnt+"개 입니다.");
		
		
		
		
		
		
	}
}
