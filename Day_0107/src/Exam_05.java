import java.util.Scanner;

/*
Ű���� �Է� (100,000 ~ 1,000,000)
�Է��ڷᰡ -99 �̸� ����
�Է� : 234567
�Է� : 345454
...
�Է� : -99
�� �޿� : xxxxxxxxx
50,000	10,000	5,000	1,000	500	100	50	10	5	1
xxx		xxx		xxx		xxx		xxx xxx xxx xxx xxx xxx
 */
public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int sum[] = new int[10];
		int total[] = new int[10];
		int tot = 0;

			
		while(true) {
			int m = 50000;
			boolean sw = true;
			System.out.print("�޿��� �Է� �ϼ���(100,000 ~ 1,000,000) >> ");
			int kyuryo = sc.nextInt();
			
			if(kyuryo == -99) break;
			
			if(kyuryo>=100000 && kyuryo<= 1000000) {	
				tot += kyuryo;
				for(int x = 0; x <= 9; x++) {
					int mok = kyuryo / m ;
					sum[x] = mok;
					if(sw) {
						kyuryo = kyuryo%m; 
						m = m/5;
						sw = false;
					}else {
						kyuryo = kyuryo%m;
						m = m/2;
						sw = true;
					}
					total[x]= total[x]+sum[x];
				}
			}else System.out.println("�� ���� �� �Դϴ�.");

		}
	
		System.out.print("�ѱ޿� : "+tot+"\n");

	
		System.out.print("50,000"+"\t"+"10,000"+"\t"+"5,000"+"\t"+"1,000"+"\t");
		System.out.print("500"+"\t"+"100"+"\t"+"50"+"\t"+"10"+"\t"+"5"+"\t"+"1");
		System.out.println();

		for(int x = 0; x <= 9; x++) {
			System.out.print(total[x]+"\t");
		}

		
		
		
		
		
	}
}
