package student;

import java.util.List;

public class StudentData {
	List<Student> stuList;
	
	public StudentData(List<Student> stuList) {
		this.stuList = stuList;
		for(int x = 0 ; x < stuList.size(); x++) {
			for(int y = 0 ; y < stuList.size(); y++) {
				if(stuList.get(x).tot < stuList.get(y).tot) {
					stuList.get(x).rank ++;
				}
			}
		}
	}
	
	private void ranksort() { // ������ ���� �޼ҵ�
		for(int x = 0 ; x < stuList.size()-1; x++) {
			for(int y = x+1 ; y < stuList.size(); y++) {
				if(stuList.get(x).rank > stuList.get(y).rank) {
					Student tmp = stuList.get(x);
					stuList.set(x, stuList.get(y));
					stuList.set(y, tmp);
				}
			}
		}
	}
	
	public void sourcePrint() {
		System.out.println("[���� ������ ���]");
		System.out.println("��ȣ\t�̸�\t����1\t����2\t����3\t����4\t����5\t����\t���\t����");
		for(int x = 0 ; x < stuList.size(); x++) {
			System.out.print(stuList.get(x));
		}
	}
	
	public void sortdataPrint() {
		ranksort();
		System.out.println("[������ ���� �� ������ ���]");
		System.out.println("��ȣ\t�̸�\t����1\t����2\t����3\t����4\t����5\t����\t���\t����");
		for(int x = 0 ; x < stuList.size(); x++) {
			System.out.print(stuList.get(x));
		}
	}
	
	
	
}
