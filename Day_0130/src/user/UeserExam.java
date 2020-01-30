package user;
/*
[클래스 배열을 이용한 검색 기능 구현]
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class UeserExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User userArr[] = new User[10];
		int cnt = 0;
		
		
		String namePat = "\\w{1,5}";
		String idPat = "\\w{1,10}";
		String emailPat = "\\w+@\\w+.\\w+(\\.\\w+)?";
		
		//입력 
		while(cnt<10) {
			String userId;
			String name;
			String email;
			
			while(true) {
				System.out.print("회원 이름 : ");
				name = sc.nextLine();
				boolean check = Pattern.matches(namePat, name);
				if(check) {
					break;
				}else {
					System.out.println("이름 입력 오류! 다시 입력하세요 >>");
				}
			}
			
			if(name.equalsIgnoreCase("end")||name.equals("")) {
				break;
			}
			
			System.out.print("회원 ID : ");
			userId = sc.nextLine();
			
			if(cnt>=1) {
				for(int x = 0; x < cnt; x++) {
					if(userId.equals(userArr[x].userId)) {
						System.out.println("중복된 아이디 입니다. 다시 입력하세요 >> ");
						userId = sc.nextLine();
						x = 0;
					}
				}
			}
		
			while(true) {
				System.out.print("이메일 : ");
				email = sc.nextLine();
				boolean check = Pattern.matches(emailPat, email);
				if(check) {
					break;
				}else {
					System.out.println("이메일 입력 형식 오류! 다시 입력 하세요 >>");
				}
			}
			
			userArr[cnt] = new User(name,userId,email,cnt);

			cnt++;
	
		}
		
		System.out.println("고유번호\t이름\tID\t이메일");
		for(int x = 0 ; x < cnt; x++) {
			System.out.println(userArr[x]);
		}
		
		
		//검색
		UserData ud = new UserData(userArr, cnt);
		while(true) {
			System.out.print("검색할 아이디를 입력하세요 >> ");
			String userId = sc.nextLine();
			ud.idCheck(userId);
			if(userId.equalsIgnoreCase("end")) {
				break;
			}
		}
		
		
	}
}
