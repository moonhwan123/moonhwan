package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.JoinDAO;
import vo.JoinVO;

public class JoinView {
	JoinDAO dao = null;

	// 1번 회원 출력
	public void userPrint(Scanner sc) {
		dao = new JoinDAO();
		List<JoinVO> list = dao.userPrint();
		System.out.println("[전체 유저 정보를 출력 합니다]");
		System.out.println("전체 인원 수 : " + list.size());
		System.out.println("아이디\t\t이름\t\t이메일\t\t\t등록일자");

		if (list.size() != 0) {
			for (int x = 0; x < list.size(); x++) {
				if (list.get(x).getUserid().length() >= 7) {
					System.out.print(list.get(x).getUserid() + "\t");
				} else {
					System.out.print(list.get(x).getUserid() + "\t\t");
				}

				System.out.print(list.get(x).getName() + "\t\t");
				if (list.get(x).getEmail().length() >= 17) {
					System.out.print(list.get(x).getEmail() + "\t");
				} else {
					System.out.print(list.get(x).getEmail() + "\t\t");
				}
				System.out.print(list.get(x).getRegdate().substring(0, 11) + "\n");
			}
		} else {
			System.out.println("등록된 회원 정보가 없습니다.");
		}
	}// 1번 끝
		// 2번 회원 등록

