import java.util.Scanner;

public class sam_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2�̻��� ������ �Ҽ��Ǻ��� ������ 1�� �Է� �ϼ��� >> ");
		int num = sc.nextInt();
		int nmg;
		
		for(int i = 2; i <= num; i++) {
			nmg = num % i;
			if(nmg==0) {
				if(i == num) {
					System.out.println("�Ҽ�");
				}else {
					System.out.println("�Ҽ��ƴ�");
					break;
				}
			}
		}
		
		
	}
}
