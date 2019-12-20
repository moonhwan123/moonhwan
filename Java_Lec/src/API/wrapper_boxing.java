package API;

public class wrapper_boxing {

	public static void main(String[] args) {
		
		
		int i =10 ;
		Integer wi = new Integer(i); // Boxing
		
		String str = "10";
		Integer wi2 = new Integer(str); // String -> Integer
		
		double d = 3.14;
		Double wd = new Double(d);
		
		int i1 = 10;
		Integer wi1 = Integer.valueOf(i1); //Boxing
		
		double d1 = 3.14;
		Double wd1 = Double.valueOf(d1);
		
		boolean b1= true;
		Boolean wb = Boolean.valueOf(b1);
		
		

	}

}
