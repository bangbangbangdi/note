
import java.util.Scanner;
public class ZuoYe{
	public static void main(String[] args){
		int[][] tdArr = new int[4][];
		int[] arr1 = new int[3];
		int[] arr2 = new int[4];
		int[] arr3 = new int[3];
		int[] arr4 = new int[4];
		tdArr[0] = arr1;
		tdArr[1] = arr2;
		tdArr[2] = arr3;
		tdArr[3] = arr4;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<tdArr.length;i++){
			for(int j=0;j<tdArr[i].length;j++){
				System.out.print("请输入"+(char)(65+i)+"组第"+(j+1)+"个学生成绩：");
				tdArr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<tdArr.length;i++){
			System.out.println((char)(65+i)+"组的成绩为");
			for(int j=0;j<tdArr[i].length;j++){
				System.out.print(tdArr[i][j]+" ");
			}
			System.out.println();
		}
		while(true){
			System.out.println("请输入操作符");
			String str = sc.nextLine();
			switch(str){
				case "avg_All":{
					int zong = sum(tdArr);
					double avg = zong/14.0;
					System.out.println(avg);
					break;
				}
				case "avg_A":{
					int zong = sum(tdArr,0);
					double avg = zong/3.0;
					System.out.print("A组的平均分为");
					System.out.println(avg);
					break;
				}
				case "avg_B":{
					int zong = sum(tdArr,1);
					double avg = zong/4.0;
					System.out.print("B组的平均分为");
					System.out.println(avg);
					break;
				}
				case "avg_C":{
					int zong = sum(tdArr,2);
					double avg = zong/3.0;
					System.out.print("C组的平均分为");
					System.out.println(avg);
					break;
				}
				case "avg_D":{
					int zong = sum(tdArr,3);
					double avg = zong/4.0;
					System.out.print("D组的平均分为");
					System.out.println(avg);
					break;
				}
				case "max":{
					int max = max_min(tdArr)[0];
					System.out.print("最高分为：");
					System.out.println(max);
					break;
				}
				case "min":{
					int min = max_min(tdArr)[1];
					System.out.print("最低分为：");
					System.out.println(min);
					break;
				}
			}
			if(str.equals("exit")){
				break;
			}
		}
	}
	public static int sum(int[][] tdArr){
		int sum = 0;
		for(int i=0;i<tdArr.length;i++){
			for(int j=0;j<tdArr[i].length;j++){
				sum += tdArr[i][j];
			}
		}
		return sum;
	}
	public static int sum(int[][] tdArr,int i){
		int sum = 0;		
		for(int j=0;j<tdArr[i].length;j++){
			sum += tdArr[i][j];
		}
		return sum;
	}
	public static int[] max_min(int[][] tdArr){
		int max = tdArr[0][0];
		int min = tdArr[0][0];
		for(int i=0;i<tdArr.length;i++){
			for(int j=0;j<tdArr[i].length;j++){
				max = max>tdArr[i][j]?max:tdArr[i][j];
				min = min<tdArr[i][j]?min:tdArr[i][j];
			}
		}
		int[] arr = {max,min};
		return arr;
	}
}