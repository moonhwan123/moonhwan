package customer;

import java.util.Scanner;

import customer.view.View;

public class CustMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		View view = new View();
		
		while(true) {
			System.out.println("[1] 고객 전체 목록");
			System.out.println("[2] 신규 고객 등록");
			System.out.println("[3] 고객 검색");
			System.out.println("[4] 고객 정보 수정");
			System.out.println("[5] 고객 정보 삭제");
			System.out.println("[6] 프로그램 종료");
			System.out.print("[메뉴 선택] >> ");
			int menu = sc.nextInt();
			System.out.println();
			
			switch(menu) {
				case 1: // 전체목록 화면 메소드 호출
					view.customView();
					break;
				case 2:
					view.customInsert(sc);
					break;
				case 3: // 부서번호를 입력시 해당 부서 정보만 출력
					view.customSearch(sc);
					break;
				case 4: // 부서번호, 부서명 , 지역명 수정
					view.customUpdate(sc); 
					break;
				case 5: // 부서번호를 이용한 삭제
					view.customDelete(sc);
					break;
				case 6: // 종료
					view.exit(sc);
					break;
			}
			

		}
		
		
		
		
	}
}
