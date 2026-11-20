package day2;
//take a number from user and decide if its a strong number or not
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
int n=s.nextInt();
int sum=0;
int temp=n;
while(n>0) {
	int r=n%10;
	int fact=1;
    for(int i=1;i<=r;i++) {
	     fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
}
if(temp==sum) {
	System.out.println("It is a strong number");
}
else {
	System.out.println("It is not a strong number");
}
s.close();
	}

}
