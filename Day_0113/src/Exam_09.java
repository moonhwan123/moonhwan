import java.util.Scanner;

/*
Ű����� �����ȣ, �̸�, �޿��� �Է�(5��)
�Է� : 1101 ȫ�浿 345978
.....
�Է� -99

[���]
���   �̸�   �޿�   50,000    10,000    .......

 */

class Sawon{
	int sabun;
	String name;
	int pay;
	int money[] = new int[10]; // 5����~1�� ���� ȭ��ż� ���� ����

	void count() {
		int temp = this.pay;
		int don = 50000;
		boolean sw = true;
		for(int x = 0; x < money.length; x++) {
			money[x] = temp/don;
			temp = temp%don;
			if(sw) {
				don=don/5;
				sw=false;
			}else {
				don=don/2;
				sw=true;
			}
		}//for����
	}

	
}



public class Exam_09 {
	public static void main(String[] args) {
		
		Sawon[] sa = new Sawon[5];
		Scanner sc = new Scanner(System.in);
		
		Sawon s;
		
		for(int x = 0; x < sa.length; x++) {
			System.out.print("�Է� : ");
			s = new Sawon();
			s.sabun = sc.nextInt();
			s.name = sc.next();
			s.pay = sc.nextInt();
			s.count();
			sa[x] = s;
		}
		
		
		System.out.println("=====================================================================");
		for(int x = 0; x < sa.length; x++) {
			System.out.print(sa[x].sabun+"\t"+sa[x].name+"\t"+sa[x].pay+"\t");
			
			for(int y = 0; y < sa[x].money.length; y++) {
				System.out.print(sa[x].money[y]+"\t");
			}
			System.out.println();
		}

		
	}
}
