package CollectionFrameWork;

import java.util.Date;
import java.util.Vector;

public class GenericTest2 {
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		
		printArray1(intArray);
		
		Character[] charArray= {'A','B','C','D','E'};
		
		printArray1(charArray);
		
		Vector list = new Vector();
		list.add("hello");
		list.add(100);
		list.add(new Date());
		
		System.out.println(list);
		
		
	}
	//타입에 상관없이 무조건 Object타입으로 받음. 자원낭비 및 처리량 증가
	private static void printArray1(Object[] intArray) {
		for(Object element : intArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	
	}
	
	//제네릭 메소드 : of <> 오브타입, <T> 제네릭 메소드라는 것을 표시
	
	private static <T> void printArray(T[] intArray) {
		for(T element : intArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
}
