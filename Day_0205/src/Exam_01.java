import java.util.*;

public class Exam_01 {
	
	static List<Integer> list = new ArrayList<Integer>();
	static int index(int idx , int val) {
		for(int x = idx; x < list.size(); x++) {
			if(list.get(x)==val) {
				return x;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		list.add(89);list.add(84);list.add(90);list.add(77);
		list.add(95);list.add(90);list.add(65);list.add(100);
		list.add(90);list.add(84);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(list);
		System.out.print("입력 : ");
		int val = sc.nextInt();
		
		int index = 0;

		System.out.print(val + "의 인덱스는 ");
		
		while(index < list.size()) {
			index = index(index, val);
			if(index ==-1) {
				break;
			}
			System.out.print(index + ",");
			index++;
			
		}
		System.out.println(" 입니다.");
		
	}
}
