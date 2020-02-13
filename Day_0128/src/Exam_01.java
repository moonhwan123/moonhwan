import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
키보드로 영문 단어를 입력
영문자의 빈도수를 출력(대소문자 구분없음)

[입력 예시]
단어 : Apple
단어 : Seoul
.....
단어 : end (또는 END) --> 종료

[출력 예시]
A  B  C  D  . . . . Z
0  2  1  0  . . . . 1

 */


class AlphaTest{
	static int[][] cntArr = new int[2][26];
	String alpha;
	
	
	AlphaTest(){}
	AlphaTest(String alpha){
		this.alpha = alpha;
		
	    for(int i = 0 ; i<this.alpha.length(); i++) {
	         int a = this.alpha.charAt(i)-97;
	         cntArr[1][a]++;
	    }
		for(char x = 0; x < cntArr[1].length; x++) {
			cntArr[0][x] = (char)(x+97);
		}
		
	}
	
	void print() {
		for(char x = 'a'; x <= 'z'; x++) {
			System.out.print(x+"  ");
		}
		System.out.println();
		for(int i = 0 ; i<cntArr[0].length; i++) {
	         System.out.print(cntArr[1][i]+"  ");
	    }
		System.out.println();
	}
	
	void sort() {
		for(int x = 0; x < cntArr[0].length-1; x++) {
			for(int y = x+1; y < cntArr[0].length; y++) {
				if(cntArr[1][x] < cntArr[1][y]) {
					int temp = cntArr[1][x];
					cntArr[1][x] = cntArr[1][y];
					cntArr[1][y] = temp;
					temp = cntArr[0][x];
					cntArr[0][x] = cntArr[0][y];
					cntArr[0][y] = temp;
					
				}
			}
		}
		System.out.println("[가장 많이 사용된 알파벳]");
		System.out.print((char)cntArr[0][0]);
	}
	
	
	
}

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AlphaTest al = null;
		
		while(true) {
			 System.out.print("단어 : ");
			 String alpha = sc.next();
			 alpha = alpha.toLowerCase();
			 if(alpha.equals("end")) {
				 break;
			 }
			 al = new AlphaTest(alpha);
		}
		
		al.print();
		al.sort();

	}
}

