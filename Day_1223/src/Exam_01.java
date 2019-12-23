/*
[배열 처리]
동일한 이름을 가진 기억장소의 이름(아파트)

배열명(이름), 인덱스(첨자)  ==> a[1] 


**기본 변수형과 배열의 차이점을 숙지해라**

 */


public class Exam_01 {
	
	public static void main(String[] args) {
		
		//배열 선언
		int a; // a이라는 변수를 선언 (얘는 이 순간 바로 메모리를 할당한다/4byte)
		//System.out.println(a); // 오류, 값이 "초기화"가 되어있지 않으므로
		a=10; // 변수에는 '값'이 저장
		
		int var[]; // var배열을 선언만 한것 (공간만 할당한 것,'주소'값이 저장 , 참조형, )
		//System.out.println(var[0]); // 얘도 선언만하고 할당은 안했으므로 "초기화"가 안되 있으므로 '오류' 
		var = new int[10]; // 할당 -> 실제 메모리 구성
	 
	 // var => 배열의 첫 번째 요소의 '주소'를가리킴
	 // var[number] => 얘는 변수와 동일 '값'이 저장
		
		System.out.println("var = " + var); // 주소값
		System.out.println("var[0] = " + var[0]); // 요소의 값 , 할당시 값이 "자동으로 초기화"됨 (그 자료형의 기본값으로)
		
		// 선언과 할당을 동시에 한 구조
		int val[] = new int[10];
		
		
		
		
		
		
		
		
		
		
	} 

}
