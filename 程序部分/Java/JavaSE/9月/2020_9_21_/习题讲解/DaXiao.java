/* 
�û��ڿ���̨�������ⵥ����дӢ����ĸ�󣬴�ӡ����СдӢ����ĸ�����۲�ASCII������Сд��ĸ�Ĺ��ɣ�
 */
import java.util.Scanner;
public class DaXiao{
	public static void main(String[] args){
			Scanner sr=new Scanner(System.in);
			System.out.println("������һ��A~Z֮����ַ���");
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
				System.out.println("��������");
			}
			
	}
}
