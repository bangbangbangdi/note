/*
编写程序，给定一个学生成绩，打印出相应等级：
90~100 优秀
80~89 良好
70~79 中等
60~69 及格
0~59 不及格
*/
public class ZuoYe{
	public static void main(String[] args){		
		int s = 78;//scores
		if(s<=100 && s>=90){
			System.out.println("优秀");
		}else if(s<90 && s>=80){
			System.out.println("良好");
		}else if(s<80 && s>=70){
			System.out.println("中等");
		}else if(s<70 && s>=60){
			System.out.println("及格");
		}else if(s<60 && s>=0){
			System.out.println("不及格");
		}else{
			System.out.println("输入有误");
		}



		int s = -19;//scores
		if(s>100){
			System.out.println("输入有误");
		}else if(s>=90){
			System.out.println("优秀");
		}else if(s>=80){
			System.out.println("良好");
		}else if(s>=70){
			System.out.println("中等");
		}else if(s>=60){
			System.out.println("及格");
		}else if(s>0){
			System.out.println("不及格");
		}else{
			System.out.println("输入有误");
		}
		
	}
}