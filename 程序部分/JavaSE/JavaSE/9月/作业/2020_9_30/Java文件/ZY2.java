/* 
一张纸的厚度是0.08mm，对折多少次以后能达到珠穆朗玛峰的高度（8848.13m），将它打印出来。要求用for实现。
 */
public class ZY2 {
	////这里需要明确的是1m==1000mm
	public static void main(String[] args) {
		double d1 = 8848130;//珠穆朗玛峰的高度
		int count = 0;
		//d1 珠穆朗玛峰的高度  d2 纸的厚度 count纸张的对折次数 
		for (double d2 = 0.08; d2 <= d1; d2 *=2) {
			count++;
			System.out.println("现在是第 "+count+"次");
		}	
	}
}