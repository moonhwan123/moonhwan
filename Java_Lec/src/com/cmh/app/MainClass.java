package com.cmh.app;

public class MainClass {

	public static void main(String[] args) {
		
		String name[] = {"ȫ�浿", "��浿", "�ڱ浿", "�̱浿", "�ֱ浿"};
	    int age[] = {20, 25, 30, 35, 40};
	    char gender[] = {'��', '��','��', '��'};
	    String address[] = {"�뱸�� ���� �ž�4��", "����� ���� �ž�4��", 
		"�λ�� ���� �ž�4��", "��õ�� ���� �ž�4��", "���ֽ� ���� �ž�4��"};
	    
	    StudentClass[] stu = new StudentClass[10];
	    
	    int[] r = new int[4];
	    
	    for(int i = 0; i < stu.length; i++) {
	    	for(int j = 0; j< r.length; j ++) {
	    		 r[j] = (int)(Math.random()*4);
	    	}
	    	stu[i] = new StudentClass(name[r[0]], age[r[1]], gender[r[2]], address[r[3]]);
	    }
	    
	    for(int k = 0; k<stu.length;k++) {
	    	stu[k].showStudentInfo();
	    }
	    
	    stu[9].setName("����ġ");
	    stu[9].setAge(24);
	    stu[9].setGender('��');
	    stu[9].setAddress("���� �Ѿ��α� �θ޻��");
	    
	    stu[9].showStudentInfo();

	}

}
