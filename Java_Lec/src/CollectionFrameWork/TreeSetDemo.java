package CollectionFrameWork;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
[이진 검색 트리]
	-모든 노드는 최대 두개의 자식 노드를 가질 수 있다.
	-왼쪽 자식 노드의 경우에는 부모 노드값 보다 작고 오른쪽 자식노드가 부모보다 값이 크다.
	-노드의 추가/삭제에 시간이 걸림
	-검색과 정렬에 유리(범위 검색)
	-중복된 값 저장 X
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
		
		System.out.println("50보다 작은 값 = "+ set1.headSet(new Integer(50)));
		
		
		
// 로또 생성기
// 중복 숫자 X
		
		TreeSet lotto = new TreeSet();
		Random r = new Random();
		
		//1번
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}
		
		System.out.println("로또 번호 1번 : "+ lotto);
		
		
		//2번
		for(int i = 0; lotto.size() < 7; i++) {  // set.size() 가 핵심
			lotto.add((int)(Math.random()*50)+1); 
		} 
		
		
		System.out.println("로또 번호 2번 : "+ lotto);
	}

}
