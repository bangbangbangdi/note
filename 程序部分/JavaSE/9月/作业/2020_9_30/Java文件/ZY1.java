/*
��д���򣬸���һ��ѧ���ɼ�����ӡ����Ӧ�ȼ���

96~100׿Խ
90~95 ����
80~89 ����
70~79 �е�
60~69 ����
0~59 ������ 
 */
import java.util.Scanner;
public class ZY1{//������һ����������
	public static void main(String[] args){//������
		Scanner s = new Scanner(System.in);//ʵ����һ��Scanner���� ������Ϊs
		System.out.println("������ѧ���ɼ���");//�����䲢����
		int chengJi = s.nextInt();//�ڿ���̨�����û����������
		String dengJi = "";//������һ���ַ��� ������ΪdengJi "" 
		if(chengJi >= 96 && chengJi <= 100){//if���
			dengJi = "׿Խ";
		}
		else if(chengJi >= 90){//90~95 ����
			dengJi = "����";
		}
		else if(chengJi >= 80){//80~89 ����
			dengJi = "����";
		}
		else if(chengJi >= 70){//70~79 �е�
			dengJi = "�е�";
		}
		else if(chengJi >= 60){//60~69 ����
			dengJi = "����";
		}
		else if(chengJi >= 0){//0~59 ������
			dengJi = "������";
		}
		else{
			System.out.println("�����������������룺");
		}
		System.out.println("��ѧ���ɼ��ȼ�Ϊ��"+dengJi);//��ӡ����Ӧ�ȼ�
	}
}