package day1;
//check if a number is positive or negative or equal to zero
import java.util.Scanner;
public class NumPosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
int l=s.nextInt();
if(l>0) {
	System.out.println("Positive number");
}
else if(l<0) {
	System.out.println("Negative number");
}
else{
	System.out.println("Equal to zero");
}
s.close();
	}

}
