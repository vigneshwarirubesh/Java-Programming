package day2;
//to find if a number is amstrong number or not
import java.util.Scanner;
public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
int digit,sum=0,temp;
temp=n;
while(n!=0) {
	digit=n%10;
	sum=sum+(digit*digit*digit);
	n=n/10;
}
if(temp==sum){
	System.out.println("It is an Amstrong number");
}
else {
	System.out.println("Not an Amstrong number");
}
s.close();
	}
}
