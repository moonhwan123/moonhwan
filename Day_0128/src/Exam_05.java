import java.util.StringTokenizer;

/*
[StringTokenizer Ŭ����]
hasMoreTokens() : ��ū�� ���� �ϴ��� �����.
nextToken() : ��ū�� �ҷ��´�.
countTokens() : ��ū�� ����
 */

public class Exam_05 {
	public static void main(String[] args) {
		
		String str = "010-1111.2222"; // �� ��Ȳ���� split�� �ȵ�
		String str2[] = str.split("-");
		
//		for(int x = 0; x < str2.length; x++) {
//			System.out.print(str2[x]+" ");
//		}
		
		StringTokenizer st = new StringTokenizer(str,"-."); // -���ε� �и������ϰ� .���ε� �и��� ����
		System.out.println("��ū �� : "+st.countTokens());
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		
		
	}
}
