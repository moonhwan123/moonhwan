import java.util.List;
import java.util.Vector;

public class Exam_04 {
	public static void main(String[] args) {
		
		List list = new Vector();
//		list.capacity();  호출 불가 capacity는 Vector의 메서드이기 때문이다.
		
		Vector vc = new Vector();
		vc.capacity();
		System.out.println(vc.size()); // 실제 저장된 오브젝트 갯수
		System.out.println(vc.capacity()); // 확보된 공간(기본크기는 10 이지만 , StringBuffer처럼 자동으로 변동됨)
		
		System.out.println("=================");
		
		vc.add("AAAA");
		vc.add(0, "BBBB"); // 삽입되면 원래있던 놈들은 뒤로 삭제 되는게 아니라, "밀린다."
		vc.add("DDDD");
		//그래서 삽입삭제가 빈번히 일어나면 그만큼 속도가 느려짐 (속도저하의 요인)
		//그런 상황에서는 LinkedList를 사용한다.
		
		for(int x = 0 ; x < vc.size(); x++) {
			System.out.println(vc.get(x));
		}
		
		
		
	}
}
