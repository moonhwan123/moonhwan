package com.cmh.app;

public class MainClass {

	public static void main(String[] args) {
		
		String name[] = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	    int age[] = {20, 25, 30, 35, 40};
	    char gender[] = {'남', '여','남', '여'};
	    String address[] = {"대구시 동구 신암4동", "서울시 동구 신암4동", 
		"부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};
	    
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
	    
	    stu[9].setName("전우치");
	    stu[9].setAge(24);
	    stu[9].setGender('남');
	    stu[9].setAddress("조선 한양인근 두메산골");
	    
	    stu[9].showStudentInfo();

	}

}
