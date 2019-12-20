package com.cmh.app;

public class StudentClass {
	private String name;
	private int age;
	private char gender;
	private String address;
	
	public StudentClass(String name,int age,char gender,String address) {
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.printf("�̸� : %s , ���� : %d , ���� : %s , �ּ�  : %s\n",this.name,this.age,this.gender,this.address);	
	}
}
