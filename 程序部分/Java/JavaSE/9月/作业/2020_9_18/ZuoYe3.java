/* 
�������һ���㵽һǧ�����������û��´�С��Ȼ����ʾ�´��˻��߲�С�ˣ��²������û�һֱ�£�ֱ���û����У���Ϸ�������Ͳ���Ҫ�������ˡ�
 */
import java.util.Random;
import java.util.Scanner;

public class ZuoYe3{
	public static void main(String[] args){
		Random r = new Random();
		int a = r.nextInt(1000);//����һ���㵽һǧ�������
		while(true){
			System.out.println("------------------------");
			System.out.println("���һ���㵽һǧ�����֣�");
			Scanner s = new Scanner(System.in);
			int b = s.nextInt();
			if(b>a){
				System.out.println("�´���");
			}else if(b<a){
				System.out.println("��С��");
			}else{
				System.out.println("�¶�����");
				System.out.println("��Ϸ����");
				break;
			}
		}
		
		
	}
}