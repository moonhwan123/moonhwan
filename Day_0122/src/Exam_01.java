/*
[String "Ŭ����"]
	-����  
	 : "���ڿ�" ����� ����ӽ� ��ü���� ���� (�Ȱ��� ���ڿ��������� �ȸ���)
	 : ���ڿ��� �Һ�


�޼ҵ念�� : Ŭ���� , static ����
�� : ��ü
���� : ����

 */

class AA{
	
}

public class Exam_01 {

	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "123"; // ������ 123�� ����� �� �ֱ� ������ ���� ������ �ʰ� ���� 123�� ����Ų��. (�Ȱ��� ���ڿ��������� �ȸ���)
		String str3 = new String("123"); // new�� ����� ��� ���� ����� ������.
//		String str4 =""; //null�ϰ� ""�� �ٸ�
//		String str5 = new String();
//		str = str+"000"; // ������ 123 �� �������°� �ƴϰ�(�Һ�) ���ο� 123000�� �����. (���ο� �ּҸ� ����Ŵ)
		
		
		
		
//		AA a = new AA();
//		System.out.println("a = "+a);
//		System.out.println("str = "+str); // StringŬ������ toString()�� �������̵� �Ǿ� �ִ�.
//		System.out.println("str4 = "+str4);
//		System.out.println("str5 = "+str5); 
		
		
		//�� (==) : �⺻��
		//equals() 
		
		System.out.println("str1 == str2 : " + (str1 == str2)); // ���� �ּ����� �Ǻ�
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		System.out.println("str1.equals(str3) : " + (str1.equals(str3))); // ���� ��ü���� �Ǻ�
		
		
		
	}
}
