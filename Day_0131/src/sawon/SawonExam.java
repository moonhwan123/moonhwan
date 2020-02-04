package sawon;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 ���        �̸�        �޿�
1101   aaa    345,800
.
.
.
�հ�                      xxx,xxx,xxx
 */
public class SawonExam {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("c:\\data\\sawon.txt"));
		int cnt = 0;
		while(sc.hasNext()) {
			sc.nextLine();
			cnt++;
		}

		
		DecimalFormat df1 = new DecimalFormat("#,###");
		Scanner sc2 = new Scanner(new File("c:\\data\\sawon.txt"));
		String[] str;
		int tot=0;
		System.out.println("���\t�̸�\t�޿�");
		while(sc2.hasNext()) {
			str = sc2.nextLine().split(",");
			Sawon sa = new Sawon(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]));
			System.out.print(sa);
			tot+=sa.money;
			
		}
		
		
		
		String str1 = df1.format(tot);
		System.out.println("�հ� \t\t"+str1);
		
		
	}
}