package example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static void index(List list,int num) {
		List<Integer> arr = new ArrayList<Integer>();
		for(int x = 0 ; x < list.size() ; x++) {
			if(list.get(x).equals(num)) {
				arr.add(x);
			}
		}
		System.out.println(num+"�� �ε����� " + arr + "�Դϴ�.");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 		
		Scanner sc = new Scanner(System.in);
		
		list.add(89);
		list.add(84);
		list.add(90);
		list.add(77);
		list.add(95);
		list.add(90);
		list.add(65);
		list.add(100);
		list.add(90);
		list.add(84);
		
		System.out.println(list);

		System.out.print("ã�� ���� �� >> ");
		int num = sc.nextInt();
		
		index(list,num);
		
		
		
		
		
	}

}
