package user;

public class UserData {
	User[] userArr;
	int cnt;
	
	UserData(){}
	UserData(User[] userArr,int cnt){
		this.userArr = userArr;
		this.cnt = cnt;
	}
	
	public void idCheck(String userId) {
		boolean sw = true;
		for(int x = 0; x < cnt; x++) {
			if(userId.equals(userArr[x].userId)) {
				System.out.println(userArr[x]);
				sw = false;
			}
		}
		if(sw && !(userId.equalsIgnoreCase("end"))) {
			System.out.println("정보가 없습니다.");
		}
		
	}

	
	
	
}
