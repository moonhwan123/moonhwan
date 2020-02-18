package ui;

import java.util.List;
import java.util.Scanner;

import model.StudentDAO;
import model.StudentVO;

public class StudentUI {
	StudentDAO dao = null;

	// 1번 학생정보등록
	public void StudentUiInsert(Scanner sc) {
		dao = new StudentDAO();
		System.out.println("<학생 정보 입력>");

		while (true) {
			System.out.print("학번 >> ");
			int bun = sc.nextInt();
			boolean check = dao.bunCheck(bun);
			if (check == true) {
				System.out.println("사용가능한 학번");
			} else if (check == false) {
				System.out.println("이미 등록된 학번");
				continue;
			}
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("주소 >> ");
			sc.nextLine();
			String addr = sc.nextLine();
			System.out.print("전화 >> ");
			String tel = sc.next();
			System.out.print("생년월일 >> ");
			String birth = sc.next();

			System.out.print("등록 하시겠습니까? (y/n) >> ");
			String pass = sc.next();
			if (pass.equalsIgnoreCase("y")) {
				int row = dao.StudentInsert(bun, name, addr, tel, birth);
				if (row != 0) {
					System.out.println("등록성공");
				} else {
					System.out.println("등록실패");
				}
				break;

			} else {
				continue;
			}
		}
	}// 1번 정보 입력 끝

