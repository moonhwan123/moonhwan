package ui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.ReDAO;
import model.ReVO;

public class ReUI {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
    Calendar c1 = Calendar.getInstance();
    
	String strToday = sdf.format(c1.getTime());
	
	ReDAO dao = null;
	
	
	//[1] 도서대출 예약 등록
	public void uiInsert(Scanner sc) {
		dao = new ReDAO();
		String phonePat = "(010|011)-\\d{3,4}-\\d{4}";
		String lentnoPat = "\\d{1,4}";
		String booknoPat = "\\d{1,3}";
		System.out.println("[도서대출 예약 등록]");
		
		while (true) {
			System.out.print("대출 번호 >> ");
			String lentno = sc.next();

			System.out.print("고객 성명 >> ");
			String custname = sc.next();
			
			System.out.print("연락처 >> ");
			String phone = sc.next();
			
			System.out.print("도서코드 >> ");
			String bookno = sc.next();
			
			System.out.print("대출일자 >> ");
			String outdate = sc.next().replace("-", "");
			
			System.out.print("반납일자(반납하지 않았을 경우 0 입력) >> ");
			String indate = sc.next(); 
			String status;
			if(indate == null) {
				status = "1";
			}else {
				status = "2";
			}

			System.out.print("등록 하시겠습니까? (y/n) >> ");
			String pass = sc.next();
			if (pass.equalsIgnoreCase("y")) {
				boolean boolLentno = Pattern.matches(lentnoPat, lentno);
				boolean boolphone = Pattern.matches(phonePat, phone);
				boolean boolbookno = Pattern.matches(booknoPat, bookno);
				if(boolLentno == false) {
					System.out.println("잘못된 대출 번호");
					continue;
				}
				if(boolphone == false) {
					System.out.println("잘못된 휴대폰 번호");
					continue;
				}
				if(boolbookno == false) {
					System.out.println("잘못된 도서 번호");
					continue;
				}

				int row = dao.reInsert(Integer.parseInt(lentno), custname, phone, Integer.parseInt(bookno), outdate, indate,status);
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
		
	}
	
	
	//[2] 도서대출현황 결과 조회
	public void uiList(Scanner sc) {
		dao = new ReDAO();
		
		List<ReVO> list = dao.reList();
		
		if(list.size() != 0) {
			System.out.println("대출번호\t고객성명\t전화번호\t\t도서코드\t대출일자\t\t반납일자\t\t\t대출상태");
			
			for(int x = 0 ; x < list.size(); x++) {
				System.out.print(list.get(x).getLentno()+"\t");
				System.out.print(list.get(x).getCustname()+"\t");
				System.out.print(list.get(x).getPhone()+"\t");
				System.out.print(list.get(x).getBookno()+"\t");
				System.out.print(list.get(x).getOutdate()+"\t");
				if(list.get(x).getIndate() == null) {
					System.out.print("            \t\t");
				}else {
					System.out.print(list.get(x).getIndate().substring(0,4)+"년");
					System.out.print(list.get(x).getIndate().substring(5,7)+"월");
					System.out.print(list.get(x).getIndate().substring(8,10)+"일\t\t");
				}
				if(list.get(x).getIndate() == null) {
					System.out.println("대출중");
				}else {
					System.out.println("반납완료");
				}
			}
		}else {
			System.out.println("0");
		}
		
	}//2번끝
	
	
	//[3] 도서대출예약 수정
	public void uiUpdate(Scanner sc) {
		dao = new ReDAO();
		System.out.print("검색할 대출 번호 : ");
		int lentno = sc.nextInt();
		List<ReVO> list = dao.reSearchLentno(lentno);
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.print("고객 성명 ("+list.get(x).getCustname()+") : ");
				sc.nextLine();
				String custname = sc.nextLine();
				if(custname.length() == 0) {
					custname = list.get(x).getCustname();
				}
				System.out.print("연락처 ("+list.get(x).getPhone()+") : ");
				String phone = sc.nextLine();
				if(phone.length() == 0) {
					phone = list.get(x).getPhone();
				}
				System.out.print("도서코드("+list.get(x).getBookno()+") : ");
				String bookno2 = sc.nextLine();
				int bookno;
				if(bookno2.length() == 0) {
					bookno = list.get(x).getBookno();
				}else {
					bookno = Integer.parseInt(bookno2);
				}
				System.out.print("대출일자 ("+list.get(x).getOutdate()+") : ");
				String outdate = sc.nextLine();
				if(outdate.length() == 0) {
					outdate = list.get(x).getOutdate();
				}
				System.out.print("반납일자 ("+list.get(x).getIndate().substring(0,10)+") : ");
				String indate = sc.nextLine();
				if(indate.length() == 0) {
					indate = list.get(x).getIndate().substring(0,10);
				}
				
				System.out.print("등록 합니까? (y/n) >>");
				String check = sc.nextLine();
				if(check.equalsIgnoreCase("y")) {
					int row = dao.reUpdate(custname, phone, bookno, outdate, indate,lentno);
					if(row != 0) {
						System.out.println("갱신 성공");
						
					}else {
						System.out.println("갱신 실패");
					}
				}else {
					System.out.println("갱신 하지 않습니다. 처음부터 다시 입력 하세요");
					continue;
				}
				

				
			}
		}else {
			System.out.println("0");
		}

	}//수정 끝
	
	
	public void uiReturn(Scanner sc) {
		dao = new ReDAO();
		System.out.print("반납 대출 번호 : ");
		int lentno = sc.nextInt();
		List<ReVO> list = dao.reSearchLentno(lentno);
		
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.println("고객 성명 : " + list.get(x).getCustname());
				System.out.println("연락처 : " + list.get(x).getPhone());
				System.out.println("도서 코드 : " + list.get(x).getBookno());
				System.out.println("대출 일자 : " + list.get(x).getOutdate());
				if(list.get(x).getIndate()==null) {
					System.out.println("반납 일자 : X");
				}else {
					System.out.println("반납 일자 : " + list.get(x).getIndate().substring(0,10));
				}
				
				
				System.out.println("도서 반납을 처리 합니까? (y/n) >> ");
				String check = sc.next();
				if (check.equalsIgnoreCase("y")) {
					int row = dao.reReturn(strToday, lentno);
					if(row != 0) {
						System.out.println("반납 성공");
					}else {
						System.out.println("반납 실패");
					}
				}else {
					System.out.println("반납을 하지 않습니다.");
				}
			}
		}
		
	}

}
