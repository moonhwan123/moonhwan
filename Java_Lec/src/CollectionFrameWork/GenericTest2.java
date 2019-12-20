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
	//Ÿ�Կ� ������� ������ ObjectŸ������ ����. �ڿ����� �� ó���� ����
	private static void printArray1(Object[] intArray) {
		for(Object element : intArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	
	}
	
	//���׸� �޼ҵ� : of <> ����Ÿ��, <T> ���׸� �޼ҵ��� ���� ǥ��
	
	private static <T> void printArray(T[] intArray) {
		for(T element : intArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
}
