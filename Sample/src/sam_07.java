import java.util.Scanner;

public class sam_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int sum = 0;
		while(true) {
			System.out.print("������ ������ �Է� �ϼ���(0�� �Է��ϸ� ����) >>");
			int num = sc.nextInt();
			if(num == 0) break;
			sum += num;
			cnt++;
		}
		
		System.out.println("�����հ� = "+sum);
		System.out.println("�����Ǽ� = "+cnt);
		
	}
}
