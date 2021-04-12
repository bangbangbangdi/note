/* 
3、用户在控制台输入一个数，若是奇数，将它自减10后打印出来，若是偶数，将它自增10后打印出来。要求使用三元运算符去实现代码逻辑。
 */
import java.util.Scanner;

public class ZuoYe3{
	public static void main(String[] args){
		System.out.println("请输入一个整数：");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int a = (i%2==0)?i+10:i-10;
		System.out.println("变化后为 "+ a);
		
	}
}