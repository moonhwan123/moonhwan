import java.util.Scanner;

/*
2�ڸ� �̳� ������ �Է�
1 ~ �Էµ� ���� ���� �հ踦 ���
 */



public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num; // ���������� ������ ���־ ����Ҽ� �ְԲ� ����
		while(true) {
			System.out.print("2�ڸ� �̳� ������ �Է� �ϼ���(1~99) >> ");
			num = sc.nextInt();
			if(num > 0 && num < 100) {
				break;
			}
			System.out.println("2�ڸ� �̳��� ���ڸ� �Է��ϼ���!");
		}
		
		//���⼭ ���� 1~num������ �հ踦 ���
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1���� "+num+"������ �հ�� : "+sum);
		
		
		
		
		
		
		
		
	}
}
