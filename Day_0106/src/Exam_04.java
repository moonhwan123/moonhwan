import java.util.Scanner;

/*
Ű����� �޿��� �Է�(1 ~ 500,000)
�Է� �ڷᰡ -999 �̸� ���� �Ǵ�  �ο����� �ִ� 10��

[��Ż ����]
50,000 : xx
10,000 : xx
5,000  : xx
.
.
.
1 : xx
 */
public class Exam_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int sum[] = new int[10];
		int total[] = new int[10];
		int inwon = 0;
			
		while(true) {
			int kyuryo;
			int m = 50000;
			boolean sw = true;
			System.out.print("�޿��� �Է� �ϼ���(1 ~ 500,000) >> ");
			kyuryo = sc.nextInt();
			
			if(kyuryo == -999) break;
			if(inwon == -999) break;
				
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
				inwon++;

		}
		
		int m = 50000;
		boolean sw = true;
		
		for(int x = 0; x <= 9; x++) {
			System.out.println(m+" : "+total[x]);
			if(sw) {
				m = m/5;
				sw = false;
			}else {
				m = m/2;
				sw = true;
			}
			
		}
		System.out.println("�ο� : "+inwon);
		
		
		
	}
}
