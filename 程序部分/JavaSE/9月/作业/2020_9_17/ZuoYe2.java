/* 
2���û��ڿ���̨����A��B��C��D��E�󣬴�ӡ������Сд��ĸ��Ҫ�ǿ���̨�����������ַ����ַ�������ʾ��������Ҫ��ʹ��Switch���ʵ�֡�

 */
import java.util.Scanner;

public class ZuoYe2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("�����룺");
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
				System.out.println("�������");
		}
	}
}