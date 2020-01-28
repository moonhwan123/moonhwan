import java.util.Scanner;

class AlphaTest2{
	
	static int[] alphaArr = new int[26];
	
	
	public void alphaFre(String str) {
		for(int x = 0; x < alphaArr.length; x++) {
			char ch = str.charAt(x);
			alphaArr[ch-65]++;
		}
	}
	
	public void alphaPrint() {
		for(char x = 'A'; x <= 'Z'; x++) {
			System.out.print(x+"  ");
		}
		for(int x = 0; x < alphaArr.length; x++) {
			System.out.print(alphaArr[x]+"  ");
		}
	}
	
}

public class Exam_01_sam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AlphaTest2 alpha = new AlphaTest2();
		
		while(true) {
			System.out.print("´Ü¾î : ");
			String word = sc.next().toUpperCase();
			if(word.equalsIgnoreCase("END")) {
				break;
			}
			alpha.alphaFre(word);
		}
		alpha.alphaPrint();

	}

}
