package API;

public class API_String {

	public static void main(String[] args) {
		char ch;
		int n1,n2,n3,n4,n5,n6;
		String s1,s2,s3,s4,s5;
		char charss[] = {'a','b','c','d','e','f','g','i','j'};
		char ch_arr[] = new char[40];
		byte bt_arr[] = new byte[40];
		
		System.out.println("======================charat");
		s1 = "abcdef";
		ch = s1.charAt(2);
		System.out.println("ch = "+ch);
		
		System.out.println("======================length");
		s1 = "abcdef";
		System.out.println("length = " + s1.length());
		
		System.out.println("======================concat");
		s1 = "AAA";
		s2 = s1.concat("BBB");
		s3 = s1+"CCC";
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
		System.out.println("======================substring");
		s1 = "0123456789";
		s2 = s1.substring(3);
		s3 = s1.substring(3,7); // 범위는 3 ~ (7-1) 까지
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
		System.out.println("======================indexof");
		s1 = "01ab456ab9";
		n1 = s1.indexOf('a'); // a가 2개 이지만 처음 만난 친구만 찾아줌
		n2 = s1.indexOf('a',5); // 5번 인덱스부터 검색
		n3 = s1.indexOf("ab"); // 문자열의 시작위치를 알려줌
		n4 = s1.indexOf("ab",5);
		n5 = s1.indexOf("XX"); // 찾는게 없으면 -1을 반환
		
		n6 = s1.lastIndexOf('a');
		s1 = "123.txt.ppt.jpg";
		n6 = s1.lastIndexOf('.');
		
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		System.out.println("n3 = "+n3);
		System.out.println("n4 = "+n4);
		System.out.println("n5 = "+n5);
		System.out.println("n6 = "+n6);
		

		
		System.out.println("======================equals는 문자열 실체비교, ==문자열 Address 비교");
		s1 = "dd";
		s2 = "dddd";
		s3 = s1+s1;
		sscmp(s2,s3);
		
		s1 = "TEST";
		s2 = "test";
		
		if(s1.equalsIgnoreCase(s2)) System.out.println("같다"); //IgnoreCase는 대소문자 구별 X
		else System.out.println("같지 않다");
		
		System.out.println("======================hashcode");
		s1 = "AAAAA";
		s2 = "AAAAB";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println("======================replace");
		s1 = "ABABAB";
		s2 = s1.replace('B', 'C');
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		System.out.println("======================toLowerCase, toUpperCase");
		s1 = "aBcDeF";
		s2 = s1.toLowerCase();
		s3 = s1.toUpperCase();
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
		
		System.out.println("======================toString,trim");
		s1 = "abcde";
		s2 = s1.toString();
		System.out.println("s2 = "+s2);
		
		s1 = "     ABC     ";
		s2 = s1.trim();
		System.out.println("s1,s2 = "+s1+":"+s2+":");
		
		
		System.out.println("======================startsWith, endswith");
		String url = "http://www.naver.com";
		System.out.println("url.startsWith = "+url.startsWith("http")); // "~"로 시작하는지
		System.out.println("url.endsWith = "+url.endsWith(".com")); // "~"로 끝나는지
		
		System.out.println("======================String.valueOf()");
		int year = 2019;
		System.out.println(year+year);
		System.out.println(String.valueOf(year)+String.valueOf(year)); //String.valueOf(year) => year을 문자열로 바꿔줌 
		
		
		System.out.println("======================split()");
		String tmp = "JAVA/Python/C++";
		
		String[] words = tmp.split("/");
		for(String t : words) {System.out.println(t);}
		
		s1 = tmp.split("/")[0];
		System.out.println(s1);
		
		
	}

	public static void sscmp(String a , String b) {
		System.out.println("a = "+a+"   b = "+b);
		
		//문자열 참조값 비교
		if(a == b) {System.out.println("양자의 참조는 같다.");}
		else {System.out.println("양자의 참조는 같지 않다.");}
		
		//문자열 실체를 비교한다.
		if (a.equals(b)) {System.out.println("양자의 문자열 실체는 같다.");}
		else System.out.println("양자의 문자열 실체는 같지 않다.");}
}
