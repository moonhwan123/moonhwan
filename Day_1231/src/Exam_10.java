import java.util.Scanner;

/*
Ű�����Է� 
�ڷ� ������ �Է�

EX) 10,80,60,90,95 ........
�Է� �ڷ��� 50~90 ������ �ڷḸ ���
��, �Է� �ڷῡ ������ �Է� �Ǹ� ����� ���ÿ� �հ�, ��� ���
 */


public class Exam_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		int num = 1;
		
		System.out.println("������ �Է��ϼ���(50~90������ ���ڸ� �ջ� �˴ϴ�) , ������ �Է��ϸ� ���� >>");
		while(num>0) { 
			num = sc.nextInt();
			if(num >= 50 && num <= 90) {
				cnt ++;
				sum += num;
			}
		}
		
		System.out.println("sum = "+sum);
		System.out.println("ave = "+(double)sum/cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
