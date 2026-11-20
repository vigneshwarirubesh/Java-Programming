package day4;
//finding distance btw adjacent numbers using method 
import java.util.Scanner;
public class UsingMethodDistancebtwAdajcent {
	public static int Distance(int n,int arr[]){
		int sum=0;
		int d;
		for(int i=0;i<n-1;i++) {
			d=Math.abs(arr[i]-arr[i+1]);
			sum=sum+d;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter size:");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(Distance(n,arr));
s.close();
	}

}
