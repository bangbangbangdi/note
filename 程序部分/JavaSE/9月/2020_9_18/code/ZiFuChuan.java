/* 
字符串（String）:
	1,怎么表示字符串:一个字符串不能放在多行（那要是我想表示换行呢？）
	2,转义字符:
		换行：\n 
		退格：\b（并不是删除）
	3,字符串变量的申明 两种方式
	4,连接字符串 +(将其他基本数据类型转换为String)
	5,简单的介绍一下字符串的存储方式
		字符串之间用==只是判断内存地址是否相同
		栈：主要存放一些基本类型的变量（int,float，char...）
		堆：存放实例对象（以后会介绍）	
		引用变量：当变量指向一个对象
		字符串是不可变的（所以可以共享）
	6,字符串常用的方法:
		判断内容是否相同(区分大小写):boolean equals(String str)
		忽略大小写以后，判断内容是否相同:boolean equalsIgnoreCase(String str)
		判断是否包含某个子字符串:boolean contains(String str)
		判断字符串是否为空:boolean isEmpty()
			null能通过编译但运行时会报错
			不赋值无法通过编译
		将字符串全部字符转为大写/小写
			将字符串全部字符转为大写:String toUpperCase()
			将字符串全部字符转为小写:String toLowerCase()
		除去字符串前后的空格
			除去字符串前后的空格,注意只去除前面和后面的空格，字符串中间的空格不会去除去
			String trim()
		字符替换
			字符替换，记得是单引号：String replace(char oldChar, char newChar)
			字符串替换:String replaceAll(String oldString, String newString)
		按ASCII码顺序比较两个字符串:int compareTo(String anotherString)
			找到第一个不相同的字符，比较ASCII码中的大小
			常用于字符串的排序上
			相等返回0，小于返回负数，大于返回正数
 */

public class ZiFuChuan {
	public static void main(String[] args){
		String str1 = "a";//97
		String str2 = "d";//100
		String str3 = "f";//102
		int a = str1.compareTo(str2);//负数 -3
		int b = str1.compareTo(str3);//负数 -5
		int c = str3.compareTo(str1);//正数 5
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/* 		String str1 = "BangDiBangDi";
		String str2 = str1.replace('D','d');//BangdiBangdi
		String str3 = str1.replaceAll("Bang","CPD");//CPDDiCPDDi
		
		System.out.println(str2);
		System.out.println(str3); */
		
		
		
		
		
		
		
		
		/* String str1 = "      Bang di      ";
		String str2 = str1.toUpperCase();
		String str3 = str1.toLowerCase();
		String str4 = str1.trim();
		
		System.out.println(str2);//BANG DI
		System.out.println(str3);//bang di
		System.out.println(str4);//Bang di   bang di
		System.out.println(str1);//      Bang di       */
		
		
		
		
		
		//String str6 = "";
		//String str7 = null;
		//String str8;
		
		//boolean b6 = str5.contains(str3);//false
		//boolean b7 = str6.isEmpty();//
		//boolean b8 = str7.isEmpty();//
		//boolean b9 = str8.isEmpty();//
		
		//System.out.println(b6);//false
		//System.out.println(b7);
		//System.out.println(b8);
		//System.out.println(b9);
		/* System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6); */
								
/* 		boolean b1 = str1.equals(str2);//true
		boolean b2 = str1.equals(str4);//true
		boolean b3 = str1.equals(str3);//false
		boolean b4 = str1.equalsIgnoreCase(str3);//true
		boolean b5 = str5.contains(str1);//true
		String str1 = "abc";
		
		String str2 = "abc";
		String str3 = "ABC";
		String str4 = new String("abc");
		String str5 = "abcdefg"; */
	}
}