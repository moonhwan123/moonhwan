import java.util.Scanner;

/*
Ű����� 10���� ���� data�Է�
�հ踦 ���
 */




public class Exam_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �հ�
		int cnt = 0; // �������� ������ �ʱ�ȭ �Ǿ���� , �������� ����
		System.out.println("���� 10�� �Է� >> ");
		while(true) {
			int a = sc.nextInt(); // �޸� �Ծ GC������ ���� 
			cnt ++;
			sum += a;
			if(cnt == 10) break;
		}
		
		System.out.println(cnt);
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
