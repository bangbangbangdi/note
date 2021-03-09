/* 
在作业二的代码基础上实现：对折每一次都打印出当前对折的次数，以及当前的厚度。使用continue语句，让对折到第10次的时候不打印任何内容，使用break语句，让对折完第15次后跳出循环。
 */
public class ZY3 {
	public static void main(String[] args) {
		double d1 = 8848130;
		int count = 0;
		for (double d2 = 0.08; d2 <= d1; d2 *=2) {
			count++;
			if(count==10)continue;//continue:结束本次循环，马上开始下一次循环
			System.out.println("当前是第 "+count+"次对折");
			System.out.println("当前的厚度为： "+ d2*2);
			if(count==15)break;//结束所在的循环
		}
	}
}