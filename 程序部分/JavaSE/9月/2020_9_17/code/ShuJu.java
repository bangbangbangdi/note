/* 
自动（隐式）类型转换:
	小类型到大类型会自动转换：byte->short,char->int->long->float->double
								1	2		2    4    8      4      8
强制(显式)类型转换
	大类型赋值给小类型，需要声明类型转换
 */

public class ShuJu{
	public static void main(String[]args){
/* 		byte b = 97;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f; */
/* 		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d); */
/* 		f =(float) d;
		l =(long) f;
		System.out.println(l);
		System.out.println(f); */
		
/* 		char c = 97;//ASCII 97 a
		byte b = 97;
		final int i = 97;
		c = i;
		System.out.	println(c); */
		int a = 3, b = 4 ,c =5;
		boolean b1 = !(a<b);//false
		boolean ba = (a>10 && b<10) && b>3;
		
		
		
	}
}