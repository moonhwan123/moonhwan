package API;

import java.util.Scanner;

class Dictionary{
	
	private static String [] kor = {"사랑","아기","돈","미래","희망"};
	private static String [] eng = {"love","baby","money","future","hope"};
	
	
	public static String kor2Eng(String word) {
		
		for(int i = 0; i < kor.length; i++) {
			
			
			
		}
		
		
		return word;
	}
	
	
	
	
}

public class StringPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dictionary dic = new Dictionary();
		System.out.println("한영 단어 검색 프로그램 입니다.");
		
		while(true) {
			System.out.print("한글 단어?");
			String kor_input = sc.nextLine();
			dic.kor2Eng(kor_input);
		}
		
		


	}

}
