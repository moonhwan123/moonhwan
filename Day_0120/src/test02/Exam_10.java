package test02;

/*
[추상 클래스] - 미완성 설계도
abstract 키워드 사용
new 사용 불가(객체 생성 불가)

추상메서드가 1개라도 있으면 무조건 추상클래스가 되어야됨

팀 프로젝트시 팀장이 추상클래스를 만들면 무조건 그 클래스를 상속 받아야되는데
추상 메소드를 강제적으로 오버라이딩 해야됨
공통된 멤버,메소드를 통일성 있게 사용하는것이 목적


 */
abstract class AA{
	int x = 100;
	void test() {
		System.out.println("x = " + x);
	}
 	abstract int sum(int x, int y); // 추상메서드 , 공통된 기능을 주는것
	
}

class BB extends AA{
	@Override
	int sum(int x, int y) {
		
		return x+y;
	}
}





public class Exam_10 {
	public static void main(String[] args) {
		
		AA a = new BB();
		a.sum(1, 500);
		
		
		
	}
}

