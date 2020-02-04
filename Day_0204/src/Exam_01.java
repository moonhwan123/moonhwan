import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
List -> ArrayList , Vector , LinkedList = 순서 존재, 중복허용 (배열과 동일한 특성)

ArrayList - 동기화x , 싱글스레드 환경에서 사용
Vector - 동기화 가능해서 멀티스레드 환경에서 사용 (capacity같은 독자적인 메서드 존재)
 => 얘네 들은 삽입 삭제가 빈번할 경우 데이터를 이동시켜 줘야 하기 때문에 속도가 느리다.

LinkedList - 삽입,삭제가 빈번할 경우 LinkedList가 빠르다.

ArrayList, HashSet을 많이 사용

 */
public class Exam_01 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		List list2 = new LinkedList();
		
		list.add("123");
		list2.add("AAA");
		
		
		
		
	}
}
