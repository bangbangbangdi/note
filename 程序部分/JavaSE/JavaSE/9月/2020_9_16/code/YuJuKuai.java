/*
语句块:以左大括号开始，以右大括号结束{    }
	   语句块内部可以访问外部变量，外部不能访问内部变量	

*/


public class YuJuKuai{
	public static void main(String[]args){
		
		{
			int i = 10; 
		}
		System.out.println(i);	
	}
}