package treeset;

import java.util.*;

/*
�߰�) �迭�� ���� ���� ���� ������
          ����Ʈ(�÷���)�� "��ü"�� ���� (�ּҰ� ����)
	

[�˻������ ��ȭ�� �÷���]
TresSet 

 */
public class Exam_01 {
	public static void main(String[] args) {
		
//		Set set = new HashSet();
//		set.add(10); // ������ 10 �� �ƴ϶� ����ڽ� �Ǿ Integer��ü�� �����
//		set.add(new Integer(10)); // �׷��� ���������� �̷��� �ؾߵ�
		
		TreeSet set = new TreeSet();
		
		for(int x = 0; set.size() < 6 ; x++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		// TresSet�� �ڵ� ���� �Ǿ ��µ�
		
		
		Set set2 = new HashSet();
		
		for(int x = 0; set2.size() < 6 ; x++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		System.out.println(set2);
		
		
	}
}
