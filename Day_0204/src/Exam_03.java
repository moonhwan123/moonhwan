import java.util.*;
/*

 */


public class Exam_03 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(new Integer(1));
		set.add(new Integer(2));
		set.add(new Integer(3));
		set.add(new Integer(4));
		set.add(new Integer(5));
		set.add(new Integer(6));

		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}
}
