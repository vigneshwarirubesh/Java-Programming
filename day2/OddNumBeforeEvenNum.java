package day2;
import java.util.*;
//algorithm to arrange the given list such as all odd numbers comes after even numbers
public class OddNumBeforeEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=s.nextInt();
int arr[]=new int[n];        		
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
	arr[i] = s.nextInt();
}		
int left = 0;
int right = arr.length - 1;
while (left < right) {			
while (arr[left] % 2 == 0 && left < right) {
	left++;
}			
while (arr[right] % 2 != 0 && left < right) {
	right--;
}
if (left < right) {
	int temp = arr[left];
	arr[left] = arr[right];
	arr[right] = temp;
	left++;
	right--;
}
}
System.out.println("Rearranged array (Odd numbers after Even numbers):");
System.out.println(Arrays.toString(arr));
s.close();
	}
}
        