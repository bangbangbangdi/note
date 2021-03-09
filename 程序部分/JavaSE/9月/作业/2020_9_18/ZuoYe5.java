/* 
作业：用户在控制台输入任意单个大写英文字母后，打印它的小写英文字母。（观察ASCII码表里大小写字母的规律）
 */

import java.util.Scanner;

public class ZuoYe5{
	public static void main(String[] args){
		System.out.println("请输入一个大写字母：");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		
		char a =(char)(s1.charAt(0)+32);
		//int i = a+32;
		//char a2 =(char) i;
		System.out.println("变化后为 "+ a);
		
	}
}