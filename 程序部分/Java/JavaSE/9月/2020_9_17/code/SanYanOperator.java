/*
��Ԫ�������boolean���ʽ�����ʽ1:���ʽ2;
			true ���ر��ʽ1�Ľ��
			false ���ر��ʽ2�Ľ��

��Ԫ�������if���Ĺ�ϵ:
			1. ��Ԫ�������������if������
			2. ��Ԫ������Ƚϼ�࣬��Ԫ��������뷵�ؽ����if��������������
*/
public class SanYanOperator{
	public static void main(String[] args){
		boolean b1 = true;
		boolean b2 = false;
		/* int i = 0;
		i = b2 ? 3 : 5 ; */
		int a = 10 , b = 15;
		int max = a>b?a:b;
		System.out.println(max);
		
		
/* 		int c = 20 , d = 30;
		int max1;
		int max1 = c>d ?c:d;
		System.out.println(max1); */
		int c = 20 , d = 30;
		int max1;
		if(c>d){
			int e = 10;
			max1 = c;
		}else{
			max1 = d;
		}
		System.out.println(e);
		
	
	}
}