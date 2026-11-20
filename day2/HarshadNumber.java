package day2;
//take input from user and find if it is a harshad number or not
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
int n=s.nextInt();
int sum=0;
int temp=n;
while(n>0) {
	int r=n%10;
	sum=sum+r;
	n=n/10;
}
if(temp%sum==0) {
	System.out.println("It is a harshad number");
}
else {
	System.out.println("It is not a harshad number");
}
s.close();
	}

}
