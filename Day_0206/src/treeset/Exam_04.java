package treeset;

import java.util.*;

/*
[사용자 정의 자료형의 자동 정렬 하기]
 -> Comparable 인터페이스 구현 (디폴트가 오름 차순)
 -> Comparator 인터페이스 구현 
  = 둘중 하나 구현하기 


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
			return -1; // 비교하는 값이 크면
		}else if(age == o.age) {
			return 0; 
		}else {
			return 1; // 비교하는 값이 작으면
		}
		
	}
	
	
}

public class Exam_04 {
	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("홍길동",20));
		set.add(new Person("김길동",39));
		set.add(new Person("이길동",18));
		set.add(new Person("박길동",56));
		
		//트리셋은 들어갈때 자동정렬이 되어서 들어가는데 , 이건 비교가 할수 없어서 런타임 에러가 발생한다.
//		System.out.println(set);
		//그후 Comparable을 구현 한뒤 출력 한다.
		
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext()) {
			Person per = iter.next();
			System.out.println(per.name + " : " + per.age);
		}
		
		
		
		
	}
	
	
	
}
