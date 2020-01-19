
public class Exam5_8 {
	public static void main(String[] args) {
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == 1) {
				counter[0]++;
			}else if(answer[i] == 2) {
				counter[1]++;
			}else if(answer[i] == 3) {
				counter[2]++;
			}else if(answer[i] == 4) {
				counter[3]++;
			}
		}
		
		for(int i = 0; i < counter.length; i++) {
			if(counter[i] == 1) {
				System.out.println(counter[i]+"*");
			}
			else if(counter[i] == 2) {
				System.out.println(counter[i]+"**");
			}
			else if(counter[i] == 3) {
				System.out.println(counter[i]+"***");
			}
			else if(counter[i] == 4) {
				System.out.println(counter[i]+"****");
			}
		}
		
	}
}
