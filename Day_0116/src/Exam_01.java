import java.util.Scanner;

/*
Ŭ���� �迭 ó�� 
Ű���� �Է� - �ִ� 10��
�Է� : ��ȣ  �̸�  ����  ����  ���� 
��ȣ�� -99�̸� ����


��� (������ �������� ���� ����)
��ȣ  �̸�  ����  ����  ����  ����  ���  ���� 

1. �л� ���� Student Ŭ����
2. �л� ���� ó�� StudentData
3. �ڷ� �Է� main()
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Է� �۾�
		Student cls1[] = new Student[10];
		int cnt = 0;
		while(cnt<10) {
			System.out.print("�Է� : ");
			int bun = sc.nextInt();
			if(bun == -99) break;
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			cls1[cnt] = new Student(bun,name,kor,eng,mat);
			cnt++;
		}
		

		StudentData sd = new StudentData();
/*		
		//���� , ���� ó��
		sd.rank(cls1, cnt);
		sd.sort(cls1, cnt);
		
		// ó�� �� ������ ���
		sd.clsDataPrint(cls1, cnt);
*/
		
		StudentData2 sd2 = new StudentData2(cls1, cnt);
		sd2.rankAcc();
		sd2.sort2();
		sd2.clsDataPrint();
		
		
	}
}
