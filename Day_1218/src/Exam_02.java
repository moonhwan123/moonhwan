
public class Exam_02 {

	public static void main(String[] args) {
		
		int a = (int) (7/5.); // ����ȯ - '���� ����ȯ'(�����Ͱ� �߷� ���� �� ����)
		int b = 7%5; 
		
		System.out.println("7/5 = " + a);
		System.out.println("7%5 = " + b);
		
		System.out.println("7/5 = " + 7/5.);
		System.out.println("7%5 = " + 7%5);
		
		int var = (int) 3.14; // int�� 4byte �Ǽ��� 8byte�� x
		double d1 = 3.14;
		double d2 = 90; // ���⼭�� '�ڵ� ����ȯ' �� �Ͼ double 8byte > ���� 4byte
		System.out.println("d2 = " + d2);
		System.out.println("var = " + var);
		
		
		
	}

}
