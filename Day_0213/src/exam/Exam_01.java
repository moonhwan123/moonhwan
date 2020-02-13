package exam;

import java.util.*;

import view.UI;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UI ui = new UI();
		Boolean sw = true;
		
		while(true) {
			System.out.println("1 : 목록(List)");
			System.out.println("2 : 등록(Insert)");
			System.out.println("3 : 검색(Search)");
			System.out.println("4 : 수정(Update)");
			System.out.println("5 : 삭제(Delete)");
			System.out.println("6 : 종료(Exit)");
			System.out.print("[메뉴 선택] >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1: // 전체목록 화면 메소드 호출
					ui.deptView();
					break;
				case 2:
					ui.deptInsert(sc);
					break;
				case 3: // 부서번호를 입력시 해당 부서 정보만 출력
					ui.deptSearch(sc);
					break;
				case 4: // 부서번호, 부서명 , 지역명 수정
					ui.deptUpdate(sc); 
					break;
				case 5: // 부서번호를 이용한 삭제
					ui.deptDelete(sc);
					break;
				case 6: // 종료
					return;
			}
			

		}
		
		
		
		
		
		
	}
}
