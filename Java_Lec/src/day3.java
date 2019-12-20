import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		
	/*
	 -자바 키 입력
	 
	 	System.in
	 	: 키보드로부터 직접 읽는 자바의 표준 입력 스트림(흐름)
	 	: 키 값을 바이트(문자 아님)로 리턴
	 		Ex) 0 1 0 0 1 1
	 			바이트 단위의 데이터를 변환할 필요가 있다.
	 	
	 	Scanner Class
	 	: System.in 에게 키를 읽게하고 읽은 내용을 정수,실수,문자열 등 으로 변환하여 반환
	 		
	 		next() - 문자열로 반환
	 		nextShort() - short 타입으로 반환
	 		nextInt() - int 타입으로 반환
	 		nextFloat() - Float 타입으로 반환
	 		nextLine() - \n을 포함을 한 라인을 읽고 \n을 버린 문자열 반환
	 		hasNext() - 현재 입력된 토큰이 있으면 True 아니면 EOF false 반환
	 		
	 	
	 	
	 	
	 */
		
		//java.util.Scanner sc = new java.util.scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		/*
		String name = sc.next();
		System.out.println("이름은 "+name);
		
		String city = sc.next();
		System.out.println("도시는 "+city);
		
		int age = sc.nextInt();
		System.out.println("나이는 "+age+"살");
		
		String str = sc.nextLine();
		System.out.println("Test = "+str);
		*/
		
		sc.close(); // 자바는 굳이 안닫아도 되긴함 , 되도록이면 닫자
		
		
	
	}

}
