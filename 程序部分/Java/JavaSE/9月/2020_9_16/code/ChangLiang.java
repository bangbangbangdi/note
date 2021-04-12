/*
常量与变量:
1. 常量：0 1 2 3 , 3.14 , 'g' , ture false  

2. 变量：

   变量的申明格式：

   变量类型    变量名   =    初始值int hp;	
   
变量名需遵循的硬性规定:
	1、只能有：大写字母、小写字母、数字、下划线（_）、美元符（$）  
		MYNAME,MyName,My9,My_Name,myname
	2、不能以数字开头
		_myname,$myname
	3、不能是关键字
	
变量名需遵循的行业规定:
1、命名简单易懂		student int age = 10;

2、驼峰命名法

- 大驼峰（一般用于类名）HelloWorld ChangLiangBianLiang

  例如：DataTpye

- 小驼峰（方法名和变量名）helloWorld changLiangBianLiang

  例如：myStudentCount（我的学生数量）、ip_ServerNorth2（2号北方服务器的ip地址）
*/

public class ChangLiang{
	public static void main(String[] args){
		//整型
		byte b = 127;
		short s = 10;
		int bang = 23; 
		long i = 10003L;
		//浮点型
		float f = 123.1F;
		double d = 345.1;
		//字符型
		char c ='c';
		//布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b);
		System.out.println(s);
		System.out.println(bang);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(b2);
		
		final int PI = 3.141592653;
		
		
		
	}
}