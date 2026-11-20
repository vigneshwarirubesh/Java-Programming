package day2;
//to find factorial of a number(put int(ma'am thought) in place of double)
import java.util.Scanner;
public class FactorialOfNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter n value:");
double n=s.nextDouble();
double fact=1;
if(n<0) {
	System.out.println("INVALID");
}
for(double i=1;i<=n;i++) {
	fact=fact*i;
}
System.out.println(fact);
s.close();
	}

}
