package API;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This is");
		
		sb.append(" test ");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb1 == sb2? " + (sb1==sb2));
		System.out.println("sb.equals ? " + sb1.equals(sb2));
		
		//StringBuffer의 내용을 String으로 변환
		String s = sb1.toString();
		String s2 = sb2.toString();
		System.out.println("s.equals ? " + s.equals(s2));
		
		sb.insert(8, "StringBuffer ");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setCharAt(0, '!');
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setLength(20);
		System.out.println(sb);
		
		sb.replace(0, 8, "abcdef ");
		System.out.println(sb);
		
	}

}
