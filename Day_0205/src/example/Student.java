package example;

public class Student {
	String grade;
	String cla;
	String bun;
	String name;
	int score;
	String rank;

	
	Student(){}
	Student(String grade, String cla, String bun, String name, int score){
		this.grade = grade;
		this.cla = cla;
		this.bun = bun;
		this.name = name;
		this.score = score;
		
		if(100 >= score && score >= 90) {
			rank = "A";
		}else if(89 >= score && score >= 80) {
			rank = "B";
		}else if(79 >= score && score >= 70) {
			rank = "C";
		}else if(69 >= score && score >= 60) {
			rank = "D";
		}else {
			rank="F";
		}
			
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return s.bun.equals(bun) && s.grade.equals(grade) && s.cla.equals(cla);
		}else {
			return false;
		}
		
	}
	@Override
	public int hashCode() {
		return bun.hashCode() + cla.hashCode() + grade.hashCode();
	}
	
	@Override
	public String toString() {
		return grade+"-"+cla+"-"+bun+"\t"+name+"\t"+score+"\t"+rank;
	}
	
	
}
