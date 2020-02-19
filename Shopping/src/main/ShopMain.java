package main;

import java.util.Scanner;

import ui.ShopUI;


public class ShopMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ShopUI ui = new ShopUI();
		
		while(true) {
			System.out.println("[쇼핑몰 회원 관리 프로그램]");
			System.out.println("[1] 회원정보 등록");
			System.out.println("[2] 회원정보 현황 조회");
			System.out.println("[3] 회원정보 수정");
			System.out.println("[4] 회원정보 삭제");
			System.out.println("[5] 종료");
			
			System.out.print("[메뉴 선택] >> ");
			String menu = sc.next();
			System.out.println();
			
			switch(menu) {
				case "1":
					ui.uiInsert(sc);
					break;
				case "2":
					ui.uiList(sc);
					break;
				case "3":
					ui.uiUpdate(sc);
					break;
				case "4":
					ui.uiDelete(sc);
					break;
				case "5":
					return;
			}

		}//while끝
		
		
		
	}
	

}
