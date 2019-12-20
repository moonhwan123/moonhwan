package CollectionFrameWork;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
[���� �˻� Ʈ��]
	-��� ���� �ִ� �ΰ��� �ڽ� ��带 ���� �� �ִ�.
	-���� �ڽ� ����� ��쿡�� �θ� ��尪 ���� �۰� ������ �ڽĳ�尡 �θ𺸴� ���� ũ��.
	-����� �߰�/������ �ð��� �ɸ�
	-�˻��� ���Ŀ� ����(���� �˻�)
	-�ߺ��� �� ���� X
 */

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dsic");
		set.add("dance");
		set.add("elephant");
		set.add("fan");
		
		System.out.println(set);
		
		System.out.println("set.subSet(from, to) = "+set.subSet(from, to));

// ============================================================================		
		
		TreeSet set1 = new TreeSet();
		
		int[] score = {80,95,70,30,45,25,100};
		
		for(int i = 0; i<score.length; i++) {
			set1.add(new Integer(score[i]));
		}
		
		System.out.println("50���� ���� �� = "+ set1.headSet(new Integer(50)));
		
		
		
// �ζ� ������
// �ߺ� ���� X
		
		TreeSet lotto = new TreeSet();
		Random r = new Random();
		
		//1��
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}
		
		System.out.println("�ζ� ��ȣ 1�� : "+ lotto);
		
		
		//2��
		for(int i = 0; lotto.size() < 7; i++) {  // set.size() �� �ٽ�
			lotto.add((int)(Math.random()*50)+1); 
		} 
		
		
		System.out.println("�ζ� ��ȣ 2�� : "+ lotto);
	}

}
