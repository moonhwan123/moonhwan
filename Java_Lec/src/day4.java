import java.util.Scanner;

public class day4 {

	public static void main(String[] args) {
		
		/*
		 -����
		 	: �־��� ���� ����Ͽ� ����� ���� ����
		 	
		 -������
		 	: Ư���� ������ �����ϱ� ���� ����ϴ� ��ȣ
		 	: ������ �ϴ� '������' , ������ ���ϴ� '�ǿ�����'�� �����ȴ�.
		 	
		 -���������
		 	+ : ���ϱ�
		 	- : ����
		 	* : ���ϱ�
		 	/ : ������
		 	% : ������
		 	
		 	
		 */
		
		// �� ���� �̸� ������ ��Ģ���� ���� �� ���
		/*
		int a = 10;
		int b = 3;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		System.out.println();
		*/
		
		// �� ���� �Է� �޾Ƽ� ��Ģ ���� ���� �� ���
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("�� �� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("num1 + num2 = "+(num1+num2));
		System.out.println("num1 - num2 = "+(num1-num2));
		System.out.println("num1 * num2 = "+(num1*num2));
		System.out.println("num1 / num2 = "+(num1/num2));
		System.out.println("num1 % num2 = "+(num1%num2));
		System.out.println();
		*/
		
		/*
		 �� �޷� ȯ�� ��ȯ�ϱ�
		System.out.print("��ȯ �� ��ȭ�� �Է� �ϼ��� : ");
		int won = sc.nextInt();
		double rate = 1100;
		double dollar = won/rate;
		
		System.out.printf("%d���� $%.2f �Դϴ�.",won,dollar);
		System.out.println();
		*/
		/*
		System.out.print("�ʸ� �Է� �ϼ��� : ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time/60) / 60;
		
		System.out.println(time + "�ʴ� ");
		System.out.println(hour + "�ð�,  ");
		System.out.println(minute + "��, ");
		System.out.println(second + "�� �Դϴ�. ");
		System.out.println();
		*/
		
		/*
		 -���� ������
		 	: �ǿ����ڰ� �ϳ��� ������
		 		- : ��ȣ ������(������ ��ȣ ����)
		 		! : ���� ������(True -> False , False -> True)
		 		++ : ���� ������(������ 1 ����, a++ �Ǵ� ++a)
		 		-- : ���� ������(������ 1 ����, a-- �Ǵ� --a)
		 	
		 */
		/*
		int a = -1;
		int b = 2;
		System.out.println(a);
		System.out.println(-a);
		System.out.println(-b);
		
		boolean a_bool = true;
		boolean b_bool = false;
		System.out.println(!a_bool);
		System.out.println(!b_bool);
		
		int num1 = 1;
		System.out.println("���� num1 = "+num1);
		num1++;
		System.out.println("���� num1 = "+num1);
		*/
		
		/*
		 -���� ������
		 	���� : ��ɹ� ���� �� ����
		 	���� : ��ɹ� ���� �� ����
		 	
		 */
		
		// �Ʒ��� ���� �������� ���� ���� ���ϴ� ����
		/*
		System.out.println("���� num1 = "+num1);
		System.out.println("���� num1 = "+ ++num1);
		System.out.println("���� num1 = "+ num1++); // ���⼭�� 3�� ��µǴµ�, �ֳ��ϸ� ����Ʈ ���� ����� �ѵڿ� ++�� �����ϱ� �����̴�.
		System.out.println("���� num1 = "+ num1);
		*/
		
		int a,b,c,d;
		a=1;
		b=++a;
		c=a++;
		d=b++ + ++c;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		
		
		sc.close();
		
		
		
	
		
		
	}

}
