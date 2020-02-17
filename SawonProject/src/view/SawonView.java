package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.type.NullType;

import model.EmployeeDAO;
import model.EmployeeVO;

public class SawonView {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    Calendar c1 = Calendar.getInstance();

	String strToday = sdf.format(c1.getTime());
	
	EmployeeDAO dao = null;
	
	
	//1.전체 사원 출력
	public void sawonPrint(Scanner sc) {
		dao = new EmployeeDAO();
		System.out.println("[전체 사원정보를 출력 합니다]");
		System.out.println("사원번호\t이름   \t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
		List<EmployeeVO> list = dao.employeePrint();
		
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEno()+"   ");
				System.out.print(list.get(x).getEname()+"\t");
				System.out.printf("%-8s\t",list.get(x).getJob());
				if(list.get(x).getManager()==0) {
					System.out.print("    \t");
				}else {
					System.out.print(list.get(x).getManager()+"    ");
				}
				System.out.print(list.get(x).getHiredate().substring(0,11)+"    ");
				System.out.print(list.get(x).getSalary()+"\t");
				if(list.get(x).getCommission() == 0) {
					System.out.print("   \t");
				}else {
					System.out.print(list.get(x).getCommission()+"\t ");
				}
//				System.out.print(list.get(x).getDno()+"\t");
				System.out.print(list.get(x).getDname()+"\n");
				
			}
		}else {
			System.out.println("no");
		}
		System.out.println("엔터를 누르면 메인화면");
		if(sc.nextLine().length()==0) {
			System.out.println("");
		}else System.out.println("");
		System.out.println();
		
	}//1번 끝
	
	
	//2.사원 등록
	public void sawonInsert(Scanner sc) {
		dao = new EmployeeDAO();
		System.out.println("[신규 사원을 등록 합니다.]");
		
		while(true) {
			
			System.out.print("사원이름 : ");
			String ename = sc.next();
			System.out.print("업무명 : ");
			String job = sc.next();
			System.out.print("상사번호 : ");
			int manager = sc.nextInt();
			sc.nextLine();
			System.out.print("입사일자(yyyy/mm/dd) : ");
			String hiredate = sc.nextLine();
			if(hiredate.length() == 0) {
				hiredate = strToday;
			}
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("커미션 : ");
			int commission = sc.nextInt();
			System.out.println("[부서정보]");
			System.out.println("10:ACCOUNTING / 20:RESEARCH / 30:SALES / 40:OPERATION");
			
			System.out.print("부서번호 : ");
			int dno = sc.nextInt();
			int rrr = dao.buseoSearch(dno);
			if(rrr!=0) {
				System.out.print("등록 하시겠습니까? (y/n) >> ");
				String ch = sc.next();
				if(ch.equalsIgnoreCase("y")) {
					int row = dao.employeeInsert(ename, job, manager, hiredate, salary, commission, dno);
					
		
					if(row != 0) {
						System.out.println("등록 완료");
					}else {
						System.out.println("등록 실패");
					}
					break;
				}else {
					continue;
				}
			}else {
				System.out.println("없는 부서 번호");
				continue;
			}
			
			

			
		}
	}
	
	
	//3.사원 검색
	public void sawonSearch(Scanner sc) {
		dao = new EmployeeDAO();
		
		while(true) {
		
			System.out.println("[사원이름으로 사원정보를 검색합니다]");
			System.out.print("검색을 원하는 사원 이름을 입력 >>");
			String ename = sc.next();
			List<EmployeeVO> list = dao.employeeSearch(ename);
			
			try {
				if(list.size()!=0) {
					for(int x = 0; x < list.size(); x++) {
						System.out.println();
						System.out.println("사원번호 : "+list.get(x).getEno()+"\t");
						System.out.println("사원이름 : "+list.get(x).getEname()+"\t");
						System.out.println("업무명 : "+list.get(x).getJob()+"\t");
						System.out.println("상사이름 : "+list.get(x).getMname()+"\t");
						System.out.println("입사일자 : "+list.get(x).getHiredate().substring(0,11)+"\t");
						System.out.println("급여 : "+list.get(x).getSalary()+"\t");
						System.out.println("커미션 : "+list.get(x).getCommission());
						System.out.println("부서명 : "+list.get(x).getDname());
						System.out.println();
					}
				}else {
					System.out.println("등록된 사원이 없습니다.");
				}
			} catch (NullPointerException e) {
				System.out.println("없는 사원 이름 입니다.");
			}
			System.out.println("계속 검색 할까요 ? (y/n)");
			if(sc.next().equalsIgnoreCase("y")) {
				
				continue;
			}else {
				break;
			}
		
		}
	}// 3 끝
	
	
	//4.사원 수정
		public void sawonUpdate(Scanner sc) {
			dao = new EmployeeDAO();
			System.out.println("[전체 사원정보를 수정 합니다]");
			System.out.print("수정할 사원 번호를 입력 하세요 >> ");
			int eno = sc.nextInt();
			List<EmployeeVO> list = dao.employeeUpdateSearch(eno);
			
			
			if(list.size()!=0) {
				System.out.println("사원 번호  : "+list.get(0).getEno());
				System.out.println("사원 이름 ("+list.get(0).getEname()+") : ");
				sc.nextLine();
				String ename = sc.nextLine();
				if(ename.length() == 0) {
					ename = list.get(0).getEname();
				}
				System.out.println("업무명 ("+list.get(0).getJob()+") : ");
				
				String job = sc.nextLine();
				if(job.length() == 0) {
					job = list.get(0).getJob();
				}
				System.out.println("상사번호 ("+list.get(0).getManager()+") : ");
				String manager2 = sc.nextLine();
				int manager;
				if(manager2.length() == 0) {
					manager = list.get(0).getManager();
				}else {
					manager = Integer.parseInt(manager2);
				}
				System.out.println("입사일자(yyyy/mm/dd) ("+list.get(0).getHiredate().substring(0,11)+") : ");
				String hiredate = sc.nextLine();
				if(hiredate.length() == 0) {
					hiredate = list.get(0).getHiredate().substring(0,11);
				}
				System.out.println("급여 ("+list.get(0).getSalary()+") : ");
				String salary2 = sc.nextLine();
				int salary;
				if(salary2.length() == 0) {
					salary = list.get(0).getSalary();
				}else {
					salary = Integer.parseInt(salary2);
				}
				System.out.println("커미션 ("+list.get(0).getCommission()+") : ");
				String commission2 = sc.nextLine();
				int commission;
				if(commission2.length() == 0) {
					commission = list.get(0).getCommission();
				}else {
					commission = Integer.parseInt(commission2);
				}
				System.out.println("10:ACCOUNTING / 20:RESEARCH / 30:SALES / 40:OPERATION");
				System.out.println("부서 번호 ("+list.get(0).getDno()+") : ");
				String dno2 = sc.nextLine();
				int dno;
				if(dno2.length() == 0) {
					dno = list.get(0).getDno();
				}else {
					dno = Integer.parseInt(dno2);
				}
				
				int row = dao.employeeUpdate(eno, ename, job, manager, hiredate, salary, commission, dno);
				
				if(row != 0) {
					System.out.println("갱신 성공");
				}else{
					System.out.println("갱신 실패");
				}
				
				System.out.println();
	
				
			}else {
				System.out.println("no");
			}
			
			
			
			
		}//4번 끝
	
		//5번 삭제
		public void sawonDelete(Scanner sc) {
			dao = new EmployeeDAO();
			System.out.println("[전체 사원정보를 수정 합니다]");
			System.out.print("수정할 사원 번호를 입력 하세요 >> ");
			int eno = sc.nextInt();
			List<EmployeeVO> list = dao.employeeUpdateSearch(eno);
			
			System.out.println(list.get(0).getEno());
			System.out.println(list.get(0).getEname());
			System.out.println(list.get(0).getJob());
			System.out.println(list.get(0).getManager());
			System.out.println(list.get(0).getHiredate().substring(0,11));
			System.out.println(list.get(0).getSalary());
			System.out.println(list.get(0).getCommission());
			System.out.println(list.get(0).getDname());
			
			
			
			System.out.println("정말 삭제 하겠습니까? (y/n)");
			
			if(sc.next().equalsIgnoreCase("y")) {
				int row = dao.employeeDelete(eno);
				
				if(row !=0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
			}else {
				
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
