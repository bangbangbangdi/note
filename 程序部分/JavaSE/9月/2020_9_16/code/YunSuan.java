/*
算术运算符: + , - , * ,/ , %
自增运算符: ++a(先加一，再调用), a++（先调用，再加以）, --a(先减一，再调用), a--（先调用，再减以一）
比较运算符：<,<=,>,>=,==,!=
逻辑运算符: && , || , !
赋值运算符: =, +=, -=, *=, /=, %=
*/





public class YunSuan{
	public static void main(String[] args){
/* 		int a = 10 , b = 5, c = 4 ;
		int i = 'a';//97
		int d = 10 + i;
		System.out.println(a+b);//15
		System.out.println(a-b);//5
		System.out.println(a*b);//50
		System.out.println(a/b);//2
		System.out.println(a%b);//0
		System.out.println(d);//107 */
		
/* 		int a = 10,b=10;
		System.out.println(++a);//11
		System.out.println(b++);//10
		System.out.println(--a);//10
		System.out.println(b--);//11
		System.out.println(b);//10 */
		
/* 		int a=10,b=8;
		boolean b1 = a==b;//false
		boolean b2 = a!=b;//true
		System.out.println(b1);
		System.out.println(b2);
 */		
		//与  布尔值1 && 布尔值2
		// true && true true
		// true && false false
		// false && false false
		// false && true false
/* 		int a=10,b=5,c=3; 
		boolean b1 = a>b && b>c;//true
		boolean b2 = a>b && b<c;//false
		boolean b3 = a<b && b<c;//false
		boolean b4 = a>b && b<c;//false */
/* 		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4); */
		
		//或 布尔值1 || 布尔值2
		// true || true true
		// true || false true
		// false || false false
		// false || true true
		/* int a=10,b=5,c=3; 
		boolean b1 = a>b || b>c;//true
		boolean b2 = a>b || b<c;//true
		boolean b3 = a<b || b<c;//false
		boolean b4 = a>b || b<c;//true
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4); */
		
		//非 !布尔值
		// !true  false
		// !false true
/* 		int a=10,b=5,c=3; 
		boolean b1 = !(a<b);//true
		boolean b2 = !(a>b);//false
		System.out.println(b1);
		System.out.println(b2); */
		
		//赋值运算符: =, +=, -=, *=, /=, %=
		//              a%=3;a=a%3;
		
/* 			int a = 3;
			int x,y,z;
			x = y = z = 4;
			System.out.println(a);//3
			a += 3;
			System.out.println(a);//6
			a -= 4;
			System.out.println(a);//2
			a *= 3;
			System.out.println(a);//6
			a /= 4;//a= 6/4=1;
			System.out.println(a);//1
			a %= 3;//1%3
			System.out.println(a);//1 */
		
		
	}
}