/*
 1 ~ a �հ� ���
 ��� : 1 ~ a = xx
 
����Ÿ���� ���� �Ű������� �ִ� ���
�Ű������� ��� �͵� �������
�׸��� ��� �ڷ����� �� �� ����
 */



public class Exam_03 {
	
	public static void main(String[] args) {
		
		sum(100);
		
		
	}
	
	//����Ÿ���� ���� �Ű������� �ִ� ���
	static void sum(int a) {
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			sum+=i;
		}
		System.out.println("1 ~ "+ a +" = " + sum);
	}
	
	
}
