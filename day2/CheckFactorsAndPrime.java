package day2;
//finding factors and checking if a number is a prime or or not
import java.util.Scanner;
public class CheckFactorsAndPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter n value:");
int n=s.nextInt();
int factor=0;
for(int i=1;i<=n;i++) {
	if(n%i==0) {
		factor++;
	}
}
System.out.println("Factor of the number is:"+factor);
if(factor==2) {
	System.out.println("Prime number");
}
s.close();
	}

}
