package CollectionFrameWork;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println(list);
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()); // ���������� ����
		}
		
		System.out.println();
		
		ListIterator it1 = list.listIterator();
		
		while(it1.hasNext()) {
			System.out.print(it1.previous()); // ���������� ����
		}

	}

}
