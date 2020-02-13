package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.DeptDAO;
import model.DeptVO;

public class UI {
	DeptDAO dao = null;
	
	
	//목록리스트출력
	public void deptView() {
		dao = new DeptDAO();
		System.out.println("DNO\tDNAME\t\tLOC");
		//db 내용 출력 메소드 호출
		List<DeptVO> list = dao.deptListPrint();
		
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getDno()+"\t");
				System.out.print(list.get(x).getDname()+"\t");
				System.out.print(list.get(x).getLoc()+"\n");
			}
		}else {
			System.out.println("no");
		}
		
	}
	
	//등록
	public void deptInsert(Scanner sc) {
		dao = new DeptDAO();
		System.out.println("부서정보 등록");
		System.out.print("부서번호 : ");
		int dno = sc.nextInt();
		System.out.print("부서명 : ");
		String dname = sc.next();
		System.out.print("지역명 : ");
		String loc = sc.next();
		//db 등록 처리 메소드 호출
		int row = dao.deptInsert(dno, dname, loc);
		
		if(row != 0) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 실패");
		}
		
		
	}
	
	
	//수정
	public void deptUpdate(Scanner sc) {
		dao = new DeptDAO();
		System.out.print("수정할 부서번호 :");
		int dno = sc.nextInt();
		System.out.println("수정할 부서명 : ");
		String dname = sc.next();
		System.out.println("수정할 지역명 : ");
		String loc = sc.next();
		
		int row = dao.deptUpdate(dname, dno, loc);
		
		if(row != 0) {
			System.out.println("갱신 성공");
		}else {
			System.out.println("갱신 실패");
		}
		
	}
	
	//검색
	public void deptSearch(Scanner sc) {
		dao = new DeptDAO();
		
		System.out.print("검색할 부서번호 입력 >> ");
		int dno = sc.nextInt();
		
		List<DeptVO> list = dao.deptSearch(dno);
		
		if(list.size()!=0) {
			System.out.println("DNO\tDNAME\t\tLOC");
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getDno()+"\t");
				System.out.print(list.get(x).getDname()+"\t");
				System.out.print(list.get(x).getLoc()+"\n");
			}
		}else {
			System.out.println("no");
		}
			
		
	}
	
	//삭제
	public void deptDelete(Scanner sc) {
		dao = new DeptDAO();
		
		System.out.print("삭제할 부서번호 입력 >>");
		int dno = sc.nextInt();
		
		int row = dao.deptDelete(dno);
		
		if(row != 0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		
	}
	
	
	
}
