import java.util.ArrayList;

/*
[Collection Framework - �ڹ��� �ڷᱸ��]

Collection �������̽��� ����� �������̽� (List,Set) , Map

List (������ �ְ�, �ߺ� ���) - ������ �����Ƿ� �ε����� ����
	-> ArrayList, Vector, LinkedList 
	-> ArrayList�� "����ȭ ����x" , Vector�� "����ȭ ����o"
	
Set (������ ����, �ߺ� �Ұ�) - ������ �����Ƿ� �ε����� ���� �Ұ�
	
Map (Ű<k>, ��<v>�� ������ ���� / ������ �ְ�, Ű�� �ߺ� �Ұ�)

	
 */

public class Exam_01 {
	public static void main(String[] args) {
		
	
		ArrayList list = new ArrayList(); // ����Ʈ ������
		
		ArrayList list2 = new ArrayList(10); // ũ�� ����
		
		System.out.println("list Empty : " + list.isEmpty());
		System.out.println("list size : " + list.size());
		
		list.add("123");
		list.add(123);
		list.add(3.14);
		list.add('A'); // ������ �� ���� ����
		
		System.out.println("list Empty : " + list.isEmpty());
		System.out.println("list size : " + list.size());
		
//		String s = list.get(0); -> ������Ʈ�� ��Ʈ���� ����ȵ�
		String s = (String)list.get(0); // -> �׷��� �̷��� ����ȯ�� ���� �����
		int a = (int)list.get(1);
		
		System.out.println("list[0] : " + list.get(0)); // ����� ���� ��������
		
		
		
		
		
		
	}
}
