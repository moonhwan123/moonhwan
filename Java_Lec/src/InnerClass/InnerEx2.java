package InnerClass;

public class InnerEx2 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	//인스턴스 멤버간에는 서로 접근 가능
	InstanceInner iv = new InstanceInner();
	//static 멤버간에는 서로 직접 접근 가능
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();  --> 에러발생
		StaticInner obj2 = new StaticInner();
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();
	}
	
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
