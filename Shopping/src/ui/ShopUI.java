package ui;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.ShopDAO;
import model.ShopVO;

public class ShopUI {
	ShopDAO dao = null;
	
	
	//[1] 회원정보 등록
	public void uiInsert(Scanner sc) {
		dao = new ShopDAO();
		String custnoPat = "\\d{1,6}";
		String phonePat = "(010|011)-\\d{3,4}-\\d{4}";
		
		System.out.println("[회원 정보를 등록 합니다.]");
		while(true) {
			
			String custno;
				while(true) {
				System.out.print("회원번호(6자리) : ");
				custno = sc.next();
				if(Pattern.matches(custnoPat, custno) == true) {
					break;
				}else {
					System.out.println("번호 입력 오류 다시입력");
					continue;
				}
			}
			
			System.out.print("회원이름 : ");
			String custname = sc.next();
			
			String phone;
			while(true) {
				System.out.print("연락처 : ");
				phone = sc.next();
				if(Pattern.matches(phonePat, phone)==true) {
					break;
				}else {
					System.out.println("휴대폰 번호 입력 오류 다시입력");
				}
			}
			String gender;
			while(true) {
				System.out.print("성별(M/F) : ");
				gender = sc.next();
				if(gender.equalsIgnoreCase("M")) {
					break;
				}else if(gender.equalsIgnoreCase("F")) {
					break;
				}else {
					System.out.println("성별 입력 오류 다시입력");
				}
			}
			
			String grade;
			while(true) {
				System.out.print("회원등급(A/B/C) : ");
				grade = sc.next();
				if(grade.equalsIgnoreCase("A")) {
					break;
				}else if(grade.equalsIgnoreCase("B")) {
					break;
				}else if(grade.equalsIgnoreCase("C")) {
					break;
				}
				else {
					System.out.println("등급 입력 오류 다시입력");
				}
			
			}
			
			
			System.out.print("등록 합니까? (y/n) : ");
			String check = sc.next();
			if(check.equalsIgnoreCase("y")) {
				int row = dao.shopInsert(Integer.parseInt(custno), custname, phone, gender, grade);
				if(row!=0) {
					System.out.println("등록성공");
					break;
				}else {
					System.out.println("등록을 하지 않습니다. 처음부터 다시 입력 하세요 ");
					break;
				}
				
			}
		}//while문 끝

	}//1번 등록 끝
	
	
	//[2] 회원정보 현황 조회
	public void uiList(Scanner sc) {
		dao = new ShopDAO();
		
		List<ShopVO> list = dao.shopList();
		
		if(list.size()!=0) {
			System.out.println("회원번호\t\t회원이름\t연락처\t\t\t성별\t가입일자\t\t회원등급");
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getCustno()+"\t\t");
				System.out.print(list.get(x).getCustname()+"\t");
				System.out.print(list.get(x).getPhone()+"\t\t");
				
				if(list.get(x).getGender().equals("M")) {
					System.out.print("남자\t");
				}else {
					System.out.print("여자\t");
				}
				
				System.out.print(list.get(x).getJoindate().substring(0,10)+"\t");
				
				if(list.get(x).getGrade().equalsIgnoreCase("a")) {
					System.out.print("VIP\n");
				}else if(list.get(x).getGrade().equalsIgnoreCase("b")) {
					System.out.print("일반\n");
				}else {
					System.out.print("직원\n");
				}
				
			}
		}else {
			System.out.println("회원 정보 없음");
		}
		
		
	}//2번 조회 끝
	
	
	public void uiUpdate(Scanner sc) {
		dao = new ShopDAO();
		
		while(true) {
			System.out.print("수정할 회원번호 입력 >> ");
			int custno = sc.nextInt();
			List<ShopVO> list = dao.searchNo(custno);
			
			if(list.size()!=0) {
				for(int x = 0 ; x < list.size() ; x++) {
					System.out.print("고객 성명("+list.get(x).getCustname()+") : ");
					sc.nextLine();
					String custname = sc.nextLine();
					if(custname.length() == 0) {
						custname = list.get(x).getCustname();
					}
					
					System.out.print("연락처("+list.get(x).getPhone()+") : ");
					String phone = sc.nextLine();
					if(phone.length() == 0) {
						phone = list.get(x).getPhone();
					}
					
					System.out.print("성별("+list.get(x).getGender()+") : ");
					String gender = sc.nextLine();
					if(gender.length() == 0) {
						gender = list.get(x).getGender();
					}
					
					System.out.print("회원등급("+list.get(x).getGrade()+") : ");
					String grade = sc.nextLine();
					if(grade.length() == 0) {
						grade = list.get(x).getGrade();
					}
					
					System.out.print("수정 합니까?? (y/n) >> ");
					String check = sc.next();
					
					if(check.equalsIgnoreCase("y")) {
						int row = dao.shopUpdate(custname, phone, gender, grade, custno);
						if(row!=0) {
							System.out.println("수정 성공");
							break;
						}else {
							System.out.println("수정 실패");
							break;
						}
						
					}else {
						System.out.println("수정 하지 않습니다. 처음부터 다시 입력 하세요 ");
					}
	

				}
			}else {
				System.out.println("없는 회원 입니다.");
			}
			
			
		}
		
	}
	
	//[4] 회원정보 삭제
	public void uiDelete(Scanner sc) {
		dao = new ShopDAO();
		
		System.out.print("삭제할 회원 번호 입력 >> ");
		int custno = sc.nextInt();
		List<ShopVO> list = dao.searchNo(custno);
		
		if(list.size()!=0){
			for(int x = 0; x < list.size(); x++) {
				System.out.println("고객 성명 : " + list.get(x).getCustname());
				System.out.println("연락처 : " + list.get(x).getPhone());
				System.out.println("성별 : " + list.get(x).getGender());
				System.out.println("회원 등급 : " + list.get(x).getGrade());
				
				System.out.print("삭제 하시겠습니까?? (y/n) >> ");
				String check = sc.next();
				if(check.equalsIgnoreCase("y")) {
					int row = dao.shopDelete(custno);
					if(row!=0) {
						System.out.println("삭제 성공");
						break;
					}else {
						System.out.println("삭제 실패");
						break;
					}
					
				}else{
					System.out.println("삭제 하지 않습니다.");
					break;
				}

			}
			
		}
		
	}
	
	
}
