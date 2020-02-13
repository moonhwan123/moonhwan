import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 [Set예제]
 [키보드 입력] (아이디,이름,나이)
 - 이름이 'end' 종료
 - 동일한 ID 인경우 "아이디 중복" 출력 후 재입력
 - set을 이용하자
 
 [출력]
 아이디          이름            나이 
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
			System.out.print("입력 (아이디,이름,나이) >> ");
			String str = sc.nextLine();
			String strArr[] = str.split(",");
			
			if(strArr[0].equalsIgnoreCase("end")) {
				break;
			}
			
			mem = new Member(strArr[0],strArr[1],Integer.parseInt(strArr[2]));
			
			boolean flag = perSet.add(mem);
			//add메소드의 리턴값은 boolean이기 때문에 이런 방법도 가능 하다.
			
			//contains를 써도 되지만 이런 방법도 존재 한다.
			if(!flag) {
				System.out.println("중복된 아이디 입니다. 다시 입력 하세요");
			}
			
		}//while End
		
		System.out.println("아이디\t이름\t나이");
		for(Member m : perSet) {
			System.out.println(m);
		}
		
		
		
	}//Main End
}
