/* 
����ҵ���Ĵ��������ʵ�֣�����ÿһ�ζ���ӡ����ǰ���۵Ĵ������Լ���ǰ�ĺ�ȡ�ʹ��continue��䣬�ö��۵���10�ε�ʱ�򲻴�ӡ�κ����ݣ�ʹ��break��䣬�ö������15�κ�����ѭ����
 */
public class ZY3 {
	public static void main(String[] args) {
		double d1 = 8848130;
		int count = 0;
		for (double d2 = 0.08; d2 <= d1; d2 *=2) {
			count++;
			if(count==10)continue;//continue:��������ѭ�������Ͽ�ʼ��һ��ѭ��
			System.out.println("��ǰ�ǵ� "+count+"�ζ���");
			System.out.println("��ǰ�ĺ��Ϊ�� "+ d2*2);
			if(count==15)break;//�������ڵ�ѭ��
		}
	}
}