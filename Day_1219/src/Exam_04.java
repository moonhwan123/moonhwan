import java.util.Scanner;

/*

if(���ǽ�){ // ��
	����1;
}else{ // ����
	����2
}
  ����3;


���� : Ű����� ������ �Է� �޾Ƽ� 85�� �̻� �̸� '�հ�'
           �ƴϸ� '���հ�'

 */


public class Exam_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int jumsu = sc.nextInt();
		
		String str = "";
		
		if (jumsu >= 85) {
			str = "PASS";
		}
		else {
			str = "NOT PASS";
		}
		System.out.println("��� : " + str);
		
		sc.close();
		
	}

}
