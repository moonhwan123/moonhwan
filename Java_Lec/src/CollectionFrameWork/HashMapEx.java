package CollectionFrameWork;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		hm.put("apple","���");
		hm.put("paper","����");
		hm.put("flower", "��");
		
		String voca;
		
		System.out.print("�˰� ���� �ܾ �Է� : ");
		voca = sc.nextLine();
		
		if(hm.containsKey(voca)) {
			System.out.println("�ش��ϴ� ���� : "+hm.get(voca));
		}
		else
			System.out.println("�ش� �ܾ�� �����ϴ�.");
		
	}
}
