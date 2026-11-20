package day4;
//generate a palindrome in given range
import java.util.Scanner;
public class GeneratePalindromeInRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter range:");
int n1=s.nextInt();
int n2=s.nextInt();
System.out.println("The palindromes are:");
int i;
for(i=n1;i<=n2;i++) {
	int temp=i;
	int rev=0;
	while(temp>0) {
		int digit=temp%10;
		rev=rev*10+digit;
		temp=temp/10;
	}
	if(i==rev) {
		System.out.println(i+" ");
	}
}
s.close();
	}

}
