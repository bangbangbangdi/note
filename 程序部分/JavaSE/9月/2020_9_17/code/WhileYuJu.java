/* 
whileѭ��:
		while(�������ʽ){
				//ѭ����
			}
do ... whileѭ��:
		do��while ѭ���� while ѭ�����ƣ���ͬ���ǣ�do��while ѭ�����ٻ�ִ��һ�Ρ�

continue �ؼ���:
		continue �������κ�ѭ�����ƽṹ�С��������ó���������ת����һ��ѭ���ĵ�����

		�� for ѭ���У�continue ���ʹ����������ת��������䡣

		�� while ���� do��while ѭ���У�����������ת���������ʽ���ж���䡣
		
break �ؼ���:
		break ��Ҫ����ѭ�������� switch ����У�����������������
		break ����������ѭ�������Ҽ���ִ�и�ѭ����������
		
 */


public class WhileYuJu{
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
		
/* 		int i=100;
		do{
			System.out.println(++i);
		}while(i<=9); */
		
			//break���
/* 		int i = 1;		
		while(i<=3){
			int j = 1;
			System.out.println("�������ĵ�"+ i +"��ѭ��");
			System.out.println("--------------------------");
			i++;
			while(j<=5){
				if(j==2){
					break;//����ֻ��������ǰ��ѭ�����
				}
				System.out.println("�����ڲ�ĵ�"+ j +"��ѭ��");
				j++;
			}
		System.out.println("--------------------------");
		}
		 */
	}
}