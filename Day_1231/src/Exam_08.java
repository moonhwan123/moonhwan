import java.util.Scanner;

/*
Ű�����Է� 
50~90 ������ �ڷ� 10�� �Է� �� �հ� ���

EX) 10,80,60,90,95 ........
 */


public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		
		System.out.println("������ �Է��ϼ���(50~90������ ������ 10������ �ջ� �˴ϴ�.) >>");
		while(true) {
			int num = sc.nextInt();
			if(num >= 50 && num <= 90) {
				cnt ++;
				sum += num;
				if(cnt == 10) break; // ���⿡ ���°� �ξ� ȿ����
			}
			
			//if(cnt == 10) break; -> ��ġ�� ���� ���� �����ϱ� (��� �ӵ����̶���)
			
		}
		System.out.println("sum = "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
