/* 
��ABCD�ĸ�ѧϰС�飬A��3�ˣ�B��4�ˣ�C��3�ˣ�D��4�ˡ��ö�ά�������һ���򵥵ĳɼ�����ϵͳ��Ҫ��
1�����������û�������ѧ���ο��ɼ�������ϵͳ��
2��ȫ����������Ժ��ڿ���̨���������˵İ���δ�ӡ������ͬѧ�ο��ɼ���
3��֮�󣬿���̨��ʾ���ȴ��û������������
4���û�������������س���ϵͳ������Ӧ�ļ���ʹ�ӡ
5����ӡ��ɺ󣬿���̨������ʾ���ȴ��û����������������һ������

������˵����
find_Num1:����ʹ�ӡ���˷�����ͬѧ�ж��ٸ�������ÿ��ͬѧ���ڵ�С���ӡ��������������ʾ����find_80,������Ϊ80��
find_Num1_Num2:����ʹ�ӡ���˷��������ͬѧ�ж��ٸ�������ÿ��ͬѧ���ڵ�С���ӡ��������������ʾ����find_80_95,����������80��95��
exit���˳�ϵͳ
 */
import java.util.Scanner;

public class ZY7 {
	public static void main(String[] args) {
		int[][] tdArr = new int[4][];//������һ����ά����
		tdArr[0] = new int[3];//�涨һά����ĳ���
		tdArr[1] = new int[4];
		tdArr[2] = new int[3];
		tdArr[3] = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tdArr.length; i++) {//������ά���飬����ֵ
			for (int j = 0; j < tdArr[i].length; j++) {
				System.out.print("������" + (char) (65 + i) + "���" + (j + 1) + "��ѧ���ɼ���");
				tdArr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < tdArr.length; i++) {//��ӡ��ά��������Ԫ��
			System.out.println((char) (65 + i) + "��ĳɼ�Ϊ");
			for (int j = 0; j < tdArr[i].length; j++) {
				System.out.print(tdArr[i][j] + " ");
			}
			System.out.println();
		}
		
		while (true) {
			System.out.println("�����������");
			String str = sc.next();
			//split   find_50_80
			//split[0]="find"	,split[1]="50" ,split[2]="80"
			//split.length 3

			String[] split = str.split("_");
			if (split.length == 2) {
				int i1 = Integer.valueOf(split[1]);
				search(i1, tdArr);
			} else if (split.length == 3) {
				int i1 = Integer.valueOf(split[1]);
				int i2 = Integer.valueOf(split[2]);
				search(i1,i2, tdArr);
			} else if (str.equals("exit")) {
				break;
			}
		}
	}

	public static void search(int num, int[][] tdArr) {
		int count = 0;
		for (int i = 0; i < tdArr.length; i++) {
			for (int j = 0; j < tdArr[i].length; j++) {
				if (num == tdArr[i][j]) {
					count++;
					System.out.println("���ǵ�" + count + "��" + "�÷�Ϊ" + num + "��ͬѧ"+" ���ڷ���Ϊ"+(char) (65 + i));
				}
			}
		}
	}

	public static void search(int num1,int num2, int[][] tdArr) {
		int count = 0;
		for (int i = 0; i < tdArr.length; i++) {
			for (int j = 0; j < tdArr[i].length; j++) {
				if ((num1<=tdArr[i][j])&&(num2>=tdArr[i][j])) {
					count++;
					System.out.println("���ǵ�" + count + "��" + "��������" + num1+"-"+num2 + "��ͬѧ"+" ���ڷ���Ϊ"+(char) (65 + i));
				}
			}
		}
	}
}