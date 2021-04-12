/*
条件语句 - if...else
*/



public class IfYuJu{
	public static void main(String[] args){
		int age = 17;
		if(age>18){
			System.out.println("可以玩！！！");
		}else if(age>=17){
			System.out.println("自行把握~");
		}else if(age>=16){
			System.out.println("适当玩玩~");
		}else{
			System.out.println("别玩啦，学习去！！");
		}
	}
}