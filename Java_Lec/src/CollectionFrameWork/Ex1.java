package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력 : ");
		
		for(int i = 0; i < 6; i ++) {
			
			String s = sc.next();
			
			char ch = s.charAt(0);
			
			if(ch >= 'A' && ch <='D' || ch =='F')
				a.add(ch);
			else {
				System.out.println("학점 아님");
				sc.close();
				return;
			}
			
			
		}
		double score = 0.0;
		for(int i = 0; i<a.size();i++) {
			char ch = a.get(i);
			
			switch (ch) {
			case 'A':
				score += 4.0;
				break;
			case 'B':
				score += 3.0;
				break;
			case 'C':
				score += 2.0;
				break;
			case 'D':
				score += 1.0;
				break;
			case 'F':
				score += 0.0;
				break;
			}
		}
		System.out.print(score/a.size());
		sc.close();
	}
}
















