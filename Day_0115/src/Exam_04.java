/*
기본 자료형과 레퍼런스형의 차이점
 */
class Data{
	int x;
	int y;
}

public class Exam_04 {
	
	static void swap(int a , int b) {
		int c = a;
		a = b;
		b = c;
	}
	static void swapD(Data a) {
		int aa = a.x;
		a.x = a.y;
		a.y = aa;
	}
	static void swapA(int[] dd) {
		int aa = dd[0];
		dd[0] = dd[1];		
		dd[1] = aa;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+a+"\tb = "+b);
		swap(a,b);//call by value 
		System.out.println("a = "+a+"\tb = "+b);
		
		System.out.println("=====================");
		Data d = new Data();
		d.x = 10;
		d.y = 20;
		System.out.println("x = "+d.x+"\ty = "+d.y);
		swapD(d);
		System.out.println("x = "+d.x+"\ty = "+d.y);
		System.out.println("=====================");
		int s[] = {10,20};
		System.out.println("s[0] = "+s[0]+"\ts[1] = "+s[1]);
		swapA(s);
		System.out.println("s[0] = "+s[0]+"\ts[1] = "+s[1]);
		
	}
}





