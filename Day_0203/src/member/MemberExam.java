package member;

import java.util.ArrayList;
import java.util.Scanner;

/*
[Ű���� �Է�]
���̵�, �̸� , ���� �Է� Member ��ü�� ����

-�Է� �� ���̵� 'end'�̸� ��ü ��� �� ����
-ArrayList �̿�
-���̵� ���� ��� "�ߺ��� ���̵� �Դϴ�." ��� �� ���Է� �޾ƶ�

[������ ���� ���]
���̵�       �̸�       ����
uesr01  aaa   29
 */
public class MemberExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> memList = new ArrayList<Member>();
		Member m;
		
		while(true) {
			System.out.print("���̵�, �̸� ,���� ������ �Է� �ϼ��� >> ");
			String str = sc.nextLine();
			String[] strArr = str.split(",");
			
			if(strArr[0].equalsIgnoreCase("end")) break;
			
			m = new Member(strArr[0],strArr[1],Integer.parseInt(strArr[2]));
			
			if(memList.contains(m)) {
				System.out.println("�ߺ��� ���̵� �Դϴ�.");
			}else {
				memList.add(m);
			}
			
		}
		
		System.out.println("���̵�\t�̸�\t����");
//		for(int x = 0 ; x < memList.size() ; x++) {
//			System.out.print(memList.get(x));
//		}
//		for(Member mem : memList) {
//			System.out.print(mem.userId + " \t");
//			System.out.print(mem.name + " \t");
//			System.out.print(mem.age + " \n");
//		}
		
		MemberData md = new MemberData(memList);
//		new MemberData(memList);
		
		
	}
}
