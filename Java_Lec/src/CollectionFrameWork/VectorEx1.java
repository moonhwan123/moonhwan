package CollectionFrameWork;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println(v);
		v.add(2, 100); // ���� �߰��ϸ� �߰��� ��ŭ �ڷ� �з��� (����)
		
		System.out.println(v); 
		
		System.out.println("������ = "+v.size());
		System.out.println("�뷮 = "+v.capacity());
		
		for(int i = 0 ; i < v.size() ; i++) {
			int n = (int)v.get(i);
			System.out.println(n);
		}

	}

}
