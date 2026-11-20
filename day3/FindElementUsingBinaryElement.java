package day3;
//to find an element using binary search
import java.util.Arrays;
public class FindElementUsingBinaryElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,1,43,45,78,65,77};
Arrays.sort(arr);
System.out.println("Sorted array:");
for(int x:arr) {
	System.out.println(x);
}
System.out.println(Arrays.binarySearch(arr,65));
System.out.println(Arrays.binarySearch(arr,100));
	}

}
