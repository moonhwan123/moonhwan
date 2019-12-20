package API;

public class wrapper_unboxing {

	public static void main(String[] args) {
		
		int i = 10;
		Integer wi = new Integer(i);
		
		int i1 = wi.intValue();
		
		
		Double wd = new Double(3.14);
		double d = wd.doubleValue();
		
		Boolean wb = new Boolean(true);
		boolean b1 = wb.booleanValue();

	}

}
