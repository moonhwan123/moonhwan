package API;



public class WrapperEx {

	public static void main(String[] args) {
		
		/*
		 [래퍼(Wrapper)클래스]
		 	- 8개의 기본자료형의 객체표현
		 	
		 	boolean = Boolean
		 	char = Character
		 	byte = Byte
		 	short = Short
		 	int = Integer
		 	long = Long
		 	float = Float
		 	double = Double
		 	
		 */
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ?  >> "+ (i==i2));
		System.out.println("i.equals(i2) ? >> " + (i.equals(i2)));
		System.out.println("i.compareTo ? >> " + (i.compareTo(i2)));
		System.out.println("i.toStirng() = "+i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MAX_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("Byte = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE);

	}

}
