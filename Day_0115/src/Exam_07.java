import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sawon[] sa = new Sawon[10];
		
		int cnt =0;
		
		while(cnt<10) {
			System.out.print("�Է� : ");
			int sab = sc.nextInt();
			if(sab == -99) {
				break;
			}
			String na = sc.next();
			int pa = sc.nextInt();
			sa[cnt] = new Sawon(sab,na,pa);
			cnt++;
		}
		
		SawonData saD = new SawonData();
		saD.sourceDataPrint(sa, cnt); // ���� ������ ���
		System.out.print("�����ȣ�� �������� ����(1:��������/2:��������) : ");
		int n = sc.nextInt();
		saD.sortDataPrint(sa,cnt,n); // ��Ʈ ���� , n�� 
		saD.sourceDataPrint(sa,cnt); // ��Ʈ �� ������ ���
		
		
	}
}
