package API_UTIL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.println(name+"��  ȯ���մϴ�.");
		
		
		
		try {
			FileInputStream fs = new FileInputStream("c:\\PT\\test.txt");
			Scanner fsc = new Scanner(fs);
			
			while(fsc.hasNext()) { // ���� �����ϸ� ��� �ݺ�
				System.out.println(fsc.nextLine());
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
