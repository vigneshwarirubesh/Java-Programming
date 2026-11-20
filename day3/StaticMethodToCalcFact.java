package day3;
//implement a static method to calc factorial of a number(static method does'nt require a object) also while going for instance method just remove the static
import java.util.Scanner;
 public class StaticMethodToCalcFact {
	public static int factorial(int n){
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter no:");
int n=s.nextInt();
System.out.println(factorial(n));
s.close();
	}

}
