import java.util.Scanner;

public class sam_40 {
	public static void main(String[] args) {
		
		System.out.println("[10진수를 2진수로 변환 하는 프로그램 입니다.]");
		
		int arr[] = new int[10];
		int mok;
		int nmg;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변환할 숫자를 입력 해 주세요 >> ");
		int num = sc.nextInt();
		do {
			mok = num/2;
			nmg = num%2;
			arr[cnt] = nmg;
			cnt++;
			num = mok;
		}while(mok != 0);
		
		System.out.print("2진수로 ");
		for(int i = cnt-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("입니다.");
		
	}
}
