import java.util.Arrays;
import java.util.Scanner;

/*
��ȣ, �̸� , ����n���� �Է� �޾Ƽ� ��� �ϴ� ���α׷��� �ϼ��Ͻÿ�
1) �Է��׸� - �ִ� 10�� �Ǵ� ��ȣ�� -99�̸� ��� �� ����
	-��ȣ, �̸�, ���� 5��
2) ó������
	-���� ��� �� ������������ ���
3) ���
	��ȣ  �̸�   ����
	1    ȫ�浿  77 80 98 70 50
 */

class Hak{
	int bun;
	String name;
	int[] score;
	
	Hak(){}
	Hak(int bun, String name, int[] score){
		this.bun = bun;
		this.name = name;
		this.score = score.clone();
		Arrays.sort(this.score);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(bun+"\t");
		sb.append(name+"\t");
		for(int x = 0; x < score.length; x++) {
			sb.append(score[x]+"  ");
		}
		return sb.toString();
	}

}

class HakData{
	Hak[] hak;
	int cnt;
	
	HakData(Hak[] hak,int cnt){
		this.hak = hak;
		this.cnt = cnt;
	}
	
	void dataPrint() {
		System.out.println("��ȣ\t�̸�\t����");
		for(int x = 0 ; x < cnt ; x++) {
			System.out.println(hak[x]);
		}
	}
	
}


public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int cnt= 0;
		Hak hak;
		Hak[] hakArr = new Hak[10];
		int[] score = new int[5];
		
		while(cnt<10) {
			System.out.print("��ȣ,�̸�,���� 5�� �Է� �ϼ��� >> ");
			String str = sc.nextLine();
			String[] strArr = str.split(",");
			
			if(strArr[0].equals("-99")) {
				break;
			}
			
			for(int x = 0; x < score.length; x++) {
				score[x] = Integer.parseInt(strArr[x+2]);
			}
			
			hak = new Hak(Integer.parseInt(strArr[0]),strArr[1],score);
			hakArr[cnt] = hak;
			cnt++;
		}
		
		HakData hd = new HakData(hakArr,cnt);
		hd.dataPrint();
		
	}
}
