import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_05 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("AAAA");
		list.add("BBBB");
		list.add("!!!!");
		list.add("DDDD");
		
		List list2 = list; // list과 list2는 같은 주소 를 쓴다.
						   // 두 값은 공유 된다.
		list2.add("FFFF");
		
		System.out.println("[확장 for문]");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("[기본 for문]");
		for(int x = 0 ; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
		
		System.out.println("[Iterator]");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
	}
}
