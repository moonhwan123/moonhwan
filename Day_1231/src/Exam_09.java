import java.util.Scanner;

/*
Ű�����Է� 
50~90 ������ �ڷ� 10�� �Է� �� �հ� ���

EX) 10,80,60,90,95 ........
 */


public class Exam_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		
		System.out.println("������ �Է��ϼ���(50~90������ ������ 10������ �ջ� �˴ϴ�.) >>");
		while(cnt < 10) { // if(break)�� �Ⱦ��� 
			int num = sc.nextInt();
			if(num >= 50 && num <= 90) {
				cnt ++;
				sum += num;
			}
		}
		System.out.println("sum = "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
