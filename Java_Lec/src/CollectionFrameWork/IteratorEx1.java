package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

/*
[Iterator]
	-컬렉션에 저장된 요소들을 읽어오는 방법의 표준화
	-저장된 각 요소에 접근하는 기능을 가진 Iterator인터페이스 정의
	-Collection 인터페이스에는 Iterator를 반환하는 iterator()을 정의
	-Collection에 정의된 메서드 이므로 List와 Set에도 포함
 */

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
//			System.out.println(it.next());
			System.out.println(obj);
		}

	}

}
