import java.util.*;

/*
HashCode�������̵�



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
	}// �̰Ÿ� �ؼ��� �ߺ� �Ǵ��� �ȵȴ�. �׷��� �ؽ��ڵ嵵 �������̵� ������
	
	@Override
	public int hashCode() {
		return bun;
	}
	
	
	
}

public class Exam_08 {
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person(1,"ȫ�浿"));
		set.add(new Person(2,"���ڹ�"));
		set.add(new Person(1,"ȫ�浿"));
		
		System.out.println(set);
		
		
	}
}
