/*
2���� �迭�� Data�� �Է� �Ǿ� ���� ���
1: 9  90  80  89  80  90
2: 5  77  88  99  90  70
 : .   .   .   .   .   .
5: 55 77  77  99  50  79

��ȣ�� 5���� ����

1) �Է� �ڷ� ��� �޼ҵ� ����(dataPrint())
       ��ȣ       ����1    ����2    ����3    ����4    ����5
   ...
    
2) ���� ���ϴ� �޼ҵ� ����(dataTot())
3) ������ �������� �������� ���� �޼ҵ� ����(totSort())
4) ��ü ��� �޼ҵ� ����(dataPrint2())
       ��ȣ       ����1    ����2    ����3    ����4    ����5    ����
   ...


 */
public class Exam_10 {
	
	public static void main(String[] args) {
		
		//�迭 ���� �� ������ �ʱ�ȭ
		int[][] score = {{1,90,80,89,80,90},{2,50,82,69,80,28},{3,20,57,82,23,45}
		,{4,90,78,89,25,90},{5,95,90,89,79,94}};
		int[] sum = new int[5];
		
		
		//dataPrint() ȣ��
		dataprint(score);
		
		//dataTot() ȣ��
		dataTot(sum,score);
		
		//dataSort() ȣ��
		dataSort(sum,score);

		//dataPrint2() ȣ��
		dataprint2(sum,score);
		

	}
	
	static void dataprint(int[][] arr) {
		System.out.print("��ȣ\t����1\t����2\t����3\t����4\t����5\n");
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
				}//if ��
			}
		}
	}
	
	
	static void dataprint2(int[]arr1,int[][] arr2) {
		System.out.print("��ȣ\t����1\t����2\t����3\t����4\t����5\t����\n");
		for(int x = 0 ; x < arr2.length; x++) {
			for(int y = 0 ; y < arr2[0].length; y++) {
				System.out.print(arr2[x][y]+"\t");
			}System.out.print(arr1[x]);
			System.out.println();
		}
	}
	

	

}
