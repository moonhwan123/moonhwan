import java.util.*;

/*
HashTable - 동기화 가능
HashMap - 동기화 불가
 */


public class Exam_10 {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(0, "AAA");
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(1, "DDD"); // key값은 중복이 안됨
		System.out.println(map); //자료구조라서 참조변수를 적어도 값이 출력됨 -> toString()이 오버라이딩 되어있어서
		
		String s = (String)map.get(1);
		System.out.println("map.get(1) = "+s);
		
		Set set = map.keySet();
		System.out.println(set);
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Integer x = (Integer)iter.next();
			System.out.println("key : "+x+", value : "+map.get(x));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
