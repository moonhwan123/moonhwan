package CollectionFrameWork;

import java.util.Scanner;
import java.util.Vector;

public class VectorTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.print("����(-1)�� �Է� �ɶ� ���� >> ");
		
		while (true) {
			int num = sc.nextInt();
			v.add(num);
			if (num == -1) {
				break;
			}
		}
		
		printBig(v);
		
		
//		v.sort(null);
//		System.out.println("���� ū���� "+v.get(v.size()-1));
		
		

		
	}
	
	public static void printBig(Vector<Integer> v) {
		
		int big = v.get(0);
		
		for (int i = 1; i<v.size();i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println(big);
	}
	
	

}
