import java.util.Scanner;

/*
Ű���� �Է�
2. ���� 10���� �Է� ���� ���(��, �Է� ���� ������ �����Ѵ�)
 */





public class Exam_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//while�� �̿�
/*		int cnt = 0; // ī��Ʈ ����
		int total = 0; // �հ� ����
		
		while(cnt < 10) {
			System.out.print("������ �Է��ϼ��� >> ");
			int num = sc.nextInt();
			if(num > 0 ) {
				total += num;
				cnt++;
			}
		}
		System.out.println("�հ� : " + total);
*/	
		
		
		//for�� �̿�
		int sum = 0; 
		for(int i = 1; i <= 10 ; i++) {
			System.out.print("������ �Է��ϼ��� >> ");
			int num = sc.nextInt();
			if(num > 0) {
				sum += num;
			}else i--; // ������ ������ i�� ������ 
		}
		System.out.println("�հ� : " + sum);
		
		//for(;;); -> for���� ���ѹݺ�
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}
}
