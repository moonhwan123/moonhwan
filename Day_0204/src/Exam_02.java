import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
[Set �������̽�] : ������ ����, �ߺ��� �Ұ�

- ������ Ŭ���� : HashSet


 */


public class Exam_02 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("TomCat");
		set.add("Java"); // Java�� �ΰ� ���� �ϳ��ۿ� ��� �ȵ�
		set.add("Python");
		
		System.out.println(set);
		System.out.println(set.size()); // �ߺ��ϳ��� ���� �Ǿ 6�̾ƴ� 5�� ������.
		
		
		List list = new ArrayList();
		
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("TomCat");
		list.add("Java");
		list.add("Python");
		
		System.out.println(list);
		
		
		
		
		
	}
}
