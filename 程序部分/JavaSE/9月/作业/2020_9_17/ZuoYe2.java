/* 
2、用户在控制台输入A或B或C或D或E后，打印出它的小写字母，要是控制台输入了其它字符或字符串，提示输入有误。要求使用Switch语句实现。

 */
import java.util.Scanner;

public class ZuoYe2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入：");
		String a = s.nextLine();
		switch(a){
			case "A" :
				System.out.println("a");
				break;
			case "B" :
				System.out.println("b");
				break;
			case "C" :
				System.out.println("c");
				break;
			case "D" :
				System.out.println("d");
				break;
			case "E" :
				System.out.println("e");
				break;
			default :
				System.out.println("输入错误");
		}
	}
}