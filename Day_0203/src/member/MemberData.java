package member;

import java.util.ArrayList;
import java.util.List;

public class MemberData {
	ArrayList list;
	
	MemberData(){}
	MemberData(ArrayList list){
		this.list = list;
		memberPrint();
	}
	
	private void memberPrint() {
		for(int x = 0 ; x < list.size() ; x++) {
			System.out.print(list.get(x));
		}
	}
}
