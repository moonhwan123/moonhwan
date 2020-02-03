package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Ű���� �Է�
	�Է� : ��ȣ, �̸�, ����, ����, ����, ����, ����
	
	
2. ó������
	- �Է½� ��ȣ�� '0'�̸� �Է� ����
	- ��ȣ�� �ߺ��� �Է� �Ұ� �ϵ��� ó��
	- ������ �������� ���� �ο�
	- �ѹ��� �Է� �ڷ� ������ ��� �ϰ� 
	- �ѹ��� ������ �������� ��� �Ѵ�.
	
3. ���
	��ȣ          �̸�          ����1            ����2   ....   ����5         ����          ���          ����



 */


public class StudentExam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s;
		List<Student> stuList = new ArrayList<Student>();
		
		while(true) {
			System.out.print("��ȣ,�̸�,����1~5 �Է� >> ");
			String str = sc.nextLine();
			String strArr[] = str.split(",");
			int score[] = new int[5];
			
			if(strArr[0].equals("0")) {
				break;
			}
			
			for(int x = 0 ; x < score.length; x++) {
				score[x] = Integer.parseInt(strArr[x+2]);
			}
			
			s = new Student(Integer.parseInt(strArr[0]),strArr[1],score);
			if(stuList.contains(s)) {
				System.out.println("�ߺ��� ��ȣ �Դϴ�. �ٽ� �Է� �ϼ���");
			}else {
				stuList.add(s);
			}
			
			
		}
		
		StudentData sd = new StudentData(stuList);
		sd.sourcePrint(); // ���������� ���
		sd.sortdataPrint(); // ������ ������ ���
		
		

		
		
		
		
	}
}
