/* 
	一球从100米高度自由落下，每次落地后反跳回原高度的一半,再落下
	求它在第10次落地时，共经过多少米？第10次反弹多高？将结果打印出来。
	要求用while实现。

 */

public class ZuoYe4{
	public static void main(String[] args){
		double i=1,sum=0,h=100;
		while(i<=10){
		sum+=h;//sum = sum + h;
		h=h/2;//h = h / 2;
		sum+=h;
		System.out.println("这是第"+i+"次下落");
		System.out.println("总共经过了"+sum+"米"+"， 反弹高度为："+h+"米");
		System.out.println("------------------------");
		i++;
		}	
	}
}