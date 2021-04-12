
import java.util.Random;//随机数
import java.util.Scanner;
public class Zuoye {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		Random r = new Random();
		int num1 = r.nextInt(1000); //生成随机数
		int num2;
		while(true){
			System.out.println("输入1~1000的数");
			num2 = sc.nextInt();//键盘接收数
			if(num2 == num1){
				System.out.println("恭喜你，猜对了");
				break;
			}else if(num2 > num1){
				System.out.println("猜大了");
			}else if(num2 < num1){
				System.out.println("猜小了");		
			}else{
				System.out.println("输入错误，请重新输入");
			}
		}
		
	}
}