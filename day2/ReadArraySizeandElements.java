package day2;
//to read array size and elements from user and display its
import java.util.Scanner;
public class ReadArraySizeandElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter array size:");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println("Array elements using for loop:");
for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
}
s.close();
	}

}
