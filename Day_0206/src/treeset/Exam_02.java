package treeset;
import java.util.*;
/*
[TreeSet�� ��ǥ���� �޼���]
set.headSet(); => ()���� ������
set.tailSet(); => ()���� ū��
set.first(); => ���� ù��° �� (���� ���� ��)
set.last(); => ���� ������ �� (���� ū ��)
set.lower(); => () �ٷ� �Ʒ� ��
set.higher(); => () �ٷ� �� ��
set.floor(); => () �̰ų� �ٷ� �Ʒ�
set.ceiling() => () �̰ų� �ٷ� ��

set.pollFirst(); => ���� �տ� �ִ� ���� �������� "����" <-> set.pollLast();

 */

public class Exam_02 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		int[] score = {80,95,70,44,56,10,90,100,59};
		
		for(int x = 0; x < score.length; x++) {
			set.add(score[x]);
		}
		
		System.out.println("50���� ���� �� : " + set.headSet(50));
		System.out.println("50���� ū �� : " + set.tailSet(50));
		System.out.println("���� ���� �� : " + set.first());
		System.out.println("���� ū �� : " + set.last());
		System.out.println("90�� �ٷ� �Ʒ� : " + set.lower(90));
		System.out.println("90�� �ٷ� �� : " + set.higher(90));
		System.out.println("90�� �̰ų� �ٷ� �Ʒ� : " + set.floor(90));
		System.out.println("90�� �̰ų� �ٷ� �Ʒ� : " + set.ceiling(90));
		
		// �÷��ǿ��� ����
		while(!set.isEmpty()) {
			int sc = (int)set.pollFirst();
			System.out.println(sc);
			System.out.println("���� ��ü �� : " + set.size());
		}
		
		
		
	}
}
