import java.util.Scanner;

/*
Ű����� ����(2~1000)�Է�
	1) 2~�Է°� ������ �Ҽ��� ���
	2) �� �ٿ��� 5���� ���
	3) �������� �Ҽ��� ���� ���
	4) ����
	�Է� : 50
	2  3  5  7  11
	13  .......
	�Ҽ����� : x
 */



public class Exam_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int num;
		
		while(true) {
			System.out.print("2~1000 ������ ���� 1�� �Է� �ϼ���(0�� �Է� �ϸ� ����) >> ");
			num = sc.nextInt();
			
			if(num == 0) break;
			
			if(num>=2 && num<=1000) {
				for(int j = 2; j<=num; j++) {
					
					for(int i = 2; i <= j; i++) {
						if(j%i==0) {
							if(j==i) {
								System.out.print(j+"\t");
								cnt++;
								if(cnt % 5==0) {
									System.out.println();
								}
								break; // for�� Ż��
							}
							else break; // for�� Ż��
							
						}
					}
					
				}
				System.out.println(num+"�� �Ҽ� ���� : "+cnt);
			}else System.out.println("�Է� ����!");
		}
		

		
		
		
		
		
		
	}

}
