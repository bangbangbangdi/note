/* 
��д����String�����ַ�����test�� ��Ϊ ��tset��
 */

public class ZuoYe2{
	public static void main(String[] args){
		String a = "test";
		String b = a.replaceFirst("s","e");//��ԭ���ַ�����һ�����ֵ�"s",����"e"
		System.out.println(b);//teet
		String c = b.replaceFirst("e","s");//��ԭ���ַ�����һ�����ֵ�"e",����"s"
		System.out.println(c);//tset
	}
}