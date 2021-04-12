/* 
编写程序将String类型字符串”test” 变为 “tset”
 */

public class ZuoYe2{
	public static void main(String[] args){
		String a = "test";
		String b = a.replaceFirst("s","e");//将原有字符串第一个出现的"s",换成"e"
		System.out.println(b);//teet
		String c = b.replaceFirst("e","s");//将原有字符串第一个出现的"e",换成"s"
		System.out.println(c);//tset
	}
}