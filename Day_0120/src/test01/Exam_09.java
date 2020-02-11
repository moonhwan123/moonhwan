package test01;

class AAAA{
	
}
class BBBB extends AAAA{
	
}


public class Exam_09 {
	
	static void test(AAAA parent) {
		if(parent instanceof BBBB) { // instanceof : 동일한 객체인지 판단하는 함수
		//  변수                              클래스	
			BBBB bb = (BBBB)parent;
			System.out.println("BBBB 변환");
		}else {
			System.out.println("BBBB 불가");
		}
	}

	public static void main(String[] args) {
		AAAA aa = new BBBB();
		test(aa);
		AAAA aaa = new AAAA();
		test(aaa);
		
		
		
		
		
	}
}
