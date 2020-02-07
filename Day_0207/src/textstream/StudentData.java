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
				list.get(x).gender = "����";
			} else if(list.get(x).gender.equalsIgnoreCase("f")) {
				list.get(x).gender = "����";
			}
		}
		
	}
	StudentData(TreeSet<Student> ts){
		this.ts = ts;
	}
	
	public void print() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
		for(int x = 0 ; x < list.size(); x++) {
			System.out.print(list.get(x));
		}
	}
	
	public void print2() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
		Iterator<Student> iter = ts.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
	}
	
	
}
