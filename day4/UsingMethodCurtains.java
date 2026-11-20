package day4;
//find how many curtains with length 12 using method 
import java.util.Scanner;
public class UsingMethodCurtains {
	public static int Total(int n,int arr[]) {
		int i;
		int sum=0;
		for(i=0;i<n;i++) {
			sum=sum+arr[i]/12;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sizes:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Total(n,arr));
		s.close();
	}

}
