package API;

import java.util.Scanner;

public class WordReplace {

	
	
	public static void main(String[] args) {
		
		System.out.println(">>");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(text);
		
		System.out.print("��� : ");
		String cmd = sc.nextLine();
		
		while(true) {
		if(cmd.equals("�׸�")) {
			System.out.println("���� �մϴ�.");
			break;
			}
		
		
		
		String[] tokens = cmd.split("!");
		if(tokens.length != 2) {
			System.out.println("�߸��� ��ɾ� �Դϴ�.");
		}
		
		else {
			if(tokens[0].length() == 0 || tokens[1].length() == 0) {
				System.out.println("�߸��� ��ɾ� �Դϴ�.");
				continue;
			}
		
		int index = sb.indexOf(tokens[0]);
		
		if(index == -1) {
			System.out.println("ã�� �� �����ϴ�.");
			continue;
		}
		
		sb.replace(index, index+tokens[0].length(), tokens[1]);
		System.out.println(sb.toString());
		}
		}
		

	}

}


