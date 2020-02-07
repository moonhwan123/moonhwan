package textstream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*
���Ϸ� ���� �Է� (data.txt)
��� ���� (���� ��� : dataout.txt , �ܼ� ���)

��ȣ    �̸�    ����    ����    ����    ����    ����     ���
1   ȫ�浿   ����     .   .   .
 */

public class StudentExam {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\data.txt")));
		BufferedReader br2 = new BufferedReader(new FileReader(new File("c:\\data\\data.txt")));
		
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter(new File("c:\\data\\dataout.txt"))));
		pw3.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
		List<Student> list = new ArrayList<Student>();
		TreeSet<Student> ts = new TreeSet<Student>();
		
		while(!(br2.readLine() == null)) {
			String data = br.readLine();
			
			String[] dataArr = data.split(",");
			
			if(dataArr[2].equalsIgnoreCase("m")) dataArr[2] = "����";
			else dataArr[2] = "����";
			

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
