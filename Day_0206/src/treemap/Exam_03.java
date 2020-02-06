package treemap;

import java.util.*;

/*
[TreeMap]
-�� �� Ű�� �ڵ� ���ĵ�

Map.Entry<K , V> entry -> Ű�� ���� ������ �̾� ����


 */

public class Exam_03 {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		
		
		score.put(new Integer(87), "ȫ�浿");
		score.put(new Integer(90), "��浿");
		score.put(new Integer(45), "�̱浿");
		score.put(new Integer(75), "�ڱ浿");
		score.put(new Integer(38), "�ֱ浿");
		score.put(new Integer(95), "�ȱ浿");
		
		System.out.println(score);
		
		System.out.println(score.get(87));
		
		
		//Map.Entry�� �̿��ϸ� Ű �� ���� ������ ���� �� �ִ�.
		Map.Entry<Integer, String> entry = null;
		
		System.out.println("[���� ���� ����] ");
		entry = score.firstEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[���� ���� ����] ");
		entry = score.lastEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[85�� �Ʒ� ����] ");
		entry = score.lowerEntry(85);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[75�� �� ����] ");
		entry = score.higherEntry(75);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[85���̰ų� �ٷ� �Ʒ� ����] ");
		entry = score.floorEntry(85);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("[75���̰ų� �ٷ� �� ����] ");
		entry = score.ceilingEntry(75);
		System.out.println(entry.getKey() + " - " + entry.getValue());
		
		System.out.println("------------------------------");
		
		while(!score.isEmpty()) {
			entry = score.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + ", ���� ��ü : " + score.size());
		}
		
		
		
		
	}
}
