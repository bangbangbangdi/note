
import java.util.Random;//�����
import java.util.Scanner;
public class Zuoye {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		Random r = new Random();
		int num1 = r.nextInt(1000); //���������
		int num2;
		while(true){
			System.out.println("����1~1000����");
			num2 = sc.nextInt();//���̽�����
			if(num2 == num1){
				System.out.println("��ϲ�㣬�¶���");
				break;
			}else if(num2 > num1){
				System.out.println("�´���");
			}else if(num2 < num1){
				System.out.println("��С��");		
			}else{
				System.out.println("�����������������");
			}
		}
		
	}
}