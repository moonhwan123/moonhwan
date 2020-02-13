package member;

import java.util.ArrayList;
import java.util.Scanner;

/*
[키보드 입력]
아이디, 이름 , 나이 입력 Member 객체를 생성

-입력 중 아이디가 'end'이면 전체 출력 후 종료
-ArrayList 이용
-아이디가 같은 경우 "중복된 아이디 입니다." 출력 후 재입력 받아라

[다음과 같이 출력]
아이디       이름       나이
uesr01  aaa   29
 */
public class MemberExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> memList = new ArrayList<Member>();
		Member m;
		
		while(true) {
			System.out.print("아이디, 이름 ,나이 순으로 입력 하세요 >> ");
			String str = sc.nextLine();
			String[] strArr = str.split(",");
			
			if(strArr[0].equalsIgnoreCase("end")) break;
			
			m = new Member(strArr[0],strArr[1],Integer.parseInt(strArr[2]));
			
			if(memList.contains(m)) {
				System.out.println("중복된 아이디 입니다.");
			}else {
				memList.add(m);
			}
			
		}
		
		System.out.println("아이디\t이름\t나이");
//		for(int x = 0 ; x < memList.size() ; x++) {
//			System.out.print(memList.get(x));
//		}
//		for(Member mem : memList) {
//			System.out.print(mem.userId + " \t");
//			System.out.print(mem.name + " \t");
//			System.out.print(mem.age + " \n");
//		}
		
		MemberData md = new MemberData(memList);
//		new MemberData(memList);
		
		
	}

		
	}

