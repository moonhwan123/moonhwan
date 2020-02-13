import java.util.Arrays;

/*
[1~45 로또 게임 만들기]

42 34 12 23 3 5 7




 */

public class Exam_07 {
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		int ball[] = new int[45];
		int cnt = 0;
		
		while(cnt<lotto.length) {
			boolean flag = false;
			int bun = (int)(Math.random()*45+1);
			
			//중복확인
			for(int x = 0; x <= cnt; x++) {
				if(bun == lotto[x]) {
					flag = true;
					break;
				}
			}//for 문 끝
			
			if(!flag) {
				lotto[cnt] = bun;
				cnt++;
			}
			
		}
		
		for(int x = 0 ; x < 6; x++) {
			System.out.print(lotto[x]+"\t");
		}
		
		
		
		
		/*
		int bun = (int)(Math.random()*45+1);
		lotto[cnt] = bun;
		cnt++;
		do {
			bun = (int)(Math.random()*45+1);
			if(bun == lotto[cnt-1]) {
				continue;
			}else {
				lotto[cnt] = bun;
			}
			cnt++;
		}while(cnt < 6);
		*/
		
		
		
//		for(int x = 0 ; x < ball.length; x++) {
//			ball[x] = x+1;
//		}
//		int bun;
//		for(int x = 0 ; x < 6; x++) {
//			bun = (int)(Math.random()*45+1);
//			int temp = ball[x];
//			ball[x] = ball[bun];
//			ball[bun] = temp;
//		}
//		
//		for(int x = 0 ; x < 6; x++) {
//			System.out.print(ball[x]+"\t");
//		}
		
		
		
		
		
//		System.out.println(Arrays.toString(ball));
		
		
		
		
		
		
	}
}
