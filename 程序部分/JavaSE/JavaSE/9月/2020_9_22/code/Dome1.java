/* 

 */
public class Dome1{
	public static void main(String[] args){
		int[][] Array = new int[3][];
		int[] myArray1 = {1,3,4,6};
		int[] myArray2 = {1,2,8,5};
		int[] myArray3 = {4,7,8,9};
		Array[0] = myArray1;
		Array[1] = myArray2;
		Array[2] = myArray3;
		System.out.println(Array);
		System.out.println(Array[0]);
		System.out.println(Array[1]);
		System.out.println(Array[2]);
	}
}