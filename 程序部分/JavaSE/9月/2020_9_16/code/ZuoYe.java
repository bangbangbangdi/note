/*
��д���򣬸���һ��ѧ���ɼ�����ӡ����Ӧ�ȼ���
90~100 ����
80~89 ����
70~79 �е�
60~69 ����
0~59 ������
*/
public class ZuoYe{
	public static void main(String[] args){		
		int s = 78;//scores
		if(s<=100 && s>=90){
			System.out.println("����");
		}else if(s<90 && s>=80){
			System.out.println("����");
		}else if(s<80 && s>=70){
			System.out.println("�е�");
		}else if(s<70 && s>=60){
			System.out.println("����");
		}else if(s<60 && s>=0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}



		int s = -19;//scores
		if(s>100){
			System.out.println("��������");
		}else if(s>=90){
			System.out.println("����");
		}else if(s>=80){
			System.out.println("����");
		}else if(s>=70){
			System.out.println("�е�");
		}else if(s>=60){
			System.out.println("����");
		}else if(s>0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
		
	}
}