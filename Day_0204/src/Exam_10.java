import java.util.*;

/*
HashTable - ����ȭ ����
HashMap - ����ȭ �Ұ�
 */


public class Exam_10 {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(0, "AAA");
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(1, "DDD"); // key���� �ߺ��� �ȵ�
		System.out.println(map); //�ڷᱸ���� ���������� ��� ���� ��µ� -> toString()�� �������̵� �Ǿ��־
		
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
