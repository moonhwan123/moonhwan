package generics;

import java.util.*;

/*
[���׸�]
- �پ��� Ÿ���� ��ü�� �ٷ�� �޼ҵ峪 Ŭ������ 
    ������ ���� Ÿ�� üũ�� ���ִ� ���
    
    ������ ����ȯ�� ������ �ʾƵ���


    
*/


public class Exam_05 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("ȫ�浿");
		list.add(100);
		
		//genericŸ���� �Ⱦ��� �̷��� �� ��ȯ�� �������
		String name = (String)list.get(0);
		int score = (int)list.get(1);
		
		//�̷��� �ϸ� ����ȯ�� �ʿ� ������
		List<String> list2 = new ArrayList<String>();
		
		String name2 = list2.get(0);
		
		
		
	}
}
