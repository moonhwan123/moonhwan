import java.util.Scanner;

/*
Ű����� ������ �Է�
1. �Է��ڷ�� 1 ~ 100 ������ ����
2. �Է��ڷ��� 3�� ����̸鼭 7�� ����� �հ�� ����� ���Ͽ� ���
3. �Է� �ڷᰡ 7���̸� ���α׷��� ���� �ȴ�.
4. �Է¿���
	�Է� �ڷ� : 0
	"error �Է� ������ �ƴ�"
	�Է��ڷ� : 8
	�Է��ڷ� : 77
	�Է��ڷ� : 200
	"error �Է� ������ �ƴ�"
	.
	.
	.
	�հ� : --
	��� : --
 */

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		
		int num;
		while(true) {
			System.out.print("�Է� �ڷ� : ");
			num = sc.nextInt();
			if(num > 0 && num < 101) {
				if(num % 3 == 0 && num % 7 ==0) {
					sum += num;
					cnt++;
					if(cnt == 7) break;
				}
			}else {
				System.out.println("Error �Է¹��� �ƴ�");
			}

		}
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+(double)sum/cnt);
		
		
		
		

		
	}

}
