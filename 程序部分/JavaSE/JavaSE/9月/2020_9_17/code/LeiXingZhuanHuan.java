/*
数据类型转换：
	小类型到大类型会自动转换：byte->short,char->int->long->float->double
	大类型赋值给小类型，需要声明类型转换
*/

public class LeiXingZhuanHuan{
	public static void main(String[] args){
		byte b = 100;//-128~127
		short sh = b;
		int i = sh;
		long l = i;
		float f = l;
		double d = f;
/* 		System.out.println(b);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d); */
		f = 200;
		b =(byte) f;
		i =(int)3.14;
		i ='a';
		System.out.println(b);
		System.out.println(i);
	}
}
	