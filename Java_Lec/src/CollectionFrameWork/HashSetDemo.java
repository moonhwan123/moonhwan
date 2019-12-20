package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(40);
		
		Iterator it  = set.iterator();
		
		while(it.hasNext()) {
			Integer integer = (Integer)it.next();
			System.out.print(integer+"\t");
			
		}
		
		System.out.println();
		
		
		
		Set treeSet = new TreeSet(set);
		
		System.out.println(treeSet);
		
		
		
		
	}

}
