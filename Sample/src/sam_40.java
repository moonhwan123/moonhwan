import java.util.Scanner;

public class sam_40 {
	public static void main(String[] args) {
		
		System.out.println("[10������ 2������ ��ȯ �ϴ� ���α׷� �Դϴ�.]");
		
		int arr[] = new int[10];
		int mok;
		int nmg;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȯ�� ���ڸ� �Է� �� �ּ��� >> ");
		int num = sc.nextInt();
		do {
			mok = num/2;
			nmg = num%2;
			arr[cnt] = nmg;
			cnt++;
			num = mok;
		}while(mok != 0);
		
		System.out.print("2������ ");
		for(int i = cnt-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("�Դϴ�.");
		
	}
}
