
public class Exam_04 {

	public static void main(String[] args) {
		
		System.out.println("MAX : " + Integer.MAX_VALUE);
		System.out.println("SIZE : " + Integer.SIZE);
		
		
		int a = 25;
		
		String bin = Integer.toBinaryString(a);
		String oct = Integer.toOctalString(a);
		String hex = Integer.toHexString(a);
		System.out.println("10���� 25�� 2������ = "+bin);
		System.out.println("10���� 25�� 8������ = "+oct);
		System.out.println("10���� 25�� 16������ = "+hex);
		System.out.println();
		
		System.out.println("1010 -> 10������ " + Integer.parseInt("1010", 2));
		System.out.println();
		
		int a1 = Integer.parseInt(bin,2);
		int a2 = Integer.parseInt(oct,8);
		int a3 = Integer.parseInt(hex,16);
		System.out.println("2����"+bin+" -> 10���� = " + a1);
		System.out.println("8����"+oct+" -> 10���� = " + a2);
		System.out.println("16����"+hex+" -> 10���� = " + a3);
		
	
		
		
		
		
	}
}
