import java.util.Scanner;

import model.EmployeeDAO;
import view.SawonView;

public class SawonMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SawonView view = new SawonView();

		
		while(true) {
			System.out.println("[1] 전체 사원 목록");
			System.out.println("[2] 신규 사원 등록");
			System.out.println("[3] 사원 검색");
			System.out.println("[4] 사원 정보 수정");
			System.out.println("[5] 사원 정보 삭제");
			System.out.println("[6] 프로그램 종료");
			
			System.out.print("[메뉴 선택] >> ");
			String menu = sc.next();
			System.out.println();
			
			switch(menu) {
			
				case "1":
					sc.nextLine();
					view.sawonPrint(sc);
					break;
				case "2":
					view.sawonInsert(sc);
					break;
				case "3":
					view.sawonSearch(sc);
					break;
				case "4":
					view.sawonUpdate(sc);
					break;
				case "5":
					view.sawonDelete(sc);
					break;
				case "6":
					view.exit(sc);
					break;
			}

			
		}
		
		
		
		
	}
}
