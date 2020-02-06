package treeset;
import java.util.*;
/*
[TreeSet의 대표적인 메서드]
set.headSet(); => ()보다 작은값
set.tailSet(); => ()보다 큰값
set.first(); => 제일 첫번째 값 (가장 작은 값)
set.last(); => 제일 마지막 값 (가장 큰 값)
set.lower(); => () 바로 아래 값
set.higher(); => () 바로 위 값
set.floor(); => () 이거나 바로 아래
set.ceiling() => () 이거나 바로 위

set.pollFirst(); => 가장 앞에 있는 값을 꺼내온후 "삭제" <-> set.pollLast();

 */

public class Exam_02 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		int[] score = {80,95,70,44,56,10,90,100,59};
		
		for(int x = 0; x < score.length; x++) {
			set.add(score[x]);
		}
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
		System.out.println("가장 작은 값 : " + set.first());
		System.out.println("가장 큰 값 : " + set.last());
		System.out.println("90점 바로 아래 : " + set.lower(90));
		System.out.println("90점 바로 위 : " + set.higher(90));
		System.out.println("90점 이거나 바로 아래 : " + set.floor(90));
		System.out.println("90점 이거나 바로 아래 : " + set.ceiling(90));
		
		// 컬렉션에서 제거
		while(!set.isEmpty()) {
			int sc = (int)set.pollFirst();
			System.out.println(sc);
			System.out.println("남은 객체 수 : " + set.size());
		}
		
		
		
	}
}
