package day5;

public class MethodOverloadingWithNoofParameters {
	public static int add(int x,int y) {
		int sum=x+y;
		return sum;
	}
	public static int add(int x,int y,int z) {
		int sum=x+y+z;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("sum="+add(10,20));
System.out.println("sum="+add(30,40,50));
	}

}
