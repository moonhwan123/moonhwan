package lotto;

import java.util.*;

/*
[Set�� �̿��� �ζ� ��ȣ �����] 
 */

public class SetLotto_01 {
	public static void main(String[] args) {

		Set set = new HashSet();
		
		// for�� �̿�
		for(int x = 0; set.size() < 6; x++) {
			int lotto = (int)(Math.random()*45+1);
			set.add(lotto);
		}
		
		// while�� �̿� (Double WrapperŬ���� ���)
		while(set.size()<6) {
			Double d = Math.random()*45+1;
			set.add(d.intValue());
		}
		
		// 1�� ���
		System.out.println(set);
		
		// ���� �� ���
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}
}
