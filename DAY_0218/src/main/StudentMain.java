package main;

import java.util.Scanner;

import ui.StudentUI;

public class StudentMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentUI ui = new StudentUI();
		boolean sw=false;
		
		while(true) {
			System.out.println("[학생 정보 관리 프로그램 ]");
			System.out.println("[1] 학생 정보 관리");
			System.out.println("[2] 성적 정보 관리");
			System.out.println("[3] 장학금 관리");
			System.out.println("[4] 프로그램 종료");
			
			System.out.print("[메뉴 선택] >> ");
			String menu = sc.next();
			System.out.println();
			
			switch(menu) {
			
				case "1":
					while(true) {
						sw = false;
						System.out.println("[학생 정보 관리 ]");
						System.out.println("[1] 학생 정보 입력");
						System.out.println("[2] 학생 정보 조회");
						System.out.println("[3] 학생 정보 검색");
						System.out.println("[4] 학생 정보 변경");
						System.out.println("[5] 학생 정보 삭제");
						System.out.println("[6] 첫 화면 으로");
						
						System.out.print("[메뉴 선택] >> ");
						String menu2 = sc.next();
						System.out.println();
						
						
						switch(menu2) {
							case "1":
								ui.StudentUiInsert(sc);
								break;
							case "2":
								ui.StudentUiList(sc);
								break;
							case "3":
								while(true) {
									System.out.println("[학생정보를 검색합니다.]");
									System.out.println("1.이름으로 검색");
									System.out.println("2.학번으로 검색");
									System.out.println("3.학년으로 검색");
									System.out.println("4.검색 취소");
									System.out.print("선택 >> ");
									String str = sc.next();
									
									if(str.equals("1")) {
										ui.StudentUiSearchName(sc);
									}else if(str.equals("2")){
										ui.StudentUiSearchBun(sc);
									}else if(str.equals("3")) {
										ui.StudentUiSearchHak(sc);
									}else if(str.equals("4")) {
										break;
									}else {
										System.out.println("잘못된 번호");
									}
									
									
								}
								break;
							case "4":
								ui.StudentUiUpdate(sc);
								break;
							case "5":
								ui.studentUiDelete(sc);
								break;
							case "6":
								sw = true;
								break;
						
						}
						if(sw == true) break;
						
						
					}
					
				case "2":
					
					break;
				case "3":
			
					break;
				case "4":
					ui.exit(sc);
					break;

			}

		}
		
		
		
	}
	
}
