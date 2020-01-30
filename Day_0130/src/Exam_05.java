import java.util.Properties;

/*
[환경변수 수집]

Properties property = System.getProperties();
property.list(System.out);

System.getProperty();





*/
public class Exam_05 {
	public static void main(String[] args) {
		
		//properties list 출력하기
		Properties property = System.getProperties();
		property.list(System.out);
		System.out.println("----------------------------------");
		
		//
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈 디렉토리 이름 : " + userHome);
		
		
	}
}
