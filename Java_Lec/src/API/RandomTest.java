package API;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		//[Random Class]
		//난수 생성이 목표
		
		/*
		
		Random() : 현재의 시간을 종자 값으로 인스턴스 생성
		Random(long seed) : seed를 종자 값으로 하는 인스턴스 생성
		
		int nextInt() : 무작위 int값 반환
		int nextInt(int n) : 0보다 크고 n보다 작은 int값 반환
		boolean nextBoolean : 무작위의 boolean값반환
		long nextLong() : 무작위의 long값 반환
		double nextDouble() : 무작위의 double값 반환
		
		 */
		
		Random random = new Random();
		Random random1 = new Random(2);
		Random random2 = new Random(2);
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("기본 생성자 : "+random.nextInt());
		}
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("범위 지정 : "+random.nextInt(45));
		}
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("random1 : "+random1.nextInt(45));
		}
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("random2 : "+random2.nextInt(45));
		}

	}

}
