package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
void add (int index, Object o)
	-index의 위치에 요소 추가

Element get (int index)
	-index 위치에 있는 요소를 반환

int indexOf(Object O)
	-요소 O 가 있는 위치를 반환
	
ListIterator listiterator()
	-ListIterator 객체를 반환
	
Object remove(int index)
	-index 위치의 요소 삭제
	
Object Set(int index, Object Element)
	-지정한 index의 요소를 element로 변경
 */

public class List_Array {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("초기 상태");
		System.out.println(list);
		
		System.out.println("인덱스 2 위치의 값 제거");
		list.remove(2);
		System.out.println(list);
		
		System.out.println("인덱스 2번 위치의 값 반환");
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
		//fromindex롤 부터 toindex사이에 저장된 객체 반환
		
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		list1.sort(Comparator.naturalOrder()); // 오름 차순
		list1.sort(Comparator.reverseOrder()); // 내림 차순
		
		System.out.println("list1.ContainAll(list2) : "+ list1.containsAll(list2));
		System.out.println();
		//contains() : 지정된 객체가 ArrayList에 포함되어 있는지 확인
		//containsAll() : 첫 번째 리스트가 두번째 리스트의 모든 요소를 포함 시 true
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		list2.set(3, "AA"); // set() : 원하는 위치의 값을 바꿈
		print(list1, list2);
		System.out.println();
		
		System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		//list2와 공통요소 제외하고는 모두 삭제
		print(list1, list2);
		System.out.println();
		
		for(int i = list2.size()-1; i >= 0; i--){
			if(list1.contains((list2.get(i)))){
				list2.remove(i);
			}
		}
		//지우고 싶을때는 뒤에서 부터 지워야됨
		
		
		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
	
}
