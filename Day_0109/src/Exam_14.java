import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[10][6];
		String name[] = new String[10];
		double ave[] = new double[10];
		int cnt;
		
		for(cnt = 0; cnt < 10; cnt++) {
			System.out.print((cnt+1)+" �Է� : ");
			arr[cnt][0] = sc.nextInt(); // ��ȣ
			if(arr[cnt][0]==-99)break;
			name[cnt] = sc.next();
			arr[cnt][1] = sc.nextInt(); // ����
			arr[cnt][2] = sc.nextInt(); // ����
			arr[cnt][3] = sc.nextInt(); // ����
			arr[cnt][4] = arr[cnt][1] +arr[cnt][2] +arr[cnt][3]; 
			ave[cnt] = (int)(arr[cnt][4]/3.*100+0.5)/100.; 
		}


		// ���� ���
		for(int x = 0 ; x < cnt; x ++) {
			int r = 1; // ���� ����
			for(int y = 0; y < cnt; y++) {
				if(arr[x][4]<arr[y][4]) { // �������� 
					r++;
				}
			}
			arr[x][5] = r;
		}
		
		// 1�� ���
		
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<5; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.print(ave[x]+"\t");
			System.out.println(arr[x][5]);
		}
		
		
		// ��Ʈ
			for(int x = 0; x < cnt; x++) {
				for(int y = x+1; y < cnt;y++) {
					if(arr[x][4]<arr[y][4]) { 
						for(int k = 0; k < 6; k++) {
							int temp = arr[x][k];
							arr[x][k] = arr[y][k];
							arr[y][k] = temp;
						}
						double temp2 = ave[x];
						ave[x] = ave[y];
						ave[y] = temp2;
						String temp3 = name[x];
						name[x] = name[y];
						name[y] = temp3;
					}
				}
			}
		
		
		
		//2�� ���
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x][0]+"\t");
			System.out.print(name[x]+"\t");
			for(int y = 1; y<5; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.print(ave[x]+"\t");
			System.out.println(arr[x][5]);
		}
		
	}
}
