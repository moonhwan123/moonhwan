package studnet.util;


/*
private : 해당 클래스에서 만 사용 가능(외부의 접근 x)

default : 접근 제어자가 생략이 되면 자동으로 디폴트임,쓰는거 아님 -> "같은 패키지" 안에서는 얼마든지 사용 가능

protected : 같은 패키지 + 패키지가 달라도 상속 관계일때는 사용가능

public : 제한 없음(다른 패키지일 경우 import하면 된다.)

제일 많이 쓰는 거는 private or public
일반적으로 클래스에는 public을 쓰긴한다.

 */

public class Sample {
	private int a = 10;
	void test() {
		int s = a+20; // a변수의 사용에 제한이 없음 같은 클래스 안에 있기 때문에
	}
}


class BB{
	Sample sam = new Sample();
	void test() {
//		sam.a = 20;
		sam.test();
	}
}