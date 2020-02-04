import java.util.*;

/*
[Set�� ����ϴ� �������� �����]
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("123");
		set.add("AAAA");
		set.add("CCCC");
		
		// 1) 'Ȯ�� for��'�� �̿��� ���
		for(String str : set) {
			System.out.println(str);
		}
		
		// 2) Iterator�� ��ȯ�Ͽ� ���ϴ� �� ���� 
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("AAAA")) {
				iter.remove();
			}
		}
		
		for(String str : set) {
			System.out.println(str);
		}
		
		
		
	}
}
