
public class Exam_04 {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		arrPrint(arr); // arr�� ù��° ����� �ּҰ��� �Ѿ
		
		int b = 100;
		intPrint(b);
		
		
	}
	 
	static void arrPrint(int[] a) { // []�ȿ� �ƹ��͵� ���� ������ -> �Ű������� �Ѿ�ö� ù��° ���� �ּҰ��� �Ѿ���⶧��
		                            // ���� ������ �ƴϴϱ�!
		for(int x = 0; x < a.length; x++) {
			System.out.print(a[x]+"\t");
		}
	}
	static void intPrint(int a) {
		System.out.println(a);
	}
	//�޼ҵ忡�� ������ int a�� �޼ҵ� ������ ������ int a�� �����
	
	
	//�ᱹ ������ ���ؼ� �ּҰ� �Ѿ�� �ּҸ� ������ǰ� , ���� �Ѿ� ���� ���� �������
	
}
