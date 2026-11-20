package day2;
//read a number from user and check if the number is a perfect number
import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
int sum=0;
for(int i=1;i<n;i++) {
	if(n%i==0) {
		System.out.println(i);
		sum=sum+i;
	}
}
if(n==sum) {
	System.out.println("Perfect number");
}
else {
	System.out.println("Not a perfect number");
}
s.close();
	}

}
