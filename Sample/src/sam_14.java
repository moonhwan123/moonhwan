import java.util.Scanner;

public class sam_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 2;
		int j = 2;
		int nmg;
		int cnt = 0;
		System.out.print("�Է� : " );
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
		System.out.println("2���� "+num+"������ �Ҽ��� ������ "+cnt+"�� �Դϴ�.");
		
		
		
		
		
		
	}
}
