package day4;
//calculate the sum of numbers divisible by both 3 & 5 btw m & n using method
import java.util.Scanner;
public class SumOfNumDivbyBoth3and5UsingMethod {
	public static int Sum(int n1,int n2) {
		int r=0;
		for(int i=n1;i<=n2;i++) {
			if(i%3==0&&i%5==0) {
				r=r+i;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers:");
int n1=s.nextInt();
int n2=s.nextInt();
System.out.println(Sum(n1,n2));
s.close();
	}
}
