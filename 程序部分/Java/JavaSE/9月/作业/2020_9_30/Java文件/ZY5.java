import java.util.Scanner;
/* 
�ڸ質�����У�����8λ��ί���д�֣��ڼ�����ֵ÷�ʱ��ȥ��һ����߷֣�ȥ��һ����ͷ֣�Ȼ��ʣ���6λ��ί�ķ�������ƽ�������Ǹ�ѡ�ֵ����յ÷֡�Ҫ��ѭ������6����ί�����֣���ӡ����ѡ�ֵ����յ÷֡�Ҫ�����������ʵ�֡�
 */

public class ZY5 {
	public static void main(String[] args) {
		int[] arr1 = new int[8];//������һ��arr1����
		Scanner s = new Scanner(System.in);
		for(int i=0;i<8;i++){//�������鲢��ֵ
			System.out.println("�������"+(i+1)+"λ��ί�ĵ÷֣�");
			arr1[i] = s.nextInt();
		}
		int max = arr1[0];//��߷�
		int min = arr1[0];//��ͷ�
		int sum = 0;//�ܷ�
		double count = 0;//ƽ����
		System.out.println("------------------");
		System.out.println("�÷�������£�");
		for(int i:arr1){//������ֵ����Сֵ���ܷ�
			max = max>i?max:i;
			min = min<i?min:i;
			sum += i;
			System.out.print(i+" ");
		}
		System.out.println("------------------");
		System.out.println("\n���ֵΪ�� "+max);
		System.out.println("��СֵΪ�� "+min);
		System.out.println("�ܷ�Ϊ�� "+sum);
		sum = sum - (max+min);
		System.out.println("ȥ�������ͷֺ���ܷ�Ϊ�� "+sum);
		count = sum/6.0;
		System.out.println("ƽ����Ϊ�� "+count);
	}
}
