import java.util.Scanner;

public class sam_13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǻ��� ������ �Է� �ϼ��� >> ");
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
		
		System.out.println("2����"+num+"������ �Ҽ��� ������ "+cnt+"�� �Դϴ�.");
		
	}

}
