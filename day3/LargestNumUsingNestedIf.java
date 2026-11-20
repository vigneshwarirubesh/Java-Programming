package day3;
//finding largest number using nested if statements
import java.util.Scanner;
public class LargestNumUsingNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the numbers:");
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
if(n1>n2&&n1>n3) {
	System.out.println("The largest number is "+n1);
}
if(n2>n1&&n2>n3) {
	System.out.println("The largest number is "+n2);
}
if(n3>n1&&n3>n2){
	System.out.println("The largest number is "+n3);
}
s.close();
	}

}
