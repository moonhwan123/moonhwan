package example;

import java.util.ArrayList;

public class StudentData {
	ArrayList<Student> stuList;
	
	
	StudentData(){}
	StudentData(ArrayList<Student> stuList){
		this.stuList = stuList;
	}
	
	
	public void print() {
		System.out.println("�й�\t�̸�\t����\t����");
		for(int x = 0 ; x < stuList.size(); x++) {
			System.out.println(stuList.get(x));
		}
	}
	
	
}
