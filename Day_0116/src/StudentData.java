
public class StudentData {
	//���⼭ Ŭ���� �迭 ���� ó���ص��ȴ�.
	//�׸��� ���� cnt�� �޾Ƽ� ���� �׷� �޼ҵ忡�� �ȹ޾Ƶ��� ����
	//�׷� �翬�� ������ �� �޾� ��߰���?
	//�׳� �����Ѱ� ó�� �Ű������� �޾Ƶ� �ǰ�,
	
	
	//���� ���ο��� ȣ�� ���ص� �ǰ�, ������ ������ �޼��� ȣ���ؼ� 
	//���ο��� ��� �ϴ� ����� ����.
	
	

	
	
	//�������
	void rank(Student[] cls1 ,int cnt) {
		for(int x = 0; x < cnt ; x++) {
			for(int y = 0; y < cnt; y++) {
				if(cls1[x].tot<cls1[y].tot) {
					cls1[x].rank++;
				}
			}
		}
		
	}
	//���� ���� ���� ����
	void sort(Student[] cls1 ,int cnt) {
		for(int x = 0; x < cnt-1 ; x++) {
			for(int y = x+1; y < cnt; y++) {
				if(cls1[x].rank > cls1[y].rank) {
					Student temp = cls1[x]; 
					cls1[x] = cls1[y];
					cls1[y] = temp;
				}
			}
		}
	}
	
	//������ ���
	void clsDataPrint(Student[] cls1,int cnt) {
		System.out.print("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����\n");
		for(int x = 0; x < cnt; x++) {
			cls1[x].print();
			
		}
	}
	
}
