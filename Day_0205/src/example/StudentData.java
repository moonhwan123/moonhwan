package example;

import java.util.ArrayList;

public class StudentData {
	ArrayList<Student> stuList;
	
	
	StudentData(){}
	StudentData(ArrayList<Student> stuList){
		this.stuList = stuList;
	}
	
	
	public void print() {
		System.out.println("학번\t이름\t점수\t학점");
		for(int x = 0 ; x < stuList.size(); x++) {
			System.out.println(stuList.get(x));
		}
	}
	
	
}
