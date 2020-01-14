import java.util.Scanner;

/*
Ű���� �Է�(�ִ�10��)
���� ���� �����ϴ� Ŭ���� ����
�Է� : 2 6 9 7 5 8 9 1

���
������
2 6 9 7 5 8 9 1
������
1 2 5 6 7 8 9 9 

 */

class HH{ // �������� ���� Ŭ����
	
	//�������� �޼ҵ�
	void sort(int arr[],int cnt) { //arr - ������ ���� ȣ�� , cnt - ���� ���� ȣ��
		for(int x = 0; x < cnt-1; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(arr[x] > arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}//for�� ��
	}//sort�޼��� ��
	
	//��� �޼ҵ�
	void arrPrint(int arr[],int cnt,String str) {
		System.out.println("["+str+"]");
		for(int x = 0; x < cnt; x++) {
			System.out.print(arr[x]+"\t");
		}System.out.println();
	}
	

	
	
}

public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberArr[] = new int[10];
		int cnt = 0;
		//�Է� �۾�
		System.out.print("�Է� : ");
		while(true) {
			int num = sc.nextInt();
			if(num == -99) break;
			numberArr[cnt] = num;
			cnt++;
			if(cnt == 10) break;		
		}
		
		//��ü ����
		HH h = new HH();
		
		//�� - ȣ��
		h.arrPrint(numberArr,cnt,"��");
		
		//���� �޼ҵ� ȣ��
		h.sort(numberArr,cnt);
		
		//�� - ȣ��
		h.arrPrint(numberArr,cnt,"��");
		
	}
}
