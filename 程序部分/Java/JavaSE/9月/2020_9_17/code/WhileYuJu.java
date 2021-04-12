/* 
while循环:
		while(布尔表达式){
				//循环体
			}
do ... while循环:
		do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

continue 关键字:
		continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。

		在 for 循环中，continue 语句使程序立即跳转到更新语句。

		在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
		
break 关键字:
		break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块
		break 跳出最里层的循环，并且继续执行该循环下面的语句
		
 */


public class WhileYuJu{
	public static void main(String[] args){
		double i=1,sum=0,h=100;
		while(i<=10){
			sum+=h;//sum = sum + h;
			h=h/2;//h = h / 2;
			sum+=h;
			System.out.println("这是第"+i+"次下落");
			System.out.println("总共经过了"+sum+"米"+"， 反弹高度为："+h+"米");
			System.out.println("------------------------");
			
			i++;
		}
		
/* 		int i=100;
		do{
			System.out.println(++i);
		}while(i<=9); */
		
			//break语句
/* 		int i = 1;		
		while(i<=3){
			int j = 1;
			System.out.println("这是外层的第"+ i +"次循环");
			System.out.println("--------------------------");
			i++;
			while(j<=5){
				if(j==2){
					break;//仅仅只是跳出当前的循环语句
				}
				System.out.println("这是内层的第"+ j +"次循环");
				j++;
			}
		System.out.println("--------------------------");
		}
		 */
	}
}