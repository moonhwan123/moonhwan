
public class day1 {
	public static void main(String[] args) {	
		
		System.out.println("Hello Java"); //�����ݷ�  (;) : ������ ���� �˸��� ��ȣ
		
		/*
		 �ּ� (Comment)
		 	- �ҽ��� ������ �߰� �ϴ� ��  
		 	- ���α׷� ���࿡ ������ ��ġ�� �ʴ´�.
		 	- �� �� �ּ� : //�� ���� �ּ�ó��
		 	- ���� �� �ּ� : ���� ���� �ִ� �� 
		 */
		
		// �ڹ��� ��¹� 
		System.out.print("Hello World"); //���� ���� �Ǿ� ���� ����
		
		System.out.println("Hello World"); //���� ���� �Ǿ� ���� (�ڵ� �� �ٲ�)
		
		System.out.printf("Hello World\n"); //������ �̿��� ���
		
		System.out.printf("%d",10);
		
		System.out.printf("%f",10.5);
		
		System.out.printf("%c", 'A');
		System.out.printf("%s", "ABC");
		System.out.println();
		System.out.printf("���� : ");
		System.out.println(10);
		System.out.print("���� : ");
		System.out.println('A');
		
		System.out.printf("���� : %d ���� : %c" ,10,'A');
		System.out.println();
		System.out.println("���� : "+ 10 +"���� : "+'A');
		
		
		/*
		 -���Ĺ���
		 %d : 10����
		 %x : 16����
		 %o : 8����
		 %f : �Ǽ���
		 %c : ����
		 %s : ���ڿ�
		 %b : Bool��
		 
		 -�̽������� ����
		 \n : ����
		 \t : ���� ��
		 \r : ���� ó������ Ŀ�� �̵�
		 \\ : \ ���
		 \" : " ���
		 \' : ' ���
		 
		 */
		
		
		//"�ȳ��ϼ���" ����ϱ�
		System.out.println("\"�ȳ��ϼ���\"");
		// \n ����ϱ�
		System.out.printf("���� : %d \n���� : %c\n",10,'A');
		System.out.println();
		
		/*
		 "�ȳ��ϼ���"
		 ���� ooo �Դϴ�.
		 ���̴� oo �̰�,
		 ������ oo �Դϴ�.
		 
		 printf���� ����Ͽ� ���
		 */
		
		System.out.printf("\"�ȳ��ϼ���\"\n���� %s �Դϴ�.\n���̴� %d�� �̰�,\n������ %s �Դϴ�.", 
				"ȫ�浿",45,"����");
		System.out.println();
		
		/*
		 -����
		 	: ���ϴ� �� (���α׷��� ����Ǵ� ���氡���� ����)
		 	: ���α׷� ó�� ������ �����͸� ��Ƶ� �� �ִ� �޸��� ����
		 	
		 -������ ����
		 	���� : ������ Ÿ�� ���� �̸�;
		 	ex) int a;
		 		int - ������ Ÿ��
		 		a - ������
		 		
		 -�ʱ�ȭ
		 	int a = 1;
		 	�ʱⰪ : ������ ������ �� ������ ��
		 */
		int a;
		a = 15; // �ʱ�ȭ�� ���� ���� �ÿ��� ���� �����Ⱚ ����
		System.out.println(a);
		
		/*
		 -������ ���� ��Ģ
		 	������ �̸��� ���� ��ҹ���, ����, Ư������($,_)�� ����
		 	���� ��ҹ��� ���� �Ѵ�.
		 	������ ������ ���ڰ� �Ұ����ϴ�.
		 	����� ��� �Ұ���
		 	
		 	�ǵ��� �����̸��� ������ ���� �ϵ��� �϶�
		 */
		
		
		/*
		 -������ Ÿ��
		 	������  : ����(�Ҽ����� �ƴ� �ڿ���)�� ���� �� �� ����ϴ� ������ Ÿ��
		 		byte : 1byte
		 		short : 2byte
		 		int : 4byte (�̰� ���� ��)
		 		long : 8byte
		 		
		 	�Ǽ��� : �Ǽ� (�Ҽ���)�� ����
		 		float : 4byte (�Ҽ��� ���� 6�ڸ����� ǥ�� �������� �ݿø�)
		 		double : 8byte (�Ҽ��� ���� 15�ڸ� ���� ǥ��, �̰� ����  ��)
		 		
		 	������ : ���ڸ� ���� �� �ִ� ������ Ÿ��
		 		char : 2byte (�ƽ�Ű �ڵ尡 �ƴ� ���� �ڵ带 ��� �ϱ� ����)
		 		
		 	���� : 
		 		True/False (��ҹ��� ����) : ���� ������ ��Ÿ��
		 								  0�� ����, �׿� ���� �� 
		 		
		 	���ڿ��� : 
		 		String : ���ڰ� ������ ����
		 		String a = "Hello";
		 		
		 		//wrapper Ŭ����
		 		  String b = new String("Hello");
		 */
		
		// ������ ����
		int num; // ������ int num ����
		num = 10;
		System.out.println("num : "+num);
		num = 20;
		System.out.println("num : "+num);
		System.out.println("num+num : "+(num+num));
	
		float f;
		f = 0.123456789f;
		System.out.println("f = "+f);
		
		double d;
		d = 0.1234567891232352;
		System.out.println("d = " +d);
		
		byte num2 = 127;
		System.out.println("num2 = " + num2);
		byte num3 = (byte)128;
		System.out.println("num3 = " + num3); // �����÷ο� �߻�
		
		num2 = -128;
		num3 = (byte)-129;
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3); // ����÷ο� �߻�
		
		char ch;
		ch = 'A';
		System.out.println(ch);
		ch = 97; // char ���� ���ڸ� ���� �ƽ�Ű �ڵ尪 ���
		System.out.println(ch);
		ch = '\u0061'; // �����ڵ� ��
		System.out.println(ch);
		ch = 'A' +2;
		System.out.println(ch);
		
		/*
		 -�� ��ȯ
		 	: ������ ����� ������ Ÿ���� �ٸ� Ÿ������ ��ȯ
		 	�ڵ� ����ȯ(������ ����ȯ) : ũ�⿡ ���缭 �˸��� Ÿ������ �� ��ȯ
		 	����� ����ȯ(ĳ����) : ���α׷��Ӱ� ������ �ڷ������� ������ ��ȯ
		 */
		
		
		/*
		 -���
		 	: ���α׷� ���� �� ���� �� ������ ������ ��
		 	: final datetype ����� = ��;
		 */
		final double PIE = 3.14;
		
		System.out.println(PIE*10*10);
		System.out.println();
		
		int Num1 = 20;
		int Num2 = 25;
		int Num3 = 30;
		int sum = Num1+Num2+Num3;
		System.out.printf("Num1�� Num2�� Num3�� ���� : %d�Դϴ�.\n ", sum);
		
		char A = '?';
		System.out.printf("Hello%c" , A);
		
		String str1 = "My name is OOO";
		System.out.println(str1);
		System.out.println(A);
		
		double r = 10.0;
		final double PI = 3.14;
		
		double circle_area = r*r*PI;
		System.out.printf("������ %.2f �� �� ���̴� %.2f �Դϴ�.\n",r,circle_area);
		
		
		
		
		
		
		
	}
}
