import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 [Set����]
 [Ű���� �Է�] (���̵�,�̸�,����)
 - �̸��� 'end' ����
 - ������ ID �ΰ�� "���̵� �ߺ�" ��� �� ���Է�
 - set�� �̿�����
 
 [���]
 ���̵�          �̸�            ���� 
 xxx     xxx      xx
 */


class Member{
	String id;
	String name;
	int age;
	
	Member(){}
	Member(String id, String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.id.contentEquals(m.id);
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + age;
	}
	
}


public class Exam_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Member> perSet = new HashSet<Member>();
		Member mem;
		
		while(true) {
			System.out.print("�Է� (���̵�,�̸�,����) >> ");
			String str = sc.nextLine();
			String strArr[] = str.split(",");
			
			if(strArr[0].equalsIgnoreCase("end")) {
				break;
			}
			
			mem = new Member(strArr[0],strArr[1],Integer.parseInt(strArr[2]));
			
			boolean flag = perSet.add(mem);
			//add�޼ҵ��� ���ϰ��� boolean�̱� ������ �̷� ����� ���� �ϴ�.
			
			//contains�� �ᵵ ������ �̷� ����� ���� �Ѵ�.
			if(!flag) {
				System.out.println("�ߺ��� ���̵� �Դϴ�. �ٽ� �Է� �ϼ���");
			}
			
		}//while End
		
		System.out.println("���̵�\t�̸�\t����");
		for(Member m : perSet) {
			System.out.println(m);
		}
		
		
		
	}//Main End
}
