package main;

import java.util.Scanner;

import ui.JoinView;

public class JoinMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JoinView view = new JoinView();
		
		while(true) {
			System.out.println("[회원 관리 프로그램 ]");
			System.out.println("[1] 회원 목록 보기");
			System.out.println("[2] 회원 정보 등록");
			System.out.println("[3] 로그인");
			System.out.println("[4] 회원 정보 검색");
			System.out.println("[5] 회원 정보 수정");
			System.out.println("[6] 회원 정보 삭제");
			System.out.println("[7] 프로그램 종료");
			
			
			System.out.print("[메뉴 선택] >> ");
			String menu = sc.next();
			System.out.println();
			
			switch(menu) {
			
				case "1":
					view.userPrint(sc);
					break;
				case "2":
					view.userInsert(sc);
					break;
				case "3":
					view.userLogin(sc);
					break;
				case "4":
					view.userSearch(sc);
					break;
				case "5":
					view.joinUpdate(sc);
					break;
				case "6":
					view.joinDelete(sc);
					break;
				case "7":
					view.joinexit(sc);
					break;
			}

		}
	
		
		
	}
}
