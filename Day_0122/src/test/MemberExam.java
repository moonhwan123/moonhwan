package test;

import java.util.Scanner;

public class MemberExam {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member me;
		Member[] mem = new Member[10];
		int cnt = 0;

		while (cnt < 10) {
			System.out.print("자료 입력 " + (cnt + 1) + " : ");
			String str = sc.nextLine(); // String[] str = sc.nextLine().split(",");

			if (str.equalsIgnoreCase("end"))
				break;

			String[] imsi = str.split(",");
			me = new Member(imsi[0], imsi[1], imsi[2]); // mem[cnt] = new Member(imsi[0],imsi[1],imsi[2]);
			mem[cnt] = me;

			cnt++;
		}

		MemberData md = new MemberData(mem, cnt);
		md.age();
		md.gender();
		md.MemberPrint();

	}
}
