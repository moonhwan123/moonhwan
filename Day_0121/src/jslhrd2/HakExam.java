package jslhrd2;

/*
��ȣ     �̸�      ����     �հ�      ���
1   ȫ�浿       50   50    50
��ȣ     �̸�      ����                        �հ�     ���
1   ȫ�浿      90,80,70,60   xxx  xxx.x
 */

public class HakExam {

	public static void main(String[] args) {
		
		Hak data = new HakData(1,"ȫ�浿",90);
		data.print();
	    data = new HakData(1,"ȫ�浿",new int[] {90,80,70,60,80});
		data.print();
		
		
		
	}
}
