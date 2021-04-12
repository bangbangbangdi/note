/* 
编写程序将 “jdk” 全部变为大写,并输出到控制台,截取子串”DK” 并输出到控制台
 */

public class ZuoYe1{
	public static void main(String[] args){
		String a = "jdk";
		String b = a.toUpperCase();//JDK,将字符串全部变成大写
		System.out.println(b);
		String c = b.substring(1);//从索引处返回一个子字符串
		System.out.println(c);
	}
}