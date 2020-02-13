import java.util.StringTokenizer;

/*
[StringTokenizer 클래스]
hasMoreTokens() : 토큰이 존재 하는지 물어본다.
nextToken() : 토큰을 불러온다.
countTokens() : 토큰의 갯수
 */

public class Exam_05 {
	public static void main(String[] args) {
		
		String str = "010-1111.2222"; // 이 상황에선 split이 안됨
		String str2[] = str.split("-");
		
//		for(int x = 0; x < str2.length; x++) {
//			System.out.print(str2[x]+" ");
//		}
		
		StringTokenizer st = new StringTokenizer(str,"-."); // -으로도 분리가능하고 .으로도 분리가 가능
//		System.out.println("토큰 수 : "+st.countTokens());
//		
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
	}
}
