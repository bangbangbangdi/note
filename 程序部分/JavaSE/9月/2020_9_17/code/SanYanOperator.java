/*
三元运算符：boolean表达式？表达式1:表达式2;
			true 返回表达式1的结果
			false 返回表达式2的结果

三元运算符和if语句的关系:
			1. 三元运算符都可以用if语句代替
			2. 三元运算符比较简洁，三元运算符必须返回结果，if可以适配多条语句
*/
public class SanYanOperator{
	public static void main(String[] args){
		boolean b1 = true;
		boolean b2 = false;
		/* int i = 0;
		i = b2 ? 3 : 5 ; */
		int a = 10 , b = 15;
		int max = a>b?a:b;
		System.out.println(max);
		
		
/* 		int c = 20 , d = 30;
		int max1;
		int max1 = c>d ?c:d;
		System.out.println(max1); */
		int c = 20 , d = 30;
		int max1;
		if(c>d){
			int e = 10;
			max1 = c;
		}else{
			max1 = d;
		}
		System.out.println(e);
		
	
	}
}