package main;

import java.util.Scanner;

import ui.ReUI;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ReUI ui = new ReUI();
		
		while(true) {
			System.out.println("[도서대출 관리 프로그램]");
			System.out.println("[1] 도서 대출 예약 등록");
			System.out.println("[2] 도서 대출 현황 조회");
			System.out.println("[3] 도서 대출 예약 수정");
			System.out.println("[4] 도서 대출 반납 등록");
			System.out.println("[5] 종료 ");
			
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
					ui.uiList(sc);
					break;
				case "4":
					ui.uiReturn(sc);
					break;
				case "5":
					return;
			}

		}//while끝
		
		
	}//main끝
}
