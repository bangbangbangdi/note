/* 
在控制台接收用户键盘输入的数据:
	nextLine  接收字符串 String
	nextInt   接收整型
	nextFloat 接收浮点类型
	
 */

import java.util.Scanner;

public class ShuRu{
	public static void main(String[]args){
		System.out.println("请输入：");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println("用户输入的是："+i);
	}
}