/*
[StringŬ���� �޼ҵ�]
valueOf(); 
String.format(); -> ���� ����

 */

public class Exam_01 {
	
	public static void main(String[] args) {
		
		int a = 100;
		
		String aa = a+""; // a�� ���ڿ��� �ٲ� 
		String ab = String.valueOf(a); // ����ƽ �޼ҵ�� Ŭ���� �̸����� ���� ����
		String ac = String.valueOf(true); //"true"
		
		//����Ŭ���� (Wrapper Class)
		//�⺻�ڷ����ε� �װ� Ŭ�����϶�
		//int -> Integer / byte -> Byte / char -> Character
		
		int b = Integer.parseInt(ab); // ���ڿ��� ������
//  	int bb = Integer.parseInt("123a"); // ��Ÿ�� ���� �߻�
		int bbb = Integer.valueOf(ab); // ������ �ٲ�� 
		
		int var = 100;
		double dou = 3.141582;
		
		//���� var=100  �Ǽ� dou= 3.14
		
		System.out.println("���� var = "+var+" �Ǽ� dou = "+dou);
		
		String ss = String.format("���� var = %5d �Ǽ� dou = %f ", var,dou);
		System.out.println(ss);
		
		String sss = String.format("���� var = %10d �Ǽ� dou = %10.3f ", var,dou);
		System.out.println(sss);
		
		
		
	}

}
