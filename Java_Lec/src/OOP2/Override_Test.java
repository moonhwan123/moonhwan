package OOP2;

public class Override_Test {

	public static void main(String[] args) {
		/*
		[���� ���̵�]
			-����Ŭ������ ���ͻ�ӹ��� �޼����� ������ ��ӹ��� Ŭ������ �°� '�����ϴ°�'
			
			-����
				> ����ΰ� ���ƾ� �Ѵ�.(�̸�,�Ű�����,����Ÿ��)
				> ���������ڸ� ���� ������ �� �ִ�.
				> ����Ŭ������ �޼��庸�� ���� ���� ���ܼ���X
				
			-�����ε�
				> ������ ���� ���ο� �޼��带 ����
			-�������̵�
				> ��ӹ��� �޼����� ������ ����(������)
		 */
		point_XY xy = new point_XY();
		point_XY_3D xy_3d = new point_XY_3D();
		
		xy.x = 10;
		xy.y = 20;
		
		xy_3d.x = 40;
		xy_3d.y = 50;
		xy_3d.z = 100;
		
		System.out.println(xy.getLocation());
		System.out.println(xy_3d.getLocation());

	}

}
class point_XY{
	int x;
	int y;
	
	String getLocation() {
		return "x : " +x+ " ,y : "+y;
	}
}

class point_XY_3D extends point_XY{
	int z;
	String getLocation() {
		return "x : "+x+" ,y : "+y+ " ,z : " +z;
	}
	
}