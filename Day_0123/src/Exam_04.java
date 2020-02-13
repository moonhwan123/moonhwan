
public class Exam_04 {

	public static void main(String[] args) {
		
		System.out.println("MAX : " + Integer.MAX_VALUE);
		System.out.println("SIZE : " + Integer.SIZE);
		
		
		int a = 25;
		
		String bin = Integer.toBinaryString(a);
		String oct = Integer.toOctalString(a);
		String hex = Integer.toHexString(a);
		System.out.println("10진수 25는 2진수로 = "+bin);
		System.out.println("10진수 25는 8진수로 = "+oct);
		System.out.println("10진수 25는 16진수로 = "+hex);
		System.out.println();
		
		System.out.println("1010 -> 10진수로 " + Integer.parseInt("1010", 2));
		System.out.println();
		
		int a1 = Integer.parseInt(bin,2);
		int a2 = Integer.parseInt(oct,8);
		int a3 = Integer.parseInt(hex,16);
		System.out.println("2진수"+bin+" -> 10진수 = " + a1);
		System.out.println("8진수"+oct+" -> 10진수 = " + a2);
		System.out.println("16진수"+hex+" -> 10진수 = " + a3);
		
	
		
		
		
		
	}
}
