package treeset;

import java.util.*;

/*
[����� ���� �ڷ����� �ڵ� ���� �ϱ�]
 -> Comparable �������̽� ���� (����Ʈ�� ���� ����)
 -> Comparator �������̽� ���� 
  = ���� �ϳ� �����ϱ� 


 */

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age < o.age) {
			return -1; // ���ϴ� ���� ũ��
		}else if(age == o.age) {
			return 0; 
		}else {
			return 1; // ���ϴ� ���� ������
		}
		
	}
	
	
}

public class Exam_04 {
	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("ȫ�浿",20));
		set.add(new Person("��浿",39));
		set.add(new Person("�̱浿",18));
		set.add(new Person("�ڱ浿",56));
		
		//Ʈ������ ���� �ڵ������� �Ǿ ���µ� , �̰� �񱳰� �Ҽ� ��� ��Ÿ�� ������ �߻��Ѵ�.
//		System.out.println(set);
		//���� Comparable�� ���� �ѵ� ��� �Ѵ�.
		
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext()) {
			Person per = iter.next();
			System.out.println(per.name + " : " + per.age);
		}
		
		
		
		
	}
	
	
	
}
