/* 
	һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ��,������
	�����ڵ�10�����ʱ�������������ף���10�η�����ߣ��������ӡ������
	Ҫ����whileʵ�֡�

 */

public class ZuoYe4{
	public static void main(String[] args){
		double i=1,sum=0,h=100;
		while(i<=10){
		sum+=h;//sum = sum + h;
		h=h/2;//h = h / 2;
		sum+=h;
		System.out.println("���ǵ�"+i+"������");
		System.out.println("�ܹ�������"+sum+"��"+"�� �����߶�Ϊ��"+h+"��");
		System.out.println("------------------------");
		i++;
		}	
	}
}