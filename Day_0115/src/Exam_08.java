/*
[��ü ��]



 */
class DataA{
	static int id = 10; // static�� ���� �ֵ��� Ŭ������ �ε� �Ǵ� ���� ����� ���Ƿ�, ���������� ������ �ʰ� ������ �����ϴ�.
	int pw = 111;
	
	boolean equals(DataA a) {
		return true;
	}
	
}
public class Exam_08 {
	public static void main(String[] args) {
		
		DataA a1 = new DataA();
		a1.id = 333;
		System.out.println(a1.id);
		DataA.id = 444;
		System.out.println(DataA.id);
		System.out.println(a1.id);
		DataA a2 = new DataA();
		
		System.out.println("a1==a2 : " + (a1==a2));
		
	}
}
