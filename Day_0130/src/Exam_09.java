import java.lang.reflect.Array;
import java.util.Arrays;

/*
[ArraysŬ������ �̿��� �迭�� ����]
Arrays.sort(arr); -> �⺻�ڷ����� ���ڿ��� ������ �ȴ�.
 */

public class Exam_09 {
	public static void main(String[] args) {
		
		int arr[] = {90,87,95,80,75,60};
		int var[][] = {{1,90,80,70},{4,60,87,70},{3,20,30,80}}; // �Ӹ��� �ȵ�
		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);

		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		
		String[] name = {"��","��","��","��"};
		
		Arrays.parallelSort(name);
		for(int x = 0; x < name.length; x++) {
			System.out.print(name[x]+" ");
		}
		
		
		
		
		
		
		
	}
}
