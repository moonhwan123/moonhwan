package student;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jum[] = new int[10];
		
		System.out.print("��ȣ/�̸� >>");
		int bun = sc.nextInt();
		String name = sc.next();
		System.out.print("���� 10�� �Է� >> ");
		for(int i = 0; i < jum.length; i++) {
			jum[i] = sc.nextInt();
		}
		
		StudentHak std = new StudentHak(bun, name, jum);
		
		std.title();
		std.account();
		std.scoreMax();
		std.scoreSelection();
		std.scoreBubble();

	}

}
