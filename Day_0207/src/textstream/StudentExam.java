package textstream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*
파일로 부터 입력 (data.txt)
출력 예시 (파일 출력 : dataout.txt , 콘솔 출력)

번호    이름    성별    국어    영어    수학    총점     평균
1   홍길동   남좌     .   .   .
 */

public class StudentExam {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\data.txt")));
		BufferedReader br2 = new BufferedReader(new FileReader(new File("c:\\data\\data.txt")));
		
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter(new File("c:\\data\\dataout.txt"))));
		pw3.println("번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		List<Student> list = new ArrayList<Student>();
		TreeSet<Student> ts = new TreeSet<Student>();
		
		while(!(br2.readLine() == null)) {
			String data = br.readLine();
			
			String[] dataArr = data.split(",");
			
			if(dataArr[2].equalsIgnoreCase("m")) dataArr[2] = "남자";
			else dataArr[2] = "여자";
			

			int[] score = new int[3];
			for(int x = 0 ; x < score.length; x++) {
				score[x] = Integer.parseInt(dataArr[x+3]);
			}
			
			Student stu = new Student(Integer.parseInt(dataArr[0]),dataArr[1],dataArr[2],score);
			if(list.contains(stu)) {
				
			}else {
				list.add(stu);
			}
			
			ts.add(stu);
		}
		
		StudentData sd = new StudentData(list);
		StudentData sd2 = new StudentData(ts);
		
		for(int x = 0; x < list.size(); x++) {
			pw3.println(sd.list.get(x));
		}	
		sd.print();
		System.out.println();
		sd2.print2();
	
		br.close();
		pw3.close();
		
	}
}
