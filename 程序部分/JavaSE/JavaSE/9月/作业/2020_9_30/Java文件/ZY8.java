/* 
有1，2，3，4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？把他们都打印出来，并统计总数。
 */
public class ZY8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if((i!=j)&&(j!=k)&&(k!=i)) {//确定三个数字互不相同
						System.out.println(i*100+j*10+k);
						System.out.println(""+i+j+k);
					}
				}
			}
		}
	}
}
