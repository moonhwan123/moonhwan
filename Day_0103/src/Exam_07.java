import java.util.Scanner;

/*
Ű����� ���� �Է�
1. �Է� ���� (2 ~ 100)
2. �Էµ� ���� 2������ ��ȯ�� ���
3. �Է� ����
	���� �Է� : 101
	�Է¿��� --> ���Է�
	���� �Է� : 10
	10���� (10) = 2���� (1010)
 */


public class Exam_07 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("2~100 ������ ������ �Է� �ϼ��� >>");
			num = sc.nextInt();
			if(num > 1 && num < 101) {
				break;
			}else System.out.println("�Է� ���� !");
		}
		
		int temp = num;
		String bin = ""; // 2���� ����
		int mok, nmg;
		
		do{
			mok = temp/2;
			nmg = temp%2;
			bin = nmg + bin; // ����
			temp = mok;
		}while(mok != 0);
		
		System.out.println("10����("+num+")"+" = "+"2����("+bin+")");
		
		
		
		
		
	}

}
