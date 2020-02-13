package OOP2;
/*
 접근 제어자(Access Modifier)
 	-멤버 변수 또는 클래스 사용
 	-외부로부터의 접근을 제한
 	-클래스,멤버 변수,메서드,생성자
 	
 	private - 같은 클래스 내에서만 접근
 	default - 같은 패키지 내에서만 접근 가능
 	protected - 같은 패키지 내에서만 접근 가능,다른 패키지의 자손 클래스에서만 접근 가능
 	public - 접근 제한 X
 	
 	제어자	같은 클래스		같은 패키지		자손 클래스		 전체
 	public		O			O			O		  O
 	protectd	O			O			O
 	default		O			O
 	private		O
 	
 	
 	접근 제어자 사용이유 ( 캡슐화 )
 		-외부로부터 데이터 보호
 		-외부에는 불필요,내부적으로 사용 되는 부분을 감추기 위해
 		
 	제어자의 조합
 		클래스 - public,(default),final,abstract
 		메서드 - 모든 접근제어자,final,abstract,static
 		멤버변수 - 모든 접근제어자,final,static
 		지역변수 - final
 		
 		메서드에 private와 final을 같이 사용 X
 		 	-접근제어가 private인 메서드는 오버라이딩 불가
 		 	 둘 중 하나만 충분
 */
public class TimeTest {
	public static void main(String[] args) {
		time t = new time(10,30,52);
		System.out.println(t);
		t.setHour(13);
	
		
		System.out.println(t);
		
	}
}

class time{
	private int hour;
	private int minute;
	private int second;
	
	time(int hour,int minute,int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23)return;
		
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0 || minute > 59)return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0 || second > 59)return;
		this.second = second;
	}

	@Override
	public String toString() {

		return hour + " : "+minute+" : "+second;
	}
	
	
}

































