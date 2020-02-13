import java.util.*;

/*
HashCode오버라이딩



 */

class Person{
	int bun; 
	String name;
	Person(){}
	Person(int b , String n){
		bun = b;
		name = n;
	}
	
	@Override
	public String toString() {
		
		return bun + "\t" + name ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)(obj);
			return bun == p.bun;
		}else {
			return false;
		}
	}// 이거만 해서는 중복 판단이 안된다. 그래서 해쉬코드도 오버라이딩 해주자
	
	@Override
	public int hashCode() {
		return bun;
	}
	
	
	
}

public class Exam_08 {
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person(1,"홍길동"));
		set.add(new Person(2,"김자반"));
		set.add(new Person(1,"홍길동"));
		
		System.out.println(set);
		
		
	}
}
