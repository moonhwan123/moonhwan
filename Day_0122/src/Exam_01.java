/*
[String "클래스"]
	-장점  
	 : "문자열" 상수를 가상머신 전체에서 공유 (똑같은 문자열이있으면 안만듬)
	 : 문자열은 불변


메소드영역 : 클래스 , static 변수
힙 : 객체
스택 : 변수

 */

class AA{
	
}

public class Exam_01 {

	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "123"; // 기존에 123이 만들어 져 있기 때문에 새로 만들지 않고 기존 123을 가리킨다. (똑같은 문자열이있으면 안만듬)
		String str3 = new String("123"); // new를 사용할 경우 새로 만들어 버린다.
//		String str4 =""; //null하고 ""는 다름
//		String str5 = new String();
//		str = str+"000"; // 기존의 123 이 없어지는게 아니고(불변) 새로운 123000이 생긴다. (새로운 주소를 가리킴)
		
		
		
		
//		AA a = new AA();
//		System.out.println("a = "+a);
//		System.out.println("str = "+str); // String클래스는 toString()이 오버라이딩 되어 있다.
//		System.out.println("str4 = "+str4);
//		System.out.println("str5 = "+str5); 
		
		
		//비교 (==) : 기본형
		//equals() 
		
		System.out.println("str1 == str2 : " + (str1 == str2)); // 같은 주소인지 판별
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		System.out.println("str1.equals(str3) : " + (str1.equals(str3))); // 같은 객체인지 판별
		
		
		
	}
}
