package API;

public class wrapper_string_change {

	public static void main(String[] args) {
		
		int i = 10;
		Integer wi = new Integer(i); // Boxing int -> Integer
		Integer wi2 = i; // Auto UnBoxing
		
		String str1 = wi.toString(); // int -> String
		String str2 = Integer.toString(i); // int -> String
		String str3 = String.valueOf(i); // int -> String
		String str4 = i+""; // int -> String
		System.out.println(str1+str2+str3+str4); // 4���� ���ڿ���

		
		String str = "100"; // 100Aó�� ���ڰ� �������� �ȵ�
		
		Integer wi1 = new Integer(str); // String -> Integer
		int i1 = wi1.intValue();
		int i2 = wi1; // Auto Unboxing
		int i3 = Integer.parseInt(str); // ���� ���̾�
		
		System.out.println(i1+i2+i3);
		
		
		/*
		 
		1. String -> �⺻ �ڷ���
			
			(1)���� Ŭ���� ��ü ���� (�������� �Ű����� ���� ���ڿ� ����) �� ��ڽ� �Ǵ� �����ڽ�
				ex) Integer wi = new Integer("10");
					int i = wi.invalue; / int i = wi;
					
			(2)���� Ŭ������ ����(static)�޼ҵ� (parse �⺻�ڷ���(���ڿ�))�� ��ȯ
			
			
		2. �⺻ �ڷ��� -> String
			
			(1)�⺻ �ڷ��� �ڽ�(���� Ŭ���� ��ü ����) �� ���� Ŭ������ toString()�޼ҵ� �̿�
			
			(2)���� Ŭ������ ���� �޼ҵ��� toString(�⺻�ڷ���) �̿�
			
			(3)String Ŭ������ ���� �޼ҵ��� valueOf(�⺻�ڷ���) �̿�
			
			(4)�⺻�ڷ��� "" ���ϱ�(+) ����
			
		 */

	}

}
