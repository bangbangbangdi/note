public class Demo{
	public static void main(String[] args){
		Outer out = new Outer("С��");
		out.outShow();
		Outer.Inner in = out.new Inner(27,927);
		in.inShow();
		
		Outer.Inner in1 = new Outer("Сѩ").new Inner(23,4396);
		in1.inShow();
		
		
		
		Outer.Inner2 in2 = new Outer.Inner2("����",20);
		in2.show2();
	}
}
//�ⲿ��
class Outer{
	private String name;
	public Outer (String name){
		this.name = name;
	}
	//�ڲ���
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
			//������Կ����ڲ�����Է����ⲿ���private��Ա
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
			Outer out = new Outer("�ⲿ��");
			System.out.println(out.name+"--"+name2+"--"+age2);
		}
	}
	
	public void outShow(){
		Inner in1 = new Inner(18,4399);
		//Inner2 in2 = new Inner2("�ڲ���",7777);
        //����ʱ����ָ�����ĸ��ڲ������
		in1.inShow();
		//in2.show2();
	}
	
}