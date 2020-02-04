import java.util.*;

class Student{
	int bun;
	String name;
	
	Student(){}
	Student(int bun, String name){
		this.bun = bun;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return bun + "\t" + name + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return bun == s.bun && s.name.equals(name);
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return bun + name.hashCode();
	}
	
}


public class Exam_13 {
	public static void main(String[] args) {
		
		
		//Student��ü�� value�� �������
		Map<String , Student> stuMap = new HashMap<String, Student>();
		
		stuMap.put("A", new Student(1,"aaa"));
		stuMap.put("B", new Student(2,"bbb"));
		stuMap.put("C", new Student(1,"aaa"));
	
		System.out.println(stuMap.size());
		
		//Student��ü�� key������ ����
		Map<Student , Integer> stuMap2 = new HashMap<Student, Integer>();
		
		stuMap2.put(new Student(1,"AAA"), new Integer(100));
		stuMap2.put(new Student(2,"BBB"), new Integer(95));
		stuMap2.put(new Student(3,"DDD"), new Integer(85));
		stuMap2.put(new Student(1,"AAA"), new Integer(70));
		
		System.out.println(stuMap2.size());
		
		
		
	}
}
