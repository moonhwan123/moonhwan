package test;

public class MemberData {
	Member[] mem;
	int cnt;

	String gender = "";
	int age;

	public MemberData() {
	}

	public MemberData(Member[] mem, int cnt) {
		this.mem = mem;
		this.cnt = cnt;
	}

	void gender() {
		for (int x = 0; x < cnt; x++) {
			String imsi = mem[x].jumin.substring(7);
			if (imsi.equals("1") || imsi.equals("3") || imsi.equals("5") || imsi.equals("7")) {
				mem[x].gender = "남";
			} else if (imsi.equals("2") || imsi.equals("4") || imsi.equals("6") || imsi.equals("8")) {
				mem[x].gender = "여";
			}
		}

	}

	void age() {
		for (int x = 0; x < cnt; x++) {
			String imsi = mem[x].jumin.substring(7);
			String imsi2 = mem[x].jumin.substring(0, 2);
			if (imsi.equals("1") || imsi.equals("2") || imsi.equals("5") || imsi.equals("6")) {
				mem[x].age = ((2020) - (Integer.parseInt(imsi2) + 1900));
			} else if (imsi.equals("3") || imsi.equals("4") || imsi.equals("7") || imsi.equals("8")) {
				mem[x].age = ((2020) - (Integer.parseInt(imsi2) + 2000));
			}

		}

	}

	void MemberPrint() {
		System.out.println("이름\t전화\t\t성별\t나이");
		for (int x = 0; x < cnt; x++) {
			System.out.print(mem[x].name + "\t" + mem[x].phone + "\t" + mem[x].gender + "\t" + mem[x].age + "\n");
		}

	}

}
