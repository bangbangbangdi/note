/* 
用户在控制台输入任意单个大写英文字母后，打印它的小写英文字母。（观察ASCII码表里大小写字母的规律）
 */
import java.util.Scanner;
public class DaXiao{
	public static void main(String[] args){
			Scanner sr=new Scanner(System.in);
			System.out.println("请输入一个A~Z之间的字符：");
			String str = sr.nextLine();
			//"bangdi"
			// 012345
			char j = str.charAt(0);
			if(j>='A'&&j<='Z')
			{
				j+=32;
				System.out.println(j);
			}else 
			{
				System.out.println("错误输入");
			}
			
	}
}
