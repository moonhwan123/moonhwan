package OOP;



class Rectangle{
	int x1,y1,x2,y2;
	
	public Rectangle() {
		this(0,0,0,0);
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	int square() {
		return Math.abs((x1 - x2)*(y1- y2));
	}
	
	void show() {
		System.out.printf("x1 : %d, x2 : %d, y1 : %d, y2 : %d\n",x1,x2,y1,y2);
		System.out.println("넓이 : "+square());
	}
	
	boolean equals(Rectangle r) {
		if((Math.abs(this.x1-this.x2)) == (Math.abs(r.x1-r.x2))&&(Math.abs(this.y1-this.y2)) == (Math.abs(r.y1-r.y2)))
		return true;
	return false;
	}
	
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(); //인자가 없는 객체 생성
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
		
		

	}

}
