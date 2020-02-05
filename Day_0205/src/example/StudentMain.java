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
			
			while(true) { // 학년 입력
				System.out.print("학년 입력(1~3) >>");
				grade = sc.nextLine();
				boolean bool = Pattern.matches("(0|1|2|3)", grade);
				
				if(bool) {
					break;
				}else {
					System.out.println("올바르지 않은 학년 입니다. 다시 입력하세요 ");
				}	
			}
			
			if(grade.equals("0")) break;
			
			while(true) { // 반 입력
				System.out.print("반 입력(1~6) >>");
				cla = sc.nextLine();
				boolean bool = Pattern.matches("(1|2|3|4|5|6)", cla);
				
				if(bool) {
					break;
				}else {
					System.out.println("올바르지 않은 반 입니다. 다시 입력하세요 ");
				}	
			}
			
			while(true) { // 번호 입력
				System.out.print("번호 입력(1~45) >>");
				bun = sc.nextLine();
				boolean bool = false;
				
				if(Integer.parseInt(bun) >= 1 && Integer.parseInt(bun) <= 45) {
					bool = true;
				}
				
				if(bool) {
					break;
				}else {
					System.out.println("올바르지 않은 번호 입니다. 다시 입력하세요 ");
				}	
			}
			
			while(true) { // 이름 입력
				System.out.print("이름 입력(1~10자) >>");
				name = sc.nextLine();
				boolean bool = Pattern.matches("\\w{1,10}", name);
				
				if(bool) {
					break;
				}else {
					System.out.println("올바르지 않은 이름 입니다. 다시 입력하세요 ");
				}	
			}
			
			
			while(true) { // 점수입력
				System.out.print("점수 입력(0~100) >>");
				score = sc.nextLine();
				boolean bool = false;
				
				if(Integer.parseInt(score) >= 0 && Integer.parseInt(score) <= 100) {
					bool = true;
				}
				
				if(bool) {
					break;
				}else {
					System.out.println("올바르지 않은 이름 입니다. 다시 입력하세요 ");
				}	
			}
			
			stu = new Student(grade,cla,bun,name,Integer.parseInt(score));
			
			if(stuList.contains(stu)) {
				System.out.println("중복된 값이 있습니다. 다시 입력 하세요");
				continue;
			}
			
			stuList.add(stu);
			
		}// 전체 while문 끝
		
		
		StudentData sd = new StudentData(stuList);
		sd.print();
		
		
		
	}
}
