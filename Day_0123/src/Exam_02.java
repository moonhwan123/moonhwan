/*
[String Class]
-> 정적인 문자의 처리
[StringBuffer/Builder] 
-> 별도의 가상메모리를 쓰는게 아니라 버퍼에서 문자를 변환시키거나 함
-> 동적인 문자열의 처리 
-> 멀티스레드를 지원하는가 (버퍼는 멀티스레드환경에서 동기화(동시사용x,싸울일이 없음)지원, 빌더는 안됨)

 */

public class Exam_02 {
	public static void main(String[] args) {
		
		String str = "aaaaa";
		String str2 = new String("aaaaa");
		
		StringBuffer sb = new StringBuffer(); // 반드시 new 사용 해야함, 괄호안은 버퍼의 사이즈 기본 16자 정도 잡힘		
		StringBuffer sb2 = new StringBuffer(20); // 근데 지정해줘도 지가 알아서 늘어났다 그런다. 보통 16씩 커짐
		
		System.out.println("sb공간크기 = " + sb.capacity()); //공간의 크기
		System.out.println("sb글자수 = " + sb.length()); //실제 저장된 데이터
		

		sb.append("AAAA"); //append를 이용해서 추가한다.
		sb.append("BBBBBBBB");
		sb.append("CCCCCCCCCC"); // 뒤에 쭉 추가해줌
		
		
		System.out.println(sb);
		System.out.println("sb공간크기 = " + sb.capacity()); //공간의 크기 
		System.out.println("sb글자수 = " + sb.length()); //실제 저장된 데이터
		
		
		
		
	}
}
