import java.util.Scanner;

/*
Ű���� �Է�
��ȣ:
����:
����:
����:

���
��ȣ	���� 	����	����	����	���

ó������
���� = ����+����+����
��� = ����/3.
3���� ��� 40�� �̻��̰�,��� 60�� �̻�
1�����̶� 40�̸��̸� '����'
3���� ��� 40�̻������� ����� 60�̸��̸� '���հ�'
 */


public class Exam_07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("��ȣ�� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.print("���������� �Է� �ϼ��� : ");
		int kor = sc.nextInt();
		
		System.out.print("���������� �Է� �ϼ��� : ");
		int eng = sc.nextInt();
		
		System.out.print("���������� �Է� �ϼ��� : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double ave = tot/3.;
		ave = (int)(ave*10-0.5)/10.;
		
		String str ="";
		
		
		if(ave >= 60) {
			if(kor >= 40 && eng >= 40 && mat>= 40) {
				str = "PASS";
			}else str = "����";
		}else str = "NOT PASS";
		
		
		/*
		if(kor>=40 && eng>=40 && mat>=40 && ave>= 60) {
			str = "PASS";
		}
		else {
			if(ave<60) { 
				str = "NOT PASS";
			}
			else str = "����";
		}
		*/
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t����");
		System.out.println(num+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+str);
		
		sc.close();
	}

}
