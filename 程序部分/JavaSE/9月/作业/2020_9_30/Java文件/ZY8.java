/* 
��1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ��һ�����������ظ����ֵ���λ���������Ƕ���ӡ��������ͳ��������
 */
public class ZY8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if((i!=j)&&(j!=k)&&(k!=i)) {//ȷ���������ֻ�����ͬ
						System.out.println(i*100+j*10+k);
						System.out.println(""+i+j+k);
					}
				}
			}
		}
	}
}
