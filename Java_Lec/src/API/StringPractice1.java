package API;

import java.util.Scanner;

class Dictionary{
	
	private static String [] kor = {"���","�Ʊ�","��","�̷�","���"};
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
		System.out.println("�ѿ� �ܾ� �˻� ���α׷� �Դϴ�.");
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String kor_input = sc.nextLine();
			dic.kor2Eng(kor_input);
		}
		
		


	}

}
