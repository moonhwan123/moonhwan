import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam_06 {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		
		str.add("���ڹ�");
		str.add("ȫ�浿");
		str.add("Java");
		str.add("1234");
		str.add("Korea");
		
		System.out.println("===���� ��===");
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println("===���� ��===");
		Collections.sort(str);
		for(String s : str) {
			System.out.println(s);
		}
		
		//�ٵ� ���⼭ ����� ���� Ŭ������ ������ �Ұ� �ϴ�
		
		
		
	}
}
