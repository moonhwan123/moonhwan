import java.util.Properties;

/*
[ȯ�溯�� ����]

Properties property = System.getProperties();
property.list(System.out);

System.getProperty();





*/
public class Exam_05 {
	public static void main(String[] args) {
		
		//properties list ����ϱ�
		Properties property = System.getProperties();
		property.list(System.out);
		System.out.println("----------------------------------");
		
		//
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� �̸� : " + osName);
		System.out.println("����� �̸� : " + userName);
		System.out.println("����� Ȩ ���丮 �̸� : " + userHome);
		
		
	}
}
