/* 
3���û��ڿ���̨����һ���������������������Լ�10���ӡ����������ż������������10���ӡ������Ҫ��ʹ����Ԫ�����ȥʵ�ִ����߼���
 */
import java.util.Scanner;

public class ZuoYe3{
	public static void main(String[] args){
		System.out.println("������һ��������");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int a = (i%2==0)?i+10:i-10;
		System.out.println("�仯��Ϊ "+ a);
		
	}
}