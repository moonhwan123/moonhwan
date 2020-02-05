import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
[Map�� ���� ���� �� �̸� �Է� �� ���� ����ϱ� ����]
�Ʒ��� ���� args����(Map)�� �̸��� ���̰� ����Ǿ� �ִ�.
(�̸��� 'Ű' �̹Ƿ� ���� �̸��� ���ٰ� �����Ѵ�.)
args['Alice'] = 23, args['Paul'] = 25 
args['Peter'] = 19, args['Karen'] = 40
args['Andy'] = 25, args['Cindy'] = 30
args['David'] = 19, args['Sally'] = 28
args['Tom'] = 22, args['Sue'] = 32
args['Bob'] = 31

�̸� ����ؼ� �Ʒ��� ���� ���� ����� ���� ���α׷��� �ۼ�
Enter name : Peter
Peter is 19 years old
�� Ű�� �Է¹޾� Ű�� �ش��ϴ� ���̸� ã�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Alice", 23);map.put("Paul", 25);
		map.put("Peter", 19);map.put("Karen", 40);
		map.put("Andy", 25);map.put("Cindy", 30);
		map.put("David", 19);map.put("Sally", 28);
		map.put("Tom", 22);map.put("Sue", 32);map.put("Bob", 31);
		
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		
		if(map.containsKey(name)) {
			int a = map.get(name);
			System.out.print(name+" is ");
			System.out.print(a+" years old");
		}else {
			System.out.println("No exist name");
		}
		
		
		
		
	}
}
