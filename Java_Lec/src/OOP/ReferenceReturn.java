package OOP;

class DataReturn{
	int x;
}

public class ReferenceReturn {

	public static void main(String[] args) {
		//참조형 반환 타입
		//객체의 주소값 반환
		
		DataReturn d = new DataReturn();
		d.x = 10;
		
		System.out.println("d.x = "+d.x);
		
		//===================================================
		
		DataReturn d2 = copy(d);
		
		System.out.println("d2.x = "+d2.x);

	}
	
	static DataReturn copy(DataReturn d) {
		DataReturn tmp = new DataReturn();
		tmp.x = d.x;
		
		
		return tmp;
	}

}
