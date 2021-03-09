import java.util.Scanner;
/* 
给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.字符串和子串均由用户输入
 */
public class ZY6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
			//0 1 2 3 4 5...
		for (int i = 0; i < str1.length();) {
			// indexOf 
			//str1 = bangdibangdibangdi
			//str2 = di 4
			
			
			//i 0 6 12 16
			int indexOf = str1.indexOf(str2, i);
			System.out.println(indexOf);
			
			
			
			//6 12 18
			i = indexOf + str2.length();
 		}
	}
}