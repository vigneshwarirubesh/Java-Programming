package day1;
//Arithmetic operator
import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter x and y value:");
int x=s.nextInt();
int y=s.nextInt();
System.out.println("x==y "+(x==y));
System.out.println("x>y "+(x>y));
System.out.println("x<y "+(x<y));
System.out.println("x>=y "+(x>=y));
System.out.println("x<=y "+(x<=y));
System.out.println("x!=y "+(x!=y));
s.close();	
	}

}
