import java.util.Scanner;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��������
		//System.out.println("������ �Է� �Ͻÿ� : ");
		Scanner sc = new Scanner(System.in);
		
		//int jumsu=sc.nextInt();
		/*
		if(jumsu>=90)
			System.out.println("A");
		
			
		if( jumsu>=80 && jumsu<90)
			System.out.println("B");
		
			
		if(jumsu>=70 && jumsu<80)
			System.out.println("C");
		
			
		if(jumsu>=60 && jumsu<70)
			System.out.println("D");
		
		if(jumsu<60)
			System.out.println("F");
		*/
		
		
		
		/*
		 -else if
		 	: if�� ���ǽ��� �������� ������ ����
		 	: if�� ���ǽ��� �������� ���Ҷ� �ٸ� ���� �˻�
		 	: if���� ����(�ϳ��� if���� �������� else if �� ����)
		 	
		 -switch~case��
		 	: �ϳ��� ���ǽ����� ���� ����� �� ó�� 
		 	: ���ǽ��� ����� ���� �Ǵ� ���� (���ڿ� �� �Ǳ���)
		 	: switch(���ǽ�)
		 	  {
		 	  	case ��1 :
		 	  		//���ǽ��� ����� ��1�� ������� ����
		 	  		break;
		 	  	case ��2 :
		 	  		//���ǽ��� ����� ��2�� ������� ����
		 	  		break;
		 	  	default :
		 	  		//���ǽ��� ����� ��ġ�ϴ� ���� ���� �� ����(if���� else�� ����)
		 	  }
		 */
		
		
		
		/*
		if(jumsu>=90)
			System.out.println("A");
		else if(jumsu>=80)
			System.out.println("B");
		else if(jumsu>=70)
			System.out.println("c");
		else if(jumsu>=60)
			System.out.println("D");
		else 
			System.out.println("F");
		*/
		
		
		
		//Ȧ¦ �Ǻ���
		//¦���� "¦�� �Դϴ�." Ȧ���̸� "Ȧ�� �Դϴ�." 0�̸� "�ָ��ϳ׿�~"
		/*
		System.out.println("�Ʒ��� ���ڸ� �Է� �ϼ���");
		int num_1 = sc.nextInt();
		
		if (num_1 != 0) {
			if (num_1 %2 == 0)
				System.out.println("¦�� �Դϴ�.");
			else
				System.out.println("Ȧ�� �Դϴ�.");
		}
		else
			System.out.println("�ָ��ϳ׿�~");
		*/
		
		
		
		
		//�α��� ���α׷� 
		//id = java , pw = abc123
		/*
		System.out.print("ID �Է� : ");
		String id,pw;
		
		id = sc.nextLine();
		
		if(id.equals("java")) {
			System.out.println("ID ��ġ");
			System.out.print("PW �Է� : ");
			pw = sc.nextLine();
			if(pw.equals("abc123")) {
				System.out.println("PW��ġ");
				System.out.println("�α��� ����");
			}
			else
				System.out.println("�н����� ����ġ");
		}
		else
			System.out.println("ID ����ġ");
		*/
		
		
		
		
		// ���� ���� 2
		// +,- �� ǥ���Ѵ�. ex) 98�̻��̸� + 94�̸��� -
		/*
		System.out.print("���� �Է� : ");
		int jum = sc.nextInt();
		System.out.println("����� ������"+jum+"�� �Դϴ�.");
		
		if (jum>=90)
		{
			if (jum>=98)
				System.out.println("����� ������ A+ �Դϴ�.");
			else if (jum>93)
				System.out.println("����� ������ A0 �Դϴ�.");
			else
				System.out.println("����� ������ A- �Դϴ�.");
		}
		
		else if (jum>=80)
		{
			if (jum>=88)
				System.out.println("����� ������ B+ �Դϴ�.");
			else if (jum>83)
				System.out.println("����� ������ B0 �Դϴ�.");
			else
				System.out.println("����� ������ B- �Դϴ�.");
		}
		
		else if (jum>=70)
		{
			if (jum>=78)
				System.out.println("����� ������ C+ �Դϴ�.");
			else if (jum>73)
				System.out.println("����� ������ C0 �Դϴ�.");
			else
				System.out.println("����� ������ C- �Դϴ�.");
		}
		
		else if (jum>=60)
		{
			if (jum>=68)
				System.out.println("����� ������ D+ �Դϴ�.");
			else if (jum>63)
				System.out.println("����� ������ D0 �Դϴ�.");
			else
				System.out.println("����� ������ D- �Դϴ�.");
		}
		else
			System.out.println("����� ������ F �Դϴ�.");
		 */
		/*
		char grade =' ';
		char opt = '0';
		System.out.print("���� �Է�:");
		int jumsu = sc.nextInt();
		
		System.out.printf("����� ������ %d �Դϴ�. \n",jumsu);
		
		if(jumsu >= 90) {
			grade = 'A';
			if(jumsu>=98) {
				opt = '+';
			}
			else if(jumsu<94) {
				opt = '-';
			} 
		System.out.printf("����� ������ %c%c �Դϴ�.",grade,opt);	
		}
		
		if(jumsu >= 80) {
			grade = 'B';
			if(jumsu >= 88) {
				opt = '+';				
			}
			else if(jumsu < 84) {
				opt = '-';
			}
		}
		System.out.printf("����� ������ %c%c �Դϴ�.",grade,opt);
		*/
		
		
		
		/*
		//���ǽ��� ����� ���� �Ǵ� ���� (���ڿ� �� �Ǳ���)
		
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) 
		{
		case 1 :
			System.out.println("�ϳ�");
			break;
		case 2 :
			System.out.println("��");
			break;
		case 3 :
			System.out.println("��");
			break;
		default :
			System.out.println("�׿� ~");
			break;
		}
		*/
		
		
		//���� ���� (switch~case��)
		/*
		char grade = ' ';
		System.out.print("������ �Է� �ϼ��� : ");
		int score = sc.nextInt();
		
		switch(score/10)
		{
			case 10 :
			case 9 :
				grade = 'A';
				// ���⿡ if�� switch�� �־ ��� ����
				break;
			case 8 :
				grade = 'B';
				break;	
			case 7 :
				grade = 'C';
				break;	
			case 6 :
				grade = 'D';
				break;
			default :
				grade ='F';
				break;
		}
		System.out.printf("����� ����� %c�Դϴ�." , grade);
		*/
		
		
		
		
		
		//ȸ�� ��޿� ���� ���� ����ϱ�
		//����ġ~���̽��� ���
		//3��� - ����,����,�б�
		//2��� - ����,�б�
		//1��� - �б�
		
		/*
		System.out.print("����� ȸ������� �Է����ּ��� : ");
		int grade;
		grade = sc.nextInt();
		
		switch(grade)
		{
		case 3:
			System.out.println("�������� �ο�");
		case 2:
			System.out.println("������� �ο�");
		case 1:
			System.out.println("�б���� �ο�");
		}
		
		*/
		
		
		char gender;
		String regNo="";
		
		System.out.print("����� �ֹ� ��ȣ�� �Է��ϼ���(123456-1234567) : ");
		regNo = sc.nextLine();
		
		gender = regNo.charAt(7);
		
		switch (gender)
		{
		case'1':
		case'3':
			System.out.println("����� �����Դϴ�.");
			break;
		case'2':
		case'4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹι�ȣ �Դϴ�.");
		}
		// ����ġ�� �ȿ� ����ġ �� �־ 2000�� ���� ������ ����� �� ���� �Ǵ� �� �� �ִ�.
		
		sc.close();
		
	}

}
