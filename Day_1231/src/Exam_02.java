import java.util.Scanner;

/*
if()


switch ~ case
90�̻� , 80�̻�, 70�̻�, 60�̻� , 60�̸�
100~90 , 89~80 , 79~70 , 69~60, 59~0

 */



public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int var = sc.nextInt();
		
		String str = ""; // String str = null; �̰Ŷ��� �ٸ�����
		//char ch = 'A';
		
		switch(var/10) { //���� �Ǵ� ������ ��(����,����,���ڿ�)
			case 10:	// ��(����,����,���ڿ�)
				str = "A";
				break; // �̰� ������ -> ���� ������ �ؿ� ���� �� ����Ǿ� ����
			case 9:
				str = "A";
				break;
			case 8:
				str = "B";
				break;
			case 7:
				str = "C";
				break;
			case 6:
				str = "D";
				break;
			default:
				str = "F";
				
		}
		
		System.out.println("����� ������"+str+"�� �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
