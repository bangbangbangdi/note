/*
编写程序，给定一个学生成绩，打印出相应等级：

96~100卓越
90~95 优秀
80~89 良好
70~79 中等
60~69 及格
0~59 不及格 
 */
import java.util.Scanner;
public class ZY1{//定义了一个公开的类
	public static void main(String[] args){//主方法
		Scanner s = new Scanner(System.in);//实例化一个Scanner对象 对象名为s
		System.out.println("请输入学生成绩：");//输出语句并换行
		int chengJi = s.nextInt();//在控制台接受用户输入的数据
		String dengJi = "";//定义了一个字符串 对象名为dengJi "" 
		if(chengJi >= 96 && chengJi <= 100){//if语句
			dengJi = "卓越";
		}
		else if(chengJi >= 90){//90~95 优秀
			dengJi = "优秀";
		}
		else if(chengJi >= 80){//80~89 良好
			dengJi = "良好";
		}
		else if(chengJi >= 70){//70~79 中等
			dengJi = "中等";
		}
		else if(chengJi >= 60){//60~69 及格
			dengJi = "及格";
		}
		else if(chengJi >= 0){//0~59 不及格
			dengJi = "不及格";
		}
		else{
			System.out.println("输入有误，请重新输入：");
		}
		System.out.println("该学生成绩等级为："+dengJi);//打印出相应等级
	}
}