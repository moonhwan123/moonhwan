/*
[System Ŭ����]
- �ü���� ��ȣ�ۿ� �ϴ� ��� ���� ���

System.exit(); -> ���μ��� ���������
System.gc(); -> �������÷��� ����

 */



public class Exam_04 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		while(true) {
			System.out.println(cnt);
			if(cnt == 10) {
								//���� �������� ���μ����� ���⼭ ��������
				System.exit(1); //��ȣ���� 0 �̸� "��������" , 0 �̿��� ���� ���� "������ ����" 
			}
			cnt++;
		}
		
//		System.out.println("���α׷� ����");
		
//      System.gc(); ������ �÷��� ����
		
		
	}
}
