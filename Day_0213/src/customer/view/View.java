package customer.view;

import java.util.List;
import java.util.Scanner;

import customer.model.CustomDAO;
import customer.model.CustomVO;


public class View {
	CustomDAO dao = null;
	
	//1번 전체 출력
	public void customView() {
		dao = new CustomDAO();
		System.out.println("[전체 고객정보를 출력 합니다]");
		System.out.println("고객번호\t이름\t연락처\t\t직장명\t생년월일\t\t성별\t등록일자");
		List<CustomVO> list = dao.customView();
		
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getNum()+"\t");
				System.out.print(list.get(x).getName()+"\t");
				System.out.print(list.get(x).getTel()+"\t");
				System.out.print(list.get(x).getOffice()+"\t");
				System.out.print(list.get(x).getBirthday()+"\t");
				System.out.print(list.get(x).getSex()+"\t");
				System.out.print(list.get(x).getIndate()+"\n");
			}
		}else {
			System.out.println("no");
		}
		System.out.println();
	}
	
	
	//2번 등록
	public void customInsert(Scanner sc) {
		dao = new CustomDAO();
		
		System.out.println("[신규 고객 정보 등록를 등록합니다]");
		while(true) {
			System.out.print("고객번호 : ");
			int num = sc.nextInt();
			System.out.print("고객명 : ");
			String name = sc.next();
			System.out.print("연락처 : ");
			String tel = sc.next();
			sc.nextLine();
			System.out.print("주소 : ");
			String addr = sc.nextLine();
			System.out.print("직장명 : ");
			String office = sc.next();
			System.out.print("생년월일(yy/mm/dd) : ");
			String birthday = sc.next();
			System.out.print("성별(M/F) : ");
			String sex = sc.next();

			System.out.print("등록 하시겠습니까? (y/n) >> ");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("y")) {
				int row = dao.customInsert(num, name, tel, addr, office, birthday, sex);
				
				if(row != 0) {
					System.out.println("등록 완료");
				}else {
					System.out.println("등록 실패");
				}
				
				break;
			}else {
				continue;
			}
		
		}
		System.out.println();
		
	}
	
	
	//3번 검색
	public void customSearch(Scanner sc) {
		dao = new CustomDAO();
		System.out.println("[이름으로 고객정보를 검색합니다]");
		System.out.print("검색을 원하는 고객님의 이름을 적어 주세요 >> ");
		String name = sc.next();
		
		List<CustomVO> list = dao.customSearch(name);
		try {
			if(list.size()!=0) {
				for(int x = 0; x < list.size(); x++) {
					System.out.println();
					System.out.println("고객명 : "+list.get(x).getName()+"\t");
					System.out.println("연락처 : "+list.get(x).getTel()+"\t");
					System.out.println("주소 : "+list.get(x).getAddr()+"\t");
					System.out.println("직장명 : "+list.get(x).getOffice()+"\t");
					System.out.println("생일 : "+list.get(x).getBirthday()+"\t");
					System.out.println("성별 : "+list.get(x).getSex()+"\t");
					System.out.println("등록일자 : "+list.get(x).getIndate());
					System.out.println();
				}
			}else {
				System.out.println("등록된 고객이 없습니다.");
			}
		} catch (NullPointerException e) {
			System.out.println("없는 고객 이름 입니다.");
		}

		
		
		
	}
	
	
	
	//4번 수정
	public void customUpdate(Scanner sc) {
		dao = new CustomDAO();
		
		while(true) {
			System.out.println("[고객님의 연락처와 직장명을 수정합니다]");
			System.out.print("수정을 원하는 고객님의 번호를 적어 주세요 >> ");
			int num = sc.nextInt();
			
			CustomVO vo = dao.customSearch3(num);
			
			System.out.println("고객명 : "+vo.getName());
			System.out.println("연락처 : "+vo.getTel());
			System.out.println("직장명 : "+vo.getOffice());
				
			System.out.print("수정할 연락처 >> ");
			String tel = sc.next();
			System.out.print("수정할 직장명 >> ");
			String office = sc.next();
			
			System.out.print("수정 하시겠습니까? (y/n) >> ");
			String ch = sc.next();
			
			if(ch.equalsIgnoreCase("y")) {
				
				int row = dao.customUpdate(num, tel, office);
				
				if(row != 0) {
					System.out.println("수정 완료");
				}else {
					System.out.println("수정 실패");
				}
					
				break;
			}else {
				continue;
			}
		
		}

			
		
		
	}

	
	//5번 삭제
	
	public void customDelete(Scanner sc) {
		dao = new CustomDAO();
		 
		while(true) {
			System.out.println("[입력한 번호의 고객정보를 삭제합니다]");
			System.out.print("삭제할 고객 번호 입력(-99입력시 종료) >> ");
			int num = sc.nextInt();
			
			if(num == -99) break;
			
			List<CustomVO> list = dao.customSearch2(num);
			
			if(list.size()!=0) {
				for(int x = 0; x < list.size(); x++) {
					System.out.println("고객명 : "+list.get(x).getName()+"\t");
					System.out.println("연락처 : "+list.get(x).getTel()+"\t");
					System.out.println("주소 : "+list.get(x).getAddr()+"\t");
					System.out.println("직장명 : "+list.get(x).getOffice()+"\t");
					System.out.println("생일 : "+list.get(x).getBirthday()+"\t");
					System.out.println("성별 : "+list.get(x).getSex()+"\t");
					System.out.println("등록일자 : "+list.get(x).getIndate());
					System.out.println();
				}
			}else {
				System.out.println("등록된 고객이 없습니다.");
			}
			
			
			System.out.print("삭제 하시겠습니까? (y/n) >> ");
			String ch = sc.next();
			
			if(ch.equalsIgnoreCase("y")) {
				int row = dao.customDelete(num);
				
				if(row != 0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
				
			}else {
				continue;
			}

		}
		
	}
	
	//6번 종료
	public void exit(Scanner sc) {
		System.out.print("종료 하시겠습니까? (y/n) >>");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("y")) {
			System.exit(0);
		}
		
	}
	
}
