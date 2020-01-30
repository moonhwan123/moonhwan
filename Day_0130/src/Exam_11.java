import java.util.Arrays;

/*
[Arrays클래스를 이용한 2진검색]
 */

public class Exam_11 {
	public static void main(String[] args) {
		
		int var[] = {80,90,77,88,56,60,24};
		String name[] = {"홍길동","김길동","이길동","박길동"};
		
		Arrays.sort(var);
		System.out.println(Arrays.toString(var));
		int index = Arrays.binarySearch(var, 90);
		System.out.println("90의 위치 "+index);
		
		System.out.println("--------------------------");
		Member m1 = new Member("홍길동");
		Member m2 = new Member("김길동");
		Member m3 = new Member("이길동");
		Member[] memArr = {m1,m2,m3};
		
		Arrays.sort(memArr);
		int index2 = Arrays.binarySearch(memArr, m3);
		System.out.println(m3.name+"은  "+index2+"번째");
		
		
	}
}
