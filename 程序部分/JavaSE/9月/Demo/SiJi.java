public class Demo{
	public static void main(String[] args){
		Outer out = new Outer("小芳");
		out.outShow();
		Outer.Inner in = out.new Inner(27,927);
		in.inShow();
		
		Outer.Inner in1 = new Outer("小雪").new Inner(23,4396);
		in1.inShow();
		
		
		
		Outer.Inner2 in2 = new Outer.Inner2("霓霓",20);
		in2.show2();
	}
}
//外部类
class Outer{
	private String name;
	public Outer (String name){
		this.name = name;
	}
	//内部类
	public class Inner{
		private int age;
		private int number;
		public Inner(){
			
		}
		public Inner(int age,int number){
			this.age = age;
			this.number = number;
		}
		public void inShow(){
			//这里可以看到内部类可以访问外部类的private成员
			System.out.println(age+"-"+number+"-"+name);
		}
	}
	static class Inner2{
		private static String name2;
		private int age2;
		public Inner2(){
			
		}
		public Inner2(String name2,int age2){
		this.name2 = name2;
		this.age2 = age2;
		}
		
		public void show2(){
			Outer out = new Outer("外部类");
			System.out.println(out.name+"--"+name2+"--"+age2);
		}
	}
	
	public void outShow(){
		Inner in1 = new Inner(18,4399);
		//Inner2 in2 = new Inner2("内部类",7777);
        //访问时必须指明是哪个内部类对象
		in1.inShow();
		//in2.show2();
	}
	
}