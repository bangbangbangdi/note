import java.util.Scanner;
/* 
在歌唱比赛中，共有8位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，然后剩余的6位评委的分数进行平均，就是该选手的最终得分。要求循环输入6个评委的评分，打印出该选手的最终得分。要求基于数组来实现。
 */

public class ZY5 {
	public static void main(String[] args) {
		int[] arr1 = new int[8];//定义了一个arr1数组
		Scanner s = new Scanner(System.in);
		for(int i=0;i<8;i++){//遍历数组并赋值
			System.out.println("请输入第"+(i+1)+"位评委的得分：");
			arr1[i] = s.nextInt();
		}
		int max = arr1[0];//最高分
		int min = arr1[0];//最低分
		int sum = 0;//总分
		double count = 0;//平均分
		System.out.println("------------------");
		System.out.println("得分情况如下：");
		for(int i:arr1){//求出最大值，最小值，总分
			max = max>i?max:i;
			min = min<i?min:i;
			sum += i;
			System.out.print(i+" ");
		}
		System.out.println("------------------");
		System.out.println("\n最大值为： "+max);
		System.out.println("最小值为： "+min);
		System.out.println("总分为： "+sum);
		sum = sum - (max+min);
		System.out.println("去掉最高最低分后的总分为： "+sum);
		count = sum/6.0;
		System.out.println("平均分为： "+count);
	}
}
