package CollectionFrameWork;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,10));
		v.add(new Point(30,-8));
		
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		v.add(1,new Point(3, 7));
		System.out.println(v);
		
		for(int i = 0 ; i < v.size() ; i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		

	}

}


class Point {
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public String toString() {
		return "("+x+","+y+")" ;
	}
}
