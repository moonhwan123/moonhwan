import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Է� : ");
		
		String[] day = sc.nextLine().split(",");
		
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		
		System.out.println("\t\t\t ["+year+"�� "+month+"��]");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//��,�� �� �̿��� calender��ü ����
		GregorianCalendar calender = new GregorianCalendar(year,month-1,1);
		
		//�ش� �� �� �������� ���ϱ�
		int maxday = calender.getActualMaximum(calender.DAY_OF_MONTH);
		//���� ���ϱ�
		int week = calender.get(calender.DAY_OF_WEEK);
		
		//���ۿ��� �� ���� ���� ���
		for(int x = 0; x < (week-1); x++) {
			System.out.print("\t");
		}
		//���� ���
		for(int x = 1; x <= maxday; x++) {
			if(week <= 7) {
				System.out.print(x + "\t");
			}else {
				System.out.print("\n");
				System.out.print(x + "\t");
				week=1;
			}
			week++;
		}
		System.out.println();
		
		
		
	}
}
