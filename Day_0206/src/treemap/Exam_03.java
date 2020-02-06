package treemap;

import java.util.*;

/*
[TreeMap]
-들어갈 때 키가 자동 정렬됨

Map.Entry<K , V> entry -> 키와 값을 쌍으로 뽑아 오기


 */

public class Exam_03 {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		
		
		score.put(new Integer(87), "홍길동");
		score.put(new Integer(90), "김길동");
		score.put(new Integer(45), "이길동");
		score.put(new Integer(75), "박길동");
		score.put(new Integer(38), "최길동");
		score.put(new Integer(95), "안길동");
		
		System.out.println(score);
		
		System.out.println(score.get(87));
		
		
		//Map.Entry를 이용하면 키 와 값을 쌍으로 뽑을 수 있다.
		Map.Entry<Integer, String> entry = null;
		
		System.out.println("[가장 낮은 점수] ");
		entry = score.firstEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[가장 높은 점수] ");
		entry = score.lastEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[85점 아래 점수] ");
		entry = score.lowerEntry(85);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[75점 위 점수] ");
		entry = score.higherEntry(75);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[85점이거나 바로 아래 점수] ");
		entry = score.floorEntry(85);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[75점이거나 바로 위 점수] ");
		entry = score.ceilingEntry(75);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("------------------------------");
		
		while(!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + ", 남은 객체 : " + score.size());
		}
		
		
		
		
	}
}
