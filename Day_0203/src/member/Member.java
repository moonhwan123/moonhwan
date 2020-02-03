package member;

public class Member {
	String userId;
	String name;
	int age;
	
	Member(){}
	Member(String userId, String name, int age){
		this.userId = userId;
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return userId+"\t"+name+"\t"+age+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.userId.equalsIgnoreCase(userId);
		}else {
			return false;
		}
	}
	
	
}
