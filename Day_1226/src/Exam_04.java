import java.util.Scanner;

public class Exam_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ �Է� : ");
		int bun = sc.nextInt();
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		
		System.out.print("���� ���� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� ���� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� ���� : ");
		double mat = sc.nextDouble();
		
		double tot = kor + eng + mat;
		
		double ave = tot/3;
		
		System.out.println();
		
		System.out.println("[����ǥ]");
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave);
		
		
		
	}

}
