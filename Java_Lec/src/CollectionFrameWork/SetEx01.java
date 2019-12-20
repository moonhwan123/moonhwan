package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("demon");
		hs.add("banana");
		hs.add("demon");
		hs.add("demon");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(" "+it.next());
		}
		System.out.println();
		
// ===============================================================
		
		TreeSet ts = new TreeSet();
		
		ts.add("demon");
		ts.add("banana");
		hs.add("demon");
		hs.add("demon");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		Iterator it2 = ts.iterator();
		
		while(it2.hasNext()) {
			System.out.println(" "+it2.next());
		}

	}

}





