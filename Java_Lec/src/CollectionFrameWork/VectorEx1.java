package CollectionFrameWork;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println(v);
		v.add(2, 100); // 값을 추가하면 추가한 만큼 뒤로 밀려남 (삽입)
		
		System.out.println(v); 
		
		System.out.println("사이즈 = "+v.size());
		System.out.println("용량 = "+v.capacity());
		
		for(int i = 0 ; i < v.size() ; i++) {
			int n = (int)v.get(i);
			System.out.println(n);
		}

	}

}
