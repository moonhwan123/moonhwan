package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
void add (int index, Object o)
	-index�� ��ġ�� ��� �߰�

Element get (int index)
	-index ��ġ�� �ִ� ��Ҹ� ��ȯ

int indexOf(Object O)
	-��� O �� �ִ� ��ġ�� ��ȯ
	
ListIterator listiterator()
	-ListIterator ��ü�� ��ȯ
	
Object remove(int index)
	-index ��ġ�� ��� ����
	
Object Set(int index, Object Element)
	-������ index�� ��Ҹ� element�� ����
 */

public class List_Array {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("�ʱ� ����");
		System.out.println(list);
		
		System.out.println("�ε��� 2 ��ġ�� �� ����");
		list.remove(2);
		System.out.println(list);
		
		System.out.println("�ε��� 2�� ��ġ�� �� ��ȯ");
		System.out.println(list.get(2));
		System.out.println();
		
		
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(6));
		list1.add(new Integer(62));
		list1.add(new Integer(2));
		
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		//fromindex�� ���� toindex���̿� ����� ��ü ��ȯ
		
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		list1.sort(Comparator.naturalOrder()); // ���� ����
		list1.sort(Comparator.reverseOrder()); // ���� ����
		
		System.out.println("list1.ContainAll(list2) : "+ list1.containsAll(list2));
		System.out.println();
		//contains() : ������ ��ü�� ArrayList�� ���ԵǾ� �ִ��� Ȯ��
		//containsAll() : ù ��° ����Ʈ�� �ι�° ����Ʈ�� ��� ��Ҹ� ���� �� true
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		list2.set(3, "AA"); // set() : ���ϴ� ��ġ�� ���� �ٲ�
		print(list1, list2);
		System.out.println();
		
		System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		//list2�� ������ �����ϰ�� ��� ����
		print(list1, list2);
		System.out.println();
		
		for(int i = list2.size()-1; i >= 0; i--){
			if(list1.contains((list2.get(i)))){
				list2.remove(i);
			}
		}
		//����� �������� �ڿ��� ���� �����ߵ�
		
		
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
	
}
