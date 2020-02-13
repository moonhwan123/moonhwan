import java.util.ArrayList;
import java.util.List;

class AA{
	int b;
	String n;
	AA(){}
	AA(int b, String n){
		this.b = b;
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "번호 : " + b + "\t" + ", 이름 : " + n + "\n";
	}
	
}
public class Exam_03 {
	public static void main(String[] args) {
		
		List<AA> list = new ArrayList<AA>();
		
		list.add(new AA(1,"AAA")); // 바로 객체도 저장 할 수 있다.
		list.add(new AA(2,"BBB"));
		list.add(new AA(3,"CCC"));
		list.add(new AA(4,"DDD"));
		
		//배열과 달리 크기를 미리 알 필요가 없다.
		
		for(int x = 0 ; x < list.size(); x++) {
			System.out.print(list.get(x));
		}
		
		for(int x = 0 ; x < list.size(); x++) {
			AA a = list.get(x);
			System.out.println(a.b);
		}
		
		
		
		
	}
}
