/* 
һ��ֽ�ĺ����0.08mm�����۶��ٴ��Ժ��ܴﵽ���������ĸ߶ȣ�8848.13m����������ӡ������Ҫ����forʵ�֡�
 */
public class ZY2 {
	////������Ҫ��ȷ����1m==1000mm
	public static void main(String[] args) {
		double d1 = 8848130;//���������ĸ߶�
		int count = 0;
		//d1 ���������ĸ߶�  d2 ֽ�ĺ�� countֽ�ŵĶ��۴��� 
		for (double d2 = 0.08; d2 <= d1; d2 *=2) {
			count++;
			System.out.println("�����ǵ� "+count+"��");
		}	
	}
}