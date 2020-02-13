package API_UTIL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println(name+"님  환영합니다.");
		
		
		
		try {
			FileInputStream fs = new FileInputStream("c:\\PT\\test.txt");
			Scanner fsc = new Scanner(fs);
			
			while(fsc.hasNext()) { // 값이 존재하면 계속 반복
				System.out.println(fsc.nextLine());
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