	// 2번 학생 전체 리스트출력
	public void StudentUiList(Scanner sc) {
		dao = new StudentDAO();
		List<StudentVO> list = dao.StudentList();
		System.out.println("전체 인원 수 : " + list.size());
		if (list.size() != 0) {
			System.out.println("번호\t이름\t전화\t\t나이");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getTel() + "\t");
				System.out.print(list.get(x).getBirth() + "\t");
				System.out.println();
			}
		} else {
			System.out.println("");
		}
		sc.nextLine();
		System.out.println("엔터를 누르면 메인화면");
		if(sc.nextLine().length()==0) {
			System.out.println("");
		}else System.out.println("");
	}

	// 3_1번 학생정보 검색(이름으로)
	public void StudentUiSearchName(Scanner sc) {
		dao = new StudentDAO();
		System.out.println("[이름으로 학생 정보를 검색 합니다]");
		System.out.print("이름을 입력 하세요 >> ");
		String name = sc.next();
		boolean check = dao.nameCheck(name);
		if (check == true) {
			System.out.println("없는 학생 정보 입니다.");
		} else {
			List<StudentVO> list = dao.StudentSearchName(name);

			if (list.size() != 0) {
				System.out.println("학번\t이름\t전화\t\t생년월일");
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getBun() + "\t");
					System.out.print(list.get(x).getName() + "\t");
					System.out.print(list.get(x).getTel() + "\t");
					System.out.print(list.get(x).getBirth().substring(0, 11) + "\n");
				}
			} else {
				System.out.println("list=0");
			}
		}
	}

	// 3_2번 학생정보 검색(학번으로)
	public void StudentUiSearchBun(Scanner sc) {
		dao = new StudentDAO();
		System.out.println("[학번으로 학생 정보를 검색 합니다]");
		System.out.print("학번을 입력 하세요 >> ");
		int bun = sc.nextInt();
		boolean check = dao.bunCheck(bun);

		if (check == true) {
			System.out.println("없는 학번 입니다.");
		} else {
			List<StudentVO> list = dao.StudentSearchBun(bun);
			if (list.size() != 0) {
				System.out.println("학번\t이름\t전화\t\t생년월일");
				for (int x = 0; x < list.size(); x++) {
					System.out.print(list.get(x).getBun() + "\t");
					System.out.print(list.get(x).getName() + "\t");
					System.out.print(list.get(x).getTel() + "\t");
					System.out.print(list.get(x).getBirth().substring(0, 11) + "\n");
				}
			} else {
				System.out.println("list=0");
			}
		}
	}

	// 3_3 학년으로 정보검색
	public void StudentUiSearchHak(Scanner sc) {
		dao = new StudentDAO();
		System.out.println("[학년으로 학생 정보를 검색 합니다]");
		System.out.print("학년을 입력 하세요 >> ");
		int hak = sc.nextInt();

		List<StudentVO> list = dao.studentSearchHak(hak);
		if (list.size() != 0) {
			System.out.println("학번\t이름\t전화\t\t생년월일");
			for (int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getBun() + "\t");
				System.out.print(list.get(x).getName() + "\t");
				System.out.print(list.get(x).getTel() + "\t");
				System.out.print(list.get(x).getBirth().substring(0, 11) + "\n");
			}
		} else {
			System.out.println("list=0");
		}

	}

	// 4번 학생정보수정
	public void StudentUiUpdate(Scanner sc) {
		dao = new StudentDAO();
		System.out.println("[학생 정보 수정]");
		System.out.print("수정을 원하는 학생의 번호를 입력 하세요(0000이면 종료) >> ");
		int bun = sc.nextInt();
		if(bun == 0000) {
			System.out.println("메인으로 이동");
		}
		List<StudentVO> list = dao.StudentSearchBun2(bun);
		if (list.size() != 0) {
			for (int x = 0; x < list.size(); x++) {
				System.out.println("학번 : " + list.get(x).getBun() );

				System.out.print("이름(" + list.get(x).getName() + ") : ");
				sc.nextLine();
				String name = sc.nextLine();
				if (name.length() == 0) {
					name = list.get(x).getName();
				}
				System.out.print("주소(" + list.get(x).getAddr() + ") : ");
				String addr = sc.nextLine();
				if (addr.length() == 0) {
					addr = list.get(x).getAddr();
				}
				System.out.print("전화(" + list.get(x).getTel() + ") : ");
				String tel = sc.nextLine();
				if (tel.length() == 0) {
					tel = list.get(x).getTel();
				}
				System.out.print("생년월일(" + list.get(x).getBirth().substring(0, 10) + ") : ");
				String birth = sc.nextLine();

				System.out.print("수정 하시겠습니까? (y/n) >> ");
				String str = sc.nextLine();

				if (str.equalsIgnoreCase("y")) {
					int row = dao.studentUpate(name, addr, tel, birth, bun);
					if (row != 0) {
						System.out.println("갱신 성공");
					} else {
						System.out.println("갱신 실패");
					}
				}
			}
		} else {
			System.out.println("");
		}
	}

	// 5번
	public void studentUiDelete(Scanner sc) {
		dao = new StudentDAO();
		System.out.println("[학생 정보 삭제]");
		System.out.print("삭제를 원하는 학생의 번호를 입력 하세요(0000을 입력하면 취소합니다.) >> ");
		int bun = sc.nextInt();
		if (bun == 0000) {
			System.out.println("메인메뉴로 나갑니다.");
		}
		List<StudentVO> list = dao.StudentSearchBun2(bun);

		if (list.size() != 0) {
			for (int x = 0; x < list.size(); x++) {
				System.out.println("학번(0000입력시 취소) : " + list.get(x).getBun());
				System.out.println("이름 : " + list.get(x).getName());
				System.out.println("주소 : " + list.get(x).getAddr());
				System.out.println("전화 : " + list.get(x).getTel());
				System.out.println("생년월일 : " + list.get(x).getBirth().substring(0, 10));
				System.out.print("삭제 하시겠습니까? (y/n) >> ");
				String str = sc.next();
				System.out.println();

				if (str.equalsIgnoreCase("y")) {
					int row = dao.studentDelete(bun);

					if (row != 0) {
						System.out.println("삭제 성공");
					} else {
						System.out.println("삭제 실패");
					}
				}
			}

		} else {
			System.out.println("");
		}

	}

	// 종료
	public void exit(Scanner sc) {
		System.out.println("종료 하시겠습니까? (y/n)");
		if (sc.next().equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료 합니다.");
			System.exit(0);
		}

	}

}
