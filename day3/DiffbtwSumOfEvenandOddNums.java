package day3;
//diff btw the sum of even and odd numbers in a element
import java.util.Scanner;
public class DiffbtwSumOfEvenandOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter size:");
int n=s.nextInt();
int arr[]=new int[n];
int sum1=0;
int sum2=0;
System.out.println("Enter array elements:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	if(arr[i]%2!=0) {
		sum1=sum1+arr[i];
	}
	else {
		sum2=sum2+arr[i];
	}
}
System.out.println("sum of odd numbers:"+sum1);
System.out.println("sum of even numbers:"+sum2);
System.out.println(Math.abs(sum2-sum1));
s.close();
	}

}
