import java.util.Scanner;

public class day5 {

	public static void main(String[] args) {
		
		/*
		 -���� ������
		 	
		 	= : ������ �ǿ����ڿ� ������  ����
		 		num = 1 + 2
		 	
		 	���� ���� ������
		 		a+=b : a = a + b
		 		a-=b : a = a - b
		 		a*=b : a = a * b
		 		a/=b : a = a / b
		 
		 	
		 
		 
		 */
		
		/*
		int a = 3, b = 3, c = 3;
				a+=3;
				b*=3;
				c%=2;
				
		System.out.println("a="+a+"\nb="+b+"\nc="+c);
		System.out.println();
		b += a;
		c -=a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		*/
		
		
		/*
		 -�� ������
		 
		 	: �纯�� ���Ͽ� ������ True �ٸ��� False
		 	
		 	== : ���� 
		 	>  : ũ��
		 	<  : �۴�
		 	>= : ũ�ų� ����
		 	<= : �۰ų� ����
		 	!= : ���� �ʴ�
		 
		 
		 */
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a+b<=c);
		System.out.println(a+b>c);
		System.out.println();
		
		System.out.println('a'>'b'); // ���ڴ� �ڵ����� �ƽ�Ű �ڵ�ǥ�� �ִ� ������ ����Ѵ�.
		System.out.println(!(3!=2));
		System.out.println();
		
		String str = "Hello Java";
		System.out.println(str == "Hello java");
		// �ڹٿ����� ��ҹ��� �ٸ��� ���
		System.out.println(str.equals("Hello Java"));
		
		
		/*
		 -�� ������
		 
		 	: �������� ������ ���ÿ� �˻��ϴ� ��� ���
		 	: ���ϴ� �� ���� Boolean ���� �̿�����
		 	
		 	&&(AND) : �Ѵ� True �϶� True
		 	||(OR) : �� �� �ϳ��� True�� True
		 	!(NOT) : True -> False , False -> True
		 	
		 */
		System.out.println();
		
		int d = 10;
		System.out.println(5<d && d<15); // 5 < x < 15
		System.out.println((5<d && d<15) && d%2==0);
		
		//char ch = 'a';
		// (ch >= 'A') && (ch <= 'Z') ;
		
		/*
		 -��Ʈ����
		 	
		 	��Ʈ AND(&) : ��Ʈ ������ AND����
		 	��Ʈ OR(|) : ��Ʈ ������ OR����
		 	��Ʈ XOR(^) : ��Ʈ ������ XOR����
		 	��Ʈ NOT(~) : ��ȣ ����
		 	
		 -����Ʈ ������
		 	>> : ���������� ��Ʈ �̵� (��Ʈ �ϳ� �̵� / 2)
		 	<< : �������� ��Ʈ �̵� (��Ʈ �ϳ� �̵� * 2)
		 	
		 */
		System.out.println();
		int bit_a = 17;
		int bit_b = 5;
		
		System.out.println(bit_a&bit_b);
		System.out.println(bit_a|bit_b);
		System.out.println(bit_a>>1);
		System.out.println(bit_a>>2);
		System.out.println(bit_b<<1);
		
		/*
		 -���� ������
		 	
		 	: ���� ������ ������
		 	: ���ǽ��� ����� ���� ��� ��ȯ
		 	: ����? �׸�1(��) : �׸�2(����)
		 */
		
		System.out.println();
		int age= 17;
		System.out.println(age>19?"����":"û�ҳ�");
		
		// ��������
		// �� ���� ���� �Է� �ް� , �� ���߿� ���� ū ���� ȭ�鿡 ����ض�
		// ���� , �� ���� ���� �Է� �ް�, ���� ū��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է� �ϼ��� :");
		int num_A = sc.nextInt();
		int num_B = sc.nextInt();
	
		System.out.println("�� ���� ū ���� "+(num_A<num_B?num_B:num_A));
		
		sc.close();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
