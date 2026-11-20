package day4;
//finding total distance btw adjacent items of a list of 5 numbers
import java.util.Scanner;
public class DistancebtwAdjacentNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter size:");
int n=s.nextInt();
int d;
int sum=0;
int arr[]=new int[n];
System.out.println("Enter elements:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
for(int i=0;i<n-1;i++) {
	d=Math.abs(arr[i]-arr[i+1]);
	sum=sum+d;
}
System.out.println(sum);
s.close();
	}

}
