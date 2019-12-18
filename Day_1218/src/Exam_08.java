/*
[논리연산자(&&,||)]
[비트논리연산자(&,|)]
 */

public class Exam_08 {
	
	public static void main(String[] args) {
		
		System.out.println("7>8 && 7<9 = " + (7>8 && 7<9));
		System.out.println("7>8 & 7<9 = " + (7>8 & 7<9)); // 비트연산자도 논리연산자 처럼 사용가능
		// 하지만 위(&&)의 경우 7>8 , 7<9 중에서 7>8이 false이니까 뒤는 계산 하지 않는다.
		// 아래(&)의 경우 7>8 , 7<9 둘다 판단한뒤 false가 나오므로 
		// 위의 두가지는 결과는 동일 하지만 흐름에 차이점이 있음
		
		//System.out.println("7&&8 = " + (7&&8)); // 7이 true 인지 false인지 모르니까 오류
		System.out.println("7&8 = " + (7&8));     // 이진수로 바꿔서 연산됨
		
	}

}
