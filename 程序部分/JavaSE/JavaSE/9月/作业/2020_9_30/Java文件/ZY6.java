import java.util.Scanner;
/* 
����һ���ַ���,�жϸ��ַ������Ƿ����ĳ���Ӵ�.�������,����Ӵ������г���λ��.
��:"abcbcbabcb34bcbd"��,"bcb"�Ӵ��ĳ���λ��Ϊ: 1,7,12.�ַ������Ӵ������û�����
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