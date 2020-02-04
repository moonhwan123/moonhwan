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
			//System.out.println("존재하는 아이디");
			if(map.get(id).equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비번오류");
			}
		}else {
			System.out.println("존재하지 않는 아이디");
		}
		
		
		
		
		
		
		
		
	}
}
