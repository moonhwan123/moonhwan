package textstream;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class StudentData {
	List<Student> list;
	TreeSet<Student> ts;
	
	StudentData(){}
	StudentData(List<Student> list){
		this.list = list;
		
		for(int x = 0 ; x < list.size(); x++) {
			if(list.get(x).gender.equalsIgnoreCase("m")) {
				list.get(x).gender = "남자";
			} else if(list.get(x).gender.equalsIgnoreCase("f")) {
				list.get(x).gender = "여자";
			}
		}
		
	}
	StudentData(TreeSet<Student> ts){
		this.ts = ts;
	}
	
	public void print() {
		System.out.println("번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		for(int x = 0 ; x < list.size(); x++) {
			System.out.print(list.get(x));
		}
	}
	
	public void print2() {
		System.out.println("번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		Iterator<Student> iter = ts.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
	}
	
	
}
