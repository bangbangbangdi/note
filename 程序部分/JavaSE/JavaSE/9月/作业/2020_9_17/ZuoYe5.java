/* 
��ҵ���û��ڿ���̨�������ⵥ����дӢ����ĸ�󣬴�ӡ����СдӢ����ĸ�����۲�ASCII������Сд��ĸ�Ĺ��ɣ�
 */

import java.util.Scanner;

public class ZuoYe5{
	public static void main(String[] args){
		System.out.println("������һ����д��ĸ��");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		
		char a =(char)(s1.charAt(0)+32);
		//int i = a+32;
		//char a2 =(char) i;
		System.out.println("�仯��Ϊ "+ a);
		
	}
}