/* 
“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡一钱三只，现有百钱欲买百鸡，共有多少种买法？
x+y+z == 100;
5*x+3*y+1/3*z ==100;
0 x 20
0 y 33
0 z 300
 */
public class ZY4 {
	public static void main(String[] args) {
		//x 公鸡 y 母鸡 z 小鸡
		for (int x = 0; x <= 20; x++) {
			for (int y = 0; y <= 33; y++) {
				int z = 100 - x - y;
				if((z%3==0)&&(x*5+y*3+z/3==100)) {
					System.out.println("公鸡的个数为："+x+"母鸡的个数为："+y+"小鸡的个数为："+z);
				}
			}
		}
	}
}