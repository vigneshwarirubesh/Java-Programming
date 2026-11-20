package day3;
//reversing a number using method
import java.util.Scanner;
public class ReversingaNumUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter num:");
int n=s.nextInt();
int rev=0;
while(n!=0) {
	int digit=n%10;
	rev=rev*10+digit;
	n=n/10;
}
System.out.println("Revered number:"+rev);
s.close();
	}

}
