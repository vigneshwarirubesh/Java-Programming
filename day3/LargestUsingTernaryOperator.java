package day3;
//finding largest using ternary operator
import java.util.Scanner;
public class LargestUsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(((a>b?a:b)>c)) {
	System.out.println("The largest is: "+((a>b)?a:b));
}
else {
	System.out.println("The largest is: "+c);
}
s.close();
	}

}
