class DD{
	//�ν��Ͻ� ������ ���� ������ �������� Ȯ���ϰ� ��������
	static int cnt = 0; // ó���� �ѹ���(Ŭ������ �ε� �ɶ�) �ʱ�ȭ��
	int m = 0;
	
	void add() {
		cnt++;
		m++;
		System.out.println("cnt = " + cnt);
		System.out.println("m = " + m);
	}
	void add2() {
		
	}
}


public class Exam_05 {
	public static void main(String[] args) {
		
		DD d1 = new DD();
		d1.add();
		System.out.println("===============");
		DD d2 = new DD();
		d2.add();
		
		
		
		
		
		
	}
}
