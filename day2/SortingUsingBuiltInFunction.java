package day2;
//sorting array using your built in functions
import java.util.Scanner;
import java.util.Arrays;
public class SortingUsingBuiltInFunction {

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
		Arrays.sort(arr);
s.close();
	}

}
