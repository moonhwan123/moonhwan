/*
[Ű���� �Է�] 
- ��ȣ, �̸�, ������ �Է�

����)
�Է� : 1 ȫ�浿 100

[���]
��ȣ     �̸�     ����    �׷��� (10���� '*' 1��)
1   ȫ�浿    100  *********
 */
class Hak2{
	int bun;
	String name;
	int score;
	
	Hak2() {}
	Hak2(int b, String n, int s){
		bun = b;
		name = n;
		score = s;
	}
}



public class Exam_07 {
	public static void main(String[] args) {
		//Ű����� �Է� �ߴٰ� ����
		int bun = 1;
		String name = "ȫ�浿";
		int score = 90;
		
		//1�� - ����Ʈ ������ �̿�
		Hak2 h1 = new Hak2();
		h1.bun = bun;
		h1.name = name;
		h1.score = score;
		
		System.out.print(h1.bun+"\t"+h1.name+"\t");
		
		for(int x = 0; x < h1.score; x++) {
			if(x%10==0) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		//2�� - ������ �̿�
		Hak2 h2 = new Hak2(2,"�ְ���",20);
		System.out.print(h2.bun+"\t"+h2.name+"\t");
		
		for(int x = 0; x < h2.score; x++) {
			if(x%10==0) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		
		
		
		
		
	}
}
