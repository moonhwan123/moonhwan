import java.util.Scanner;

/*
[Ű���� �Է�] 
- ��ȣ, �̸�, ������ �Է�

����)
�Է� : 1 ȫ�浿 100

[���]
��ȣ     �̸�     ����    �׷��� (10���� '*' 1��)
1   ȫ�浿    100  *********
 */
class Hak3{
	int bun;
	String name;
	int score;
	
	Hak3() {
//		dataPrint();
	}
	Hak3(int bun, String name, int score){ // �ʱ�ȭ �۾��� ���� ������
		//this(); // �ڱ��ڽ��� �޼��� == �ڱ��ڽ��� ������
		this.bun = bun;
		this.name = name;
		this.score = score;
		//���⼭ this�� �ڱ��ڽ�(class)�� ����Ŵ
		dataPrint();
	}
	void dataPrint() {
		System.out.print(bun+"\t"+name+"\t");
		for(int x = 0; x < score; x++) {
			if(x % 10 == 0) {
				System.out.print("*");
			}
		}System.out.println();
	}
}



public class Exam_08 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Hak3 hak; // �̳��� �ۿ� �ִ� ������ ������ �ѹ��� ���� �װ� �����ҷ���
		while(true) {
			System.out.print("�Է� : ");
			hak = new Hak3();
			hak.bun = sc.nextInt();
			if(hak.bun == -99) break;
			hak.name = sc.next();
			hak.score = sc.nextInt();
/*			
			System.out.print(hak.bun+"\t"+hak.name+"\t");
			for(int x = 0; x < hak.score; x++) {
				if(x % 10 == 0) {
					System.out.print("*");
				}
			}System.out.println();
*/			
			//�� �ּ� �κ��� �޼���� ������
			hak.dataPrint();
		}
		
		
		
		
		
	}
}
