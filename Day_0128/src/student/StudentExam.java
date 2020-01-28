package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("c:\\data\\test1.txt"));
		Scanner sc2 = new Scanner(System.in);
		
		String[] str = null;
		Student stu;
		Student stuArr[] = new Student[20]; // 학생 클래스 배열
		int cnt=0;
		
		System.out.print("정답을 입력 하세요(20개) >> ");
		String dap = sc2.next();
		
		
		
		while(sc.hasNext()) {
			String[] arr = new String[20]; 
			str = sc.nextLine().split(",");
			for(int x = 0; x < arr.length; x++) {
				arr[x] = str[x+2];
			}
			stu = new Student(Integer.parseInt(str[0]),str[1],arr);
			stuArr[cnt] = stu;
			cnt++;
		}
		
		StudentData std = new StudentData(stuArr,dap);
//		std.check();
		std.print();
		std.rate1();
		
		
		
		
		
		
		
		
		
	}
}
