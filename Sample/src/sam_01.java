import java.util.Scanner;

public class sam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			if(num>100) {
				System.out.println("�Է� ����!");
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			switch(num/10) {
			case 10:
			System.out.println("��");
			break;
			case 9:
			System.out.println("��");
			break;
			case 8:
			System.out.println("��");
			break;
			case 7:
			System.out.println("��");
			break;
			case 6:
			System.out.println("��");
			break;
			default:
				System.out.println("��");
			}
		
		}
		
		
	}

}
