package ExceptionTest;

public class ExceptionEx3 {
	public static void main(String[] args) {
		/*
		[try 블럭 내에서 예외 발생 시]
			1.발생한 예외와 일치하는 Catch 블럭이 있는지 확인
			2.일치 하는 catch 블럭 존재시, 해당catch 블럭 내의 문장 수행
				전체 try-catch문을 빠져나가 다음 문장 실행
		[발생 하지 않을시]
			1.catch 블럭을 거치지 않고 try-catch문을 빠져나가서 수행 계속
		 */
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(0/0); // 이게 있고 없고의 차이 숙지
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			e.printStackTrace(); // 예외 발생 당시의 호출 스택에 있었던 메서드의 정보와 메시지를 화면에 출력
			System.out.println("예외 메시지 : "+e.getMessage()); // 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
		} 
		
		System.out.println(6);
	
}
}
