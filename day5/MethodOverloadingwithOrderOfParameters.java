package day5;

public class MethodOverloadingwithOrderOfParameters {
	public static int add(int x,float y) {
		int sum=(int)(x+y);
		return sum;
	}
	public static float add(float x,int y) {
		float sum=x+y;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(add(10,50.0f));
System.out.println(add(36.0f,10));
	}
}
