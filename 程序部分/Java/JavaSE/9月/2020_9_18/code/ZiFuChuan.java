/* 
�ַ�����String��:
	1,��ô��ʾ�ַ���:һ���ַ������ܷ��ڶ��У���Ҫ�������ʾ�����أ���
	2,ת���ַ�:
		���У�\n 
		�˸�\b��������ɾ����
	3,�ַ������������� ���ַ�ʽ
	4,�����ַ��� +(������������������ת��ΪString)
	5,�򵥵Ľ���һ���ַ����Ĵ洢��ʽ
		�ַ���֮����==ֻ���ж��ڴ��ַ�Ƿ���ͬ
		ջ����Ҫ���һЩ�������͵ı�����int,float��char...��
		�ѣ����ʵ�������Ժ����ܣ�	
		���ñ�����������ָ��һ������
		�ַ����ǲ��ɱ�ģ����Կ��Թ���
	6,�ַ������õķ���:
		�ж������Ƿ���ͬ(���ִ�Сд):boolean equals(String str)
		���Դ�Сд�Ժ��ж������Ƿ���ͬ:boolean equalsIgnoreCase(String str)
		�ж��Ƿ����ĳ�����ַ���:boolean contains(String str)
		�ж��ַ����Ƿ�Ϊ��:boolean isEmpty()
			null��ͨ�����뵫����ʱ�ᱨ��
			����ֵ�޷�ͨ������
		���ַ���ȫ���ַ�תΪ��д/Сд
			���ַ���ȫ���ַ�תΪ��д:String toUpperCase()
			���ַ���ȫ���ַ�תΪСд:String toLowerCase()
		��ȥ�ַ���ǰ��Ŀո�
			��ȥ�ַ���ǰ��Ŀո�,ע��ֻȥ��ǰ��ͺ���Ŀո��ַ����м�Ŀո񲻻�ȥ��ȥ
			String trim()
		�ַ��滻
			�ַ��滻���ǵ��ǵ����ţ�String replace(char oldChar, char newChar)
			�ַ����滻:String replaceAll(String oldString, String newString)
		��ASCII��˳��Ƚ������ַ���:int compareTo(String anotherString)
			�ҵ���һ������ͬ���ַ����Ƚ�ASCII���еĴ�С
			�������ַ�����������
			��ȷ���0��С�ڷ��ظ��������ڷ�������
 */

public class ZiFuChuan {
	public static void main(String[] args){
		String str1 = "a";//97
		String str2 = "d";//100
		String str3 = "f";//102
		int a = str1.compareTo(str2);//���� -3
		int b = str1.compareTo(str3);//���� -5
		int c = str3.compareTo(str1);//���� 5
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/* 		String str1 = "BangDiBangDi";
		String str2 = str1.replace('D','d');//BangdiBangdi
		String str3 = str1.replaceAll("Bang","CPD");//CPDDiCPDDi
		
		System.out.println(str2);
		System.out.println(str3); */
		
		
		
		
		
		
		
		
		/* String str1 = "      Bang di      ";
		String str2 = str1.toUpperCase();
		String str3 = str1.toLowerCase();
		String str4 = str1.trim();
		
		System.out.println(str2);//BANG DI
		System.out.println(str3);//bang di
		System.out.println(str4);//Bang di   bang di
		System.out.println(str1);//      Bang di       */
		
		
		
		
		
		//String str6 = "";
		//String str7 = null;
		//String str8;
		
		//boolean b6 = str5.contains(str3);//false
		//boolean b7 = str6.isEmpty();//
		//boolean b8 = str7.isEmpty();//
		//boolean b9 = str8.isEmpty();//
		
		//System.out.println(b6);//false
		//System.out.println(b7);
		//System.out.println(b8);
		//System.out.println(b9);
		/* System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6); */
								
/* 		boolean b1 = str1.equals(str2);//true
		boolean b2 = str1.equals(str4);//true
		boolean b3 = str1.equals(str3);//false
		boolean b4 = str1.equalsIgnoreCase(str3);//true
		boolean b5 = str5.contains(str1);//true
		String str1 = "abc";
		
		String str2 = "abc";
		String str3 = "ABC";
		String str4 = new String("abc");
		String str5 = "abcdefg"; */
	}
}