package student;

public class Student {
	int bun;
	String name;
	int score;
	int dapcnt;
	String[] daparr = new String[20];
	String[] arr = new String[20];
	
	Student() {}
	Student(int bun, String name,String[] arr){
		this.bun = bun;
		this.name = name;
		this.arr = arr;
	}
	
//	@Override
//	public String toString() {
//		return this.bun+"\t"+this.name+"\t"+arr[0]+"\t";
//	}
	
	
	
}
