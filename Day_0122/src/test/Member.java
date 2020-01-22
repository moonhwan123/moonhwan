package test;

public class Member {
	String name;
	String jumin;
	String phone;

	String gender = "";
	int age;

	Member() {
	}

	Member(String name, String jumin, String phone) {
		this.name = name;
		this.jumin = jumin;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + "\t" + jumin + "\t" + phone + "\n";
	}

}
