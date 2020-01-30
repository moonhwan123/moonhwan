package user;
/*
[Ŭ���� �迭�� �̿��� �˻� ��� ����]
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class UeserExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User userArr[] = new User[10];
		int cnt = 0;
		
		
		String namePat = "\\w{1,5}";
		String idPat = "\\w{1,10}";
		String emailPat = "\\w+@\\w+.\\w+(\\.\\w+)?";
		
		//�Է� 
		while(cnt<10) {
			String userId;
			String name;
			String email;
			
			while(true) {
				System.out.print("ȸ�� �̸� : ");
				name = sc.nextLine();
				boolean check = Pattern.matches(namePat, name);
				if(check) {
					break;
				}else {
					System.out.println("�̸� �Է� ����! �ٽ� �Է��ϼ��� >>");
				}
			}
			
			if(name.equalsIgnoreCase("end")||name.equals("")) {
				break;
			}
			
			System.out.print("ȸ�� ID : ");
			userId = sc.nextLine();
			
			if(cnt>=1) {
				for(int x = 0; x < cnt; x++) {
					if(userId.equals(userArr[x].userId)) {
						System.out.println("�ߺ��� ���̵� �Դϴ�. �ٽ� �Է��ϼ��� >> ");
						userId = sc.nextLine();
						x = 0;
					}
				}
			}
		
			while(true) {
				System.out.print("�̸��� : ");
				email = sc.nextLine();
				boolean check = Pattern.matches(emailPat, email);
				if(check) {
					break;
				}else {
					System.out.println("�̸��� �Է� ���� ����! �ٽ� �Է� �ϼ��� >>");
				}
			}
			
			userArr[cnt] = new User(name,userId,email,cnt);

			cnt++;
	
		}
		
		System.out.println("������ȣ\t�̸�\tID\t�̸���");
		for(int x = 0 ; x < cnt; x++) {
			System.out.println(userArr[x]);
		}
		
		
		//�˻�
		UserData ud = new UserData(userArr, cnt);
		while(true) {
			System.out.print("�˻��� ���̵� �Է��ϼ��� >> ");
			String userId = sc.nextLine();
			ud.idCheck(userId);
			if(userId.equalsIgnoreCase("end")) {
				break;
			}
		}
		
		
	}
}
