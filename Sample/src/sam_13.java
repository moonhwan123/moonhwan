import java.util.Scanner;

public class sam_13 {
	public static void main(String[] args) {
		System.out.println("[2부터 입력한 수까지의 소수의 갯수를 출력합니다.]");
		Scanner sc = new Scanner(System.in);
		System.out.print("판별할 정수를 입력 하세요 >> ");
		int num = sc.nextInt();
		int cnt = 0;
		int nmg;
		
		for(int i = 2; i <= num; i++) {
			for(int j = 2; j <= i; j++) {
				nmg = i%j;
				if(nmg == 0) {
					if(i==j) {
						cnt++;
					}else {
						break;
					}
				}
			}
		}
		
		System.out.println("2부터"+num+"까지의 소수의 갯수는 "+cnt+"개 입니다.");
		
	}

}
