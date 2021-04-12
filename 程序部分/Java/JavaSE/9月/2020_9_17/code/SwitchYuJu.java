/* 
Switch语句:
	1,value必须是常量即：整数、浮点数、字符、字符串、枚举
	2,value的值的数据类型必须与expression的数据类型相同
	3,当遇到 break 语句时，switch 语句终止
	4,switch 语句可以包含一个 default 分支，该分支一般是 switch
	  语句的最后一个分支（可以在任何位置，但建议在最后一个）
	5,default 带break的时候在没有 case 语句的值和变量值相等的时候执行（在哪都不影响）
 */

public class SwitchYuJu{
	public static void main(String[]args){
		int a = 3;
		//float f = 4.5;
		
		switch(3){
			

		case 1:
			System.out.println("a的值是1");
			break;
		case 2:
			System.out.println("a的值是2");
			break;
		case 3:
			System.out.println("a的值是3");	
			break;
		case 4:
			System.out.println("a的值是4");
			break;
		default:
			System.out.println("a不是1234");
			break;


	}
	}
}