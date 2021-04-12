/* 
Continue:跳出离它最近的，当前的，仅仅这一次循环
 */

public class Continue_{
	public static void main(String[] args){
		int i = 0;
		while (i<=9){
			i++;
			if(i==4){
				continue;
			}
			System.out.println(i);
		}
	}
}