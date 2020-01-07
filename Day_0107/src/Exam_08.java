import java.util.Scanner;

/*
키보드 입력(1~99)
입력 자료가 -99, 또는 입력자료 건수가 20 이면 종료
입력 : 77
...
입력 : -99 (-99는 입력자료 아님)
입력자료 : 77 xx xx xx ....
평균 : xxx
평균에 가장 가까운 수 : xx (간격이 제일 작은놈 ,큰수 - 작은수)

 */
public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[20];
		int cnt = 0;
		int ave = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("입력(1~99) : ");
			int num = sc.nextInt();
			
			if(num == -99 || cnt == 20) break;
			if(num >= 1 && num <= 99) {
				arr[cnt] = num;
				cnt++;
				sum+=num;
			}else System.out.println("입력 오류");
		}

		ave = sum/cnt;
		
		int cha[] = new int[cnt];	
		
		for(int x = 0; x < cnt; x++) {
			if(ave < arr[x]) {
				cha[x] = arr[x] - ave;
			}else { 
				cha[x] = ave - arr[x];
			}
		}
		
		int min = cha[0];
		int d=0;
		for(int x = 1; x < cnt; x++) {
			if(min>cha[x]) {
				min = cha[x];
				d = x;
			}
			
		}

		System.out.print("입력 자료 : ");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x]+"\t");
		}
		
		System.out.println();
		System.out.print("평균 : "+ ave+"\n");
		System.out.println("평균에 가장 가까운수 : " + arr[d]);
		
		
		
		
		
	}

}
