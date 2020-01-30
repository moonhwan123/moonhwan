import java.util.Arrays;

/*
[Ŭ���� �迭 �����ϱ�]
Comparable �������̽��� ������
compareTo()�޼��带 �������̵�

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
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("��浿");
		Member m3 = new Member("�̱浿");
		
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
