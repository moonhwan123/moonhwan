import java.util.*;

public class Exam_11 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();
		
		//        id     pw
		map.put("java", "90");
		map.put("jsp", "99");
		map.put("servlet", "92");
		map.put("c++", "91");
		map.put("linux", "95");
		
		String id = "java";
		String pw = "90";
		
		if(map.containsKey(id)) {
			//System.out.println("�����ϴ� ���̵�");
			if(map.get(id).equals(pw)) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�������");
			}
		}else {
			System.out.println("�������� �ʴ� ���̵�");
		}
		
		
		
		
		
		
		
		
	}
}
