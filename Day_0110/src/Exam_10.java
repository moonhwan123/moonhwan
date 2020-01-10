/*
2차원 배열에 Data가 입력 되어 있을 경우
1: 9  90  80  89  80  90
2: 5  77  88  99  90  70
 : .   .   .   .   .   .
5: 55 77  77  99  50  79

번호와 5과목 점수

1) 입력 자료 출력 메소드 구현(dataPrint())
       번호       점수1    점수2    점수3    점수4    점수5
   ...
    
2) 총점 구하는 메소드 구현(dataTot())
3) 총점을 기준으로 내림차순 정렬 메소드 구현(totSort())
4) 전체 출력 메소드 구현(dataPrint2())
       번호       점수1    점수2    점수3    점수4    점수5    총점
   ...


 */
public class Exam_10 {
	
	public static void main(String[] args) {
		
		//배열 선언 및 데이터 초기화
		int[][] score = {{1,90,80,89,80,90},{2,50,82,69,80,28},{3,20,57,82,23,45}
		,{4,90,78,89,25,90},{5,95,90,89,79,94}};
		int[] sum = new int[5];
		
		
		//dataPrint() 호출
		dataprint(score);
		
		//dataTot() 호출
		dataTot(sum,score);
		
		//dataSort() 호출
		dataSort(sum,score);

		//dataPrint2() 호출
		dataprint2(sum,score);
		

	}
	
	static void dataprint(int[][] arr) {
		System.out.print("번호\t과목1\t과목2\t과목3\t과목4\t과목5\n");
		for(int x = 0 ; x < arr.length; x++) {
			for(int y = 0 ; y < arr[0].length; y++) {
				System.out.print(arr[x][y]+"\t");
			}System.out.println();
		}
	}
	
	static void dataTot(int[]arr1,int[][] arr2) {
		for(int x = 0 ; x < arr2.length; x++) {
			for(int y = 1 ; y < arr2[0].length; y++) {
				arr1[x] += arr2[x][y];
			}
		}
	}
	
	static void dataSort(int[] arr1, int[][] arr2) {
		for(int x = 0; x < arr1.length-1; x++) {
			for(int y = x+1; y < arr1.length;y++) {
				if(arr1[x]<arr1[y]) { 
					for(int k = 0; k < 6; k++) {
						int temp = arr2[x][k];
						arr2[x][k] = arr2[y][k];
						arr2[y][k] = temp;
					}
					int temp2 = arr1[x];
					arr1[x] = arr1[y];
					arr1[y] = temp2;
				}//if 끝
			}
		}
	}
	
	
	static void dataprint2(int[]arr1,int[][] arr2) {
		System.out.print("번호\t과목1\t과목2\t과목3\t과목4\t과목5\t총점\n");
		for(int x = 0 ; x < arr2.length; x++) {
			for(int y = 0 ; y < arr2[0].length; y++) {
				System.out.print(arr2[x][y]+"\t");
			}System.out.print(arr1[x]);
			System.out.println();
		}
	}
	

	

}
