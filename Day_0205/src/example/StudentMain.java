package example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		Student stu;
		
		while(true) {
			String grade;
			String cla;
			String bun;
			String name;
			String score;
			
			while(true) { // �г� �Է�
				System.out.print("�г� �Է�(1~3) >>");
				grade = sc.nextLine();
				boolean bool = Pattern.matches("(0|1|2|3)", grade);
				
				if(bool) {
					break;
				}else {
					System.out.println("�ùٸ��� ���� �г� �Դϴ�. �ٽ� �Է��ϼ��� ");
				}	
			}
			
			if(grade.equals("0")) break;
			
			while(true) { // �� �Է�
				System.out.print("�� �Է�(1~6) >>");
				cla = sc.nextLine();
				boolean bool = Pattern.matches("(1|2|3|4|5|6)", cla);
				
				if(bool) {
					break;
				}else {
					System.out.println("�ùٸ��� ���� �� �Դϴ�. �ٽ� �Է��ϼ��� ");
				}	
			}
			
			while(true) { // ��ȣ �Է�
				System.out.print("��ȣ �Է�(1~45) >>");
				bun = sc.nextLine();
				boolean bool = false;
				
				if(Integer.parseInt(bun) >= 1 && Integer.parseInt(bun) <= 45) {
					bool = true;
				}
				
				if(bool) {
					break;
				}else {
					System.out.println("�ùٸ��� ���� ��ȣ �Դϴ�. �ٽ� �Է��ϼ��� ");
				}	
			}
			
			while(true) { // �̸� �Է�
				System.out.print("�̸� �Է�(1~10��) >>");
				name = sc.nextLine();
				boolean bool = Pattern.matches("\\w{1,10}", name);
				
				if(bool) {
					break;
				}else {
					System.out.println("�ùٸ��� ���� �̸� �Դϴ�. �ٽ� �Է��ϼ��� ");
				}	
			}
			
			
			while(true) { // �����Է�
				System.out.print("���� �Է�(0~100) >>");
				score = sc.nextLine();
				boolean bool = false;
				
				if(Integer.parseInt(score) >= 0 && Integer.parseInt(score) <= 100) {
					bool = true;
				}
				
				if(bool) {
					break;
				}else {
					System.out.println("�ùٸ��� ���� �̸� �Դϴ�. �ٽ� �Է��ϼ��� ");
				}	
			}
			
			stu = new Student(grade,cla,bun,name,Integer.parseInt(score));
			
			if(stuList.contains(stu)) {
				System.out.println("�ߺ��� ���� �ֽ��ϴ�. �ٽ� �Է� �ϼ���");
				continue;
			}
			
			stuList.add(stu);
			
		}// ��ü while�� ��
		
		
		StudentData sd = new StudentData(stuList);
		sd.print();
		
		
		
	}
}
