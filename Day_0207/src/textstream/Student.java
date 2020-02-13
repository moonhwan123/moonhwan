package textstream;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	int bun;
	String name;
	String gender;
	int score [];
	int tot;
	double ave;
	
	Student(){}
	Student(int bun, String name, String gender, int[] score){
		this.bun = bun;
		this.name = name;
		this.gender = gender;
		this.score = score;
		
		tot = score[0] + score[1] + score[2];
		ave = (int)(tot/3.*100+0.5)/100.;
	}
	
	@Override
	public int compareTo(Student s) {
		if(bun < s.bun) {
			return -1; // 비교하는 값이 크면
		}else if(bun == s.bun) {
			return 0; 
		}else {
			return 1; // 비교하는 값이 작으면
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return bun == s.bun || name.equals(s.name);
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return bun + name.hashCode();
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(bun+"\t");
		sb.append(name+"\t");
		sb.append(gender+"\t");
		sb.append(score[0]+"\t");
		sb.append(score[1]+"\t");
		sb.append(score[2]+"\t");
		sb.append(tot+"\t");
		sb.append(ave+"\n");

		return sb.toString();
	}
	
	
}
