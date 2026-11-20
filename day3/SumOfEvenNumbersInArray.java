package day3;
//sum of even numbers in an array
import java.util.Scanner;
public class SumOfEvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter size:");
int n=s.nextInt();
int arr[]=new int[n];
int sum=0;
System.out.println("Enter array elements:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	if(arr[i]%2==0){
		sum=sum+arr[i];
	}
}
System.out.println("Sum of even elements:"+sum);
s.close();
	}

}
