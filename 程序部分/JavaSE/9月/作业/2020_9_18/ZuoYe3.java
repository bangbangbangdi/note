/* 
随机生成一个零到一千的整数，让用户猜大小，然后提示猜大了或者猜小了，猜不中让用户一直猜，直到用户猜中，游戏结束，就不需要继续猜了。
 */
import java.util.Random;
import java.util.Scanner;

public class ZuoYe3{
	public static void main(String[] args){
		Random r = new Random();
		int a = r.nextInt(1000);//返回一个零到一千的随机数
		while(true){
			System.out.println("------------------------");
			System.out.println("请猜一个零到一千的数字：");
			Scanner s = new Scanner(System.in);
			int b = s.nextInt();
			if(b>a){
				System.out.println("猜大了");
			}else if(b<a){
				System.out.println("猜小了");
			}else{
				System.out.println("猜对啦！");
				System.out.println("游戏结束");
				break;
			}
		}
		
		
	}
}