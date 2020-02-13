package InnerClass;

class Outer{
	class InstanceInner{
		int iv = 100;
		
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
		
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스 먼저 생성
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv : "+ii.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : "+si.iv);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