	public void userInsert(Scanner sc) {
		dao = new JoinDAO();
		System.out.println("[신규 회원을 등록 합니다]");

		while (true) {
			System.out.print("ID : ");
			String userid = sc.next();
			boolean check = dao.idCheck(userid);
			if (check == true) {
				System.out.println("아이디 사용 가능");

			} else {
				System.out.println("중복된 아이디존재");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("비밀번호 : ");
			String passwd = sc.next();

			System.out.println("이메일 : ");
			String email = sc.next();

			System.out.print("나이 : ");
			int age = sc.nextInt();

			System.out.print("등록 하시겠습니까? (y/n) >> ");
			String pass = sc.next();
			if (pass.equalsIgnoreCase("y")) {
				int row = dao.userInsert(userid, name, passwd, email, age);

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

	}// 2번끝

	// 3번 로그인
	public void userLogin(Scanner sc) {
		dao = new JoinDAO();
		int cnt = 0;

		while (true) {
			System.out.println("[로그인 합니다.]");
			System.out.print("ID : ");
			String userid = sc.next();
			System.out.print("PW : ");
			String passwd = sc.next();

			JoinVO vo = dao.joinLogin(userid);

			boolean ss = dao.idCheck(userid); // ID 중복 체크

			if (ss) { // if가 트루이면 아이디X
				System.out.println("없는 아이디 입니다.");
				System.out.print("계속  하시려면 (y) 그만 하시려면 (n) >> ");
				if (sc.next().equalsIgnoreCase("y")) {
					continue;
				} else if (sc.next().equalsIgnoreCase("n")) {
					break;
				}
			} else {
				if (vo.getUserid().equalsIgnoreCase(userid)) {
					if (vo.getPasswd().equalsIgnoreCase(passwd)) {
						System.out.println("로그인 성공!");
						break;
					} else {
						System.out.println("비밀번호가 옳지 않습니다.");
					}
				}
			}

			cnt++;
			if (cnt == 3) {
				System.out.println("** 비밀번호 오류 3회 초과 **");
				System.out.println("** 메인으로 이동 합니다 **");
				break;
			}

		}
	}

	// 4번 검색
	public void userSearch(Scanner sc) {
		dao = new JoinDAO();

		while (true) {

			System.out.println("[회원 정보를 검색 합니다.]");
			System.out.println("아이디로 검색하실 경우 = 1");
			System.out.println("이름으로 검색하실 경우 = 2");
			System.out.print("입력 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("아이디를 입력 하세요 >> ");
				String userid = sc.next();

				List<JoinVO> list = dao.joinSearchId(userid);
				try {
					if (list.size() != 0) {
						for (int x = 0; x < list.size(); x++) {
							System.out.println("아이디 : " + list.get(x).getUserid());
							System.out.println("이름 : " + list.get(x).getName());
							System.out.println("이메일 : " + list.get(x).getEmail());
							System.out.println("나이 : " + list.get(x).getAge());
							System.out.println("등록일자 : " + list.get(x).getRegdate().substring(0, 11));

						}
					} else {
						System.out.println("없는 아이디");
					}
				} catch (Exception e) {
					System.out.println("없는 아이디");
				}
				System.out.println("계속 검색 할까요 ? (y/n)");
				if (sc.next().equalsIgnoreCase("y")) {

					continue;
				} else {
					break;
				}

			} else if (choice == 2) {
				System.out.print("이름를 입력 하세요 >> ");
				String name = sc.next();
				List<JoinVO> list = dao.joinSearchName(name);
				try {
					if (list.size() != 0) {
						for (int x = 0; x < list.size(); x++) {
							System.out.println("아이디 : " + list.get(x).getUserid());
							System.out.println("이름 : " + list.get(x).getName());
							System.out.println("이메일 : " + list.get(x).getEmail());
							System.out.println("나이 : " + list.get(x).getAge());
							System.out.println("등록일자 : " + list.get(x).getRegdate().substring(0, 11));

						}
					} else {
						System.out.println("없는 이름");
					}
				} catch (Exception e) {
					System.out.println("없는 이름");
				}
				System.out.println("계속 검색 할까요 ? (y/n)");
				if (sc.next().equalsIgnoreCase("y")) {

					continue;
				} else {
					break;
				}

			} else {
				System.out.println("잘못된 번호");
				continue;
			}
		}

	}

	// 5번 갱신
	public void joinUpdate(Scanner sc) {
		dao = new JoinDAO();

		while (true) {
			System.out.print("갱신할 아이디를 입력 하세요 >> ");
			String userid = sc.next();
			List<JoinVO> list = dao.updatePrint(userid);

			if (list.size() != 0) {
				for (int x = 0; x < list.size(); x++) {
					System.out.println("아이디 (" + list.get(x).getUserid() + ") - 아이디는 수정 불가");
					System.out.print("이름 (" + list.get(x).getName() + ") >> ");
					sc.nextLine();
					String name = sc.nextLine();
					if (name.length() == 0) {
						name = list.get(x).getName();
					}

					System.out.print("비밀번호 (");
					for (int a = 0; a < list.get(x).getPasswd().length(); a++) {
						System.out.print("*");
					}
					System.out.print(") >> ");
					String passwd = sc.nextLine();
					if (passwd.length() == 0) {
						passwd = list.get(x).getPasswd();
					}
					System.out.print("이메일 (" + list.get(x).getEmail() + ") >> ");
					String email = sc.nextLine();
					if (email.length() == 0) {
						email = list.get(x).getPasswd();
					}
					System.out.print("나이 (" + list.get(x).getAge() + ") >> ");
					String age2 = sc.nextLine();
					int age;
					if (age2.length() == 0) {
						age = list.get(x).getAge();
					} else {
						age = Integer.parseInt(age2);
					}

					int row = dao.joinUpdate(userid, name, passwd, email, age);
					if (row != 0) {
						System.out.println("갱신 성공");

					} else {
						System.out.println("갱신 실패");
					}

				}
				break;
			} else {
				System.out.println("없는 아이디");
				System.out.println("다시 검색 하시겠습니까?(y/n)");
				String c = sc.next();
				if (c.equalsIgnoreCase("y")) {
					continue;
				} else {
					break;
				}
			}
		}

	}

	// 6번 삭제
	public void joinDelete(Scanner sc) {
		dao = new JoinDAO();
		System.out.println("[회원 정보를 삭제 합니다]");
		System.out.print("삭제할 아이디를 입력 해주세요 >> ");
		String userid = sc.next();
		List<JoinVO> list = dao.joinDeleteSearch(userid);

		if (list.size() != 0) {
			for (int x = 0; x < list.size(); x++) {
				System.out.println("이름 : " + list.get(x).getName());
				System.out.println("이메일 : " + list.get(x).getEmail());
			}

		} else {
			System.out.println("없는 아이디 입니다.");
		}
		System.out.print("삭제 하겠습니까? (y/n) >> ");
		String c = sc.next();
		if (c.equalsIgnoreCase("y")) {
			int row = dao.joinDelete(userid);
			if (row != 0) {
				System.out.println("삭제 성공");
				System.out.println("메인으로 이동합니다.");
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("삭제 하지 않습니다.");
			System.out.println("메인으로 이동합니다.");
		}

	}

	// 종료
	public void joinexit(Scanner sc) {
		System.out.println("종료 하시겠습니까? (y/n)");
		if (sc.next().equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료 합니다.");
			System.exit(0);
		}

	}

}
