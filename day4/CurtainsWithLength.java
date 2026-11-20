package day4;
//find how many curtains with length 12 
import java.util.Scanner;
public class CurtainsWithLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the sizes:");
int n=s.nextInt();
int sum=0;
int c;
int arr[]=new int[n];
System.out.println("Enter the values:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	c=arr[i]/12;
	sum=sum+c;
}
System.out.println(sum);
s.close();
	}

}
