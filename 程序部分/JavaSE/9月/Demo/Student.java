package com.yingli.Demo;

class Student extends Person{
	private int number;
	
	public static void main(String[] args){
		Student stu = new Student();
		stu.name = "bangdi";
		System.out.println(stu.name);
	}
	public void sleep(){
		System.out.println(name+"在隔壁微妙的睡觉");
	}
	public void shangKe(){
		System.out.println(name+"在上课");
	}
}