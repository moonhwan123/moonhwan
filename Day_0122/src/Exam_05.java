
/*
[���ڿ� �и�]
substring(����, ������)
substring(����) ���� ������

���忡�� ���� ���ٰ� ��

p.469~471 ���־��� �޼ҵ�

 */


public class Exam_05 {
	public static void main(String[] args) {
		
		String str = "Hello World Java";
		
		//��ü ���ڿ� ���� ���
		int length = str.length(); 
		
		//Hello���ڸ� ����
		String a = str.substring(0,5);
		//Java���ڸ� ����
		String b = str.substring(12);
		
		System.out.println(length);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		for(int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);
			System.out.print(ch + " ");
		}
		
		
	}
}
