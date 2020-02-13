package OOP2;

/*
Singleton - 생성자의 접근제어자
	-일반적으로 생성자의 접근제어자는 클래스의 접근제어자와 일치
	-생성자에 접근제어자를 사용하므로써 인스턴스의 생성을 제한 가능
 */
final class singletone{
	
	private static singletone s = new singletone();
	
	private singletone() {
		
	}
	public static singletone getInstance() {
		if(s==null) {
			s = new singletone();
		}
		return s;
		
	}
	
}
public class singleton {

	public static void main(String[] args) {
//		singletone = new singletone();   -> 여기서는 바로 생성불가
		
		singletone s = singletone.getInstance();

	}

}
