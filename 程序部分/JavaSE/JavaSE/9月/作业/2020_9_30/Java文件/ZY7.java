/* 
有ABCD四个学习小组，A组3人，B组4人，C组3人，D组4人。用二维数组设计一个简单的成绩管理系统。要求：
1、首先引导用户将所有学生段考成绩都输入系统，
2、全部输入完毕以后，在控制台上整洁明了的按班次打印出所有同学段考成绩。
3、之后，控制台提示并等待用户输入操作符，
4、用户输入操作符并回车后，系统进行相应的计算和打印
5、打印完成后，控制台继续提示并等待用户输入操作符进行下一个操作

操作符说明：
find_Num1:计算和打印出此分数的同学有多少个，并把每个同学所在的小组打印出来。（操作符示例：find_80,即分数为80）
find_Num1_Num2:计算和打印出此分数区间的同学有多少个，并把每个同学所在的小组打印出来。（操作符示例：find_80_95,即分数区间80到95）
exit：退出系统
 */
import java.util.Scanner;

public class ZY7 {
	public static void main(String[] args) {
		int[][] tdArr = new int[4][];//定义了一个二维数组
		tdArr[0] = new int[3];//规定一维数组的长度
		tdArr[1] = new int[4];
		tdArr[2] = new int[3];
		tdArr[3] = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tdArr.length; i++) {//遍历二维数组，并赋值
			for (int j = 0; j < tdArr[i].length; j++) {
				System.out.print("请输入" + (char) (65 + i) + "组第" + (j + 1) + "个学生成绩：");
				tdArr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < tdArr.length; i++) {//打印二维数组所有元素
			System.out.println((char) (65 + i) + "组的成绩为");
			for (int j = 0; j < tdArr[i].length; j++) {
				System.out.print(tdArr[i][j] + " ");
			}
			System.out.println();
		}
		
		while (true) {
			System.out.println("请输入操作符");
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
					System.out.println("这是第" + count + "名" + "得分为" + num + "的同学"+" 所在分组为"+(char) (65 + i));
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
					System.out.println("这是第" + count + "名" + "符合区间" + num1+"-"+num2 + "的同学"+" 所在分组为"+(char) (65 + i));
				}
			}
		}
	}
}