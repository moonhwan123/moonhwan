import java.util.Arrays;

/*
[클래스 배열 정렬하기]
Comparable 인터페이스를 구현후
compareTo()메서드를 오버라이딩

 */

class Member implements Comparable<Member>{
	String name;
	Member(){}
	Member(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Member m) {
		return name.compareTo(m.name);
	}
	
	
}
public class Exam_10 {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("김길동");
		Member m3 = new Member("이길동");
		
		Member[] memArr = {m1,m2,m3};
		
		for(int x = 0; x< memArr.length; x++) {
			System.out.print(memArr[x].name+"\t");
		}
		System.out.println();
		
		Arrays.parallelSort(memArr);
		for(int x = 0; x< memArr.length; x++) {
			System.out.print(memArr[x].name+"\t");
		}
		
		
		
		
	}
}

