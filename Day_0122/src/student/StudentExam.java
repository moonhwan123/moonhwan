package student;

import java.util.Scanner;

public class StudentExam {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] stu = new Student[10];
		Student s ;
		int cnt = 0;
		char check;
		int imsi;
		int imsi1;
		int imsi2;
		int imsi3;
		String imsiStr;
		
		while(cnt<10) {
			System.out.print("�Է�(��ȣ,�̸�,��,��,��) >> ");
			String str = sc.nextLine();
			
			String[] str1 = str.split(",");
			
			if(str.equalsIgnoreCase("end")) break;
			
			//���� ���� �Ǻ�
			check = str1[0].charAt(0);
			if(Character.isDigit(check)) { // ������ ������
				imsi = Integer.parseInt(str1[0]);
				if(imsi < 1 || imsi > 10) {
					System.out.println("���� ���� �ʰ� ����, �ٽ� �Է� �ϼ���!");
					break;
				}
			}else { // ���� �ƴ�
				System.out.println("���ڰ� �ƴմϴ�. �ٽ� �Է� �ϼ���!");
				break;
			}
			//�̸��Ǻ�
			if(str1[1].length() < 1 || str1[1].length() > 10) {
				System.out.println("�̸��� �������� �ʽ��ϴ�. �ٽ� �Է� �ϼ���!");
				break;
			}
			
			//���������Ǻ�
			imsiStr = str1[2].trim();
			check = imsiStr.charAt(0);
			if(Character.isDigit(check)) { // �̰� ������ ���������� ���ڴ�
				imsi1 = Integer.parseInt(imsiStr);
				if(imsi1 < 0 || imsi1 > 100) {
					System.out.println("���� �Է� ����! �ٽ��Է��ϼ���!");
					break;
				}
			}else { // ���� �ƴ�
				System.out.println("�ùٸ� ���������� �ƴմϴ�. �ٽ� �Է� �ϼ���!");
				break;
			}
			//���������Ǻ�
			imsiStr = str1[3].trim();
			check = imsiStr.charAt(0);
			if(Character.isDigit(check)) { // �̰� ������ ���������� ���ڴ�
				imsi2 = Integer.parseInt(imsiStr);
				if(imsi2 < 0 || imsi2 > 100) {
					System.out.println("���� �Է� ����! �ٽ��Է��ϼ���!");
					break;
				}
			}else { // ���� �ƴ�
				System.out.println("�ùٸ� ���������� �ƴմϴ�. �ٽ� �Է� �ϼ���!");
				break;
			}
			//���������Ǻ�
			imsiStr = str1[4].trim();
			check = imsiStr.charAt(0);
			if(Character.isDigit(check)) { // �̰� ������ ���������� ���ڴ�
				imsi3 = Integer.parseInt(imsiStr);
				if(imsi3 < 0 || imsi3 > 100) {
					System.out.println("���� �Է� ����! �ٽ��Է��ϼ���!");
					break;
				}
			}else { // ���� �ƴ�
				System.out.println("�ùٸ� ���������� �ƴմϴ�. �ٽ� �Է� �ϼ���!");
				break;
			}
			
			s = new Student(imsi,str1[1],imsi1,imsi2,imsi3);
			stu[cnt] = s;
			cnt++;
		}
		
		
		

		
		School sch = new School(stu,cnt);
		sch.rank();
		sch.ave();
		sch.sort();
		sch.print();
		
	}
}
