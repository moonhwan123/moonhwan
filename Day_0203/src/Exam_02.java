import java.util.List;
import java.util.ArrayList;

/*
set , indexOf , contains , get , size , add 
List�߿��� ���� ���� ���� �޼����
 */

public class Exam_02 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("ȫ�浿");
//		list.add(1234);  String �����̶� ������ �ȵ�
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Program");
		
		String str = list.get(0); // <String>���� ���־��� ������ �����ϴ�.
		
		for(int x = 0; x< list.size(); x++) {
			System.out.println(list.get(x));
		}
//		System.out.println(list);
		
		boolean bool = list.contains("C++");
		System.out.println("list�� C++�� ���� �ϰ� �ִ°� >> "+bool);
		
		int index = list.indexOf("C++");
		System.out.println("C++�� �ε��� �� >> "+index);
		
		list.set(0, "��浿");
		System.out.println("list.set(0, \"��浿\") >> "+list.get(0));
		
		
		//set , indexOf , contains , get , size , add 
		//���� ���� ���� �޼����
		
		
	}
}
