package OOP;

import java.util.Scanner;

public class method {
	

	
	static void printArr(int[] numArr) {
		for(int i=0; i<10; i++) {
			System.out.printf("%d \n",numArr[i]);
		}
	}
	
	static int add(int a, int b) {
		
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		/*
		-메서드
		 	: 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
		 	
		 -장점
		 	1. 높은 재사용성
		 		: 한번 만들면 몇 번이고 호출 가능, 및 다른 프로그램에서도 사용가능
		 	2. 중복된 코드의 제거
		 		: 같은 내용의 반복되는 문장을 묶어서 하나의 메서드로 작성
		 	3. 프로그램의 구조화(모듈화)
		 		: 프로그램의 기능별 단위를 묶을 수 있다.
		 		
		 -메서드의 선언과 구현
		 	: 반환타입 메서드의이름(타입 변수명,타입 변수명,....매개변수) //선언부
		 	  {
		 	  	//메서드 호출 시 수행될 코드
		 	  	return 0;                                    //구현부
		 	  }
		 	
		 -메서드 이름
		 	: 변수의 명명규칙과 동일
		 	: 의미있는 이름으로 만들어라
		 
		 -반환 타입
		 	: 메서드의 작업수행 결과물을 반환하는 형태(ex : 정수 int)
		 	: 반환 값이 없는 경우 void
		 	
		 -매개변수
		 	: 메서드를 호출하면서 넘겨주는 값
		 	: 메서드 내에서만 사용 가능
		 	
		 -반환 값
		 	: 필요 없으면 생략 가능(컴파일러가 자동추가)
		 	: 메서드의 실행 결과를 호출한 메서드로 반환 시 사용
		 	: 반환타입과 일치 또는 자동형변환 가능한 것
		 	: 메서드당 하나만 가능
		 	
		 -메서드 호출
		 	: 메서드는 정의만으로는 사용이 불가능
		 	: 호출 시에는 메서드에 정의된 매개변수의 수와 보내는 인자의 갯수가 일치 해야 함
		 	
		 
		 */

		
		int[] numArr = new int[10];
		
		for(int i=0; i<10; i++) {
			numArr[i] = (int)(Math.random()*10);
		}

		printArr(numArr);
		System.out.println();
		
		
		
		int result = add(1,2);
		System.out.println(result);
		System.out.println(add(3,5));
		
		
		
		//3개의 숫자를 입력받아서 크기가 큰 순서대로 출력하는 프로그램.
		

		
		
		
		
		//숫자2개와 사칙연산자를 입력받아서 동작하는 간단한 계산기 프로그램
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//1개의 숫자를 입력 받아서 구구단 출력하는 프로그램
		
		
		
	}

}
