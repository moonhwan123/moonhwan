import java.util.Scanner;

/*
Ű����� �����ȣ ,�̸� , �޿� �Է�(�ִ�10��)
��� ��ȣ�� -99 �϶� ����

�Է� : ���   �̸�   �޿�
.	.	.

[���]
���  �̸�  �޿�  50,000  10,000  5,000  1,000  . . . . .
.	.	.	.	.	.	.

�հ� 	    xx    xx     xx      xx 

���(Sawon), ���ó��(SawonData)


 */


public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		Sawon sa[] = new Sawon[10];
		Sawon s;
		while(cnt<10) {
			System.out.print("�Է� : ");
			int sabun = sc.nextInt();
			if(sabun == -99) break;
			String name = sc.next();
			int pay = sc.nextInt();
			s = new Sawon(sabun,name,pay);
			s.payAccount();
			sa[cnt] = s;
			cnt++;
		}
		
		SawonData sd = new SawonData();
		
		sd.addPay(sa, cnt);
		sd.addMoney(sa, cnt);
		sd.saPrint(sa, cnt);

		
		
		
		
	}
}
