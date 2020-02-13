import java.util.*;


public class Exam_12 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("김자반", 100); // 100은 Integer로 오토박싱 되었기 때문에 넣을 수 있다.
		map.put("김부각", new Integer(90)); // 위나 아래나 똑같음
		map.put("김튀각", new Integer(86));
		map.put("김돌김", new Integer(93));
		map.put("감자칩", new Integer(53));
		
		// 학생명단 출력
		Set stuSet = map.keySet();
		
		System.out.println("학생명단 : " + stuSet);
		
		// 점수(값) 만 추출하는 경우
		Collection value = map.values();
		
		System.out.println("점수 : " + value);
		
		// 점수 합계 계산
		Iterator iter = value.iterator();
		int tot = 0;
		
		while(iter.hasNext()) {
			Integer a = (Integer)iter.next();
			tot += a.intValue();
		}
		System.out.println("점수의 총 합 : "+tot);
		
		
		
	}
}
