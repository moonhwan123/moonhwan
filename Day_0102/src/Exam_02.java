import java.util.Scanner;

/*
Ű����� ������ �Է�
1. �Է��ڷ�� 1 ~ 100 ������ ����
2. �Է� �ڷ� �� 7�� ����� ��
3. ��ü�ڷ�(��������)�� 20���̸� ���α׷� ����
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
	�Է��ڷ� 20�� �Է½� 
	�Է��ڷ� 20�� �� ������(%) : xx %
	�Է��ڷ� 20�� �� 7�� ����� ����(%) : xx %
	7�ǹ���� �հ� : --
	7�ǹ���� ��� : --
 */

public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt_total = 0;
		int cnt_7bae = 0;
		int cnt_Error = 0;
		
		int num;
		do{
			System.out.print("�Է� �ڷ� : ");
			num = sc.nextInt();
			cnt_total ++;
			if(num > 0 && num < 101) {
				if(num % 7 ==0) {
					sum += num;
					cnt_7bae ++;
					
				}
			}else {
				cnt_Error ++;
				System.out.println("Error �Է¹��� �ƴ�");
			}

		}while(cnt_total < 20);
		
		System.out.println("�Է��ڷ� 20�� �� ������(%) : " + ((double)cnt_Error / cnt_total)*100+"%");
		System.out.println("�Է��ڷ� 20�� �� 7�� ����� ����(%) : " + ((double)cnt_7bae / cnt_total)*100+"%");
		
		System.out.println("7�� ����� �հ� : "+sum);
		
		double ave = (double)sum/cnt_7bae;
		System.out.println("7�� ����� ��� : " + (int)((ave*100)+0.5)/100.);

		
	}

}
