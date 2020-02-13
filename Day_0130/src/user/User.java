package user;

public class User {
	String name;
	String userId;
	String email;
	int num=0;
	
	User(){}
	User(String name, String userId, String email,int cnt){
		this.name = name;
		this.userId = userId;
		this.email = email;
		this.num = (cnt+1);
		
		
		
	}
	
	public void idCheck() {
		
	}
	
	
	//equals메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(num+"\t");
		sb.append(name+"\t");
		sb.append(userId+"\t");
		sb.append(email+"\t");
		return sb.toString();
	}
	
}
