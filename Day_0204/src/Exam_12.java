import java.util.*;


public class Exam_12 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("���ڹ�", 100); // 100�� Integer�� ����ڽ� �Ǿ��� ������ ���� �� �ִ�.
		map.put("��ΰ�", new Integer(90)); // ���� �Ʒ��� �Ȱ���
		map.put("��Ƣ��", new Integer(86));
		map.put("�赹��", new Integer(93));
		map.put("����Ĩ", new Integer(53));
		
		// �л���� ���
		Set stuSet = map.keySet();
		
		System.out.println("�л���� : " + stuSet);
		
		// ����(��) �� �����ϴ� ���
		Collection value = map.values();
		
		System.out.println("���� : " + value);
		
		// ���� �հ� ���
		Iterator iter = value.iterator();
		int tot = 0;
		
		while(iter.hasNext()) {
			Integer a = (Integer)iter.next();
			tot += a.intValue();
		}
		System.out.println("������ �� �� : "+tot);
		
		
		
	}
}
