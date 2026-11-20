package day5;
//Reading 1 array as input from the user and seperating the input into even no in 1 array and odd no in 1 array
import java.util.*;
public class EvenandOddInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n,i;
System.out.println("Enter size of the array:");
n=s.nextInt();
int arr[]=new int[n];
int even[]=new int[n];
int odd[]=new int[n];
System.out.println("Enter array elements:");
for(i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int j=0,k=0;
for(i=0;i<n;i++) {
	if(arr[i]%2==0){
		even[j]=arr[i];
		j++;
	}else {
		odd[k]=arr[i];
		k++;
	}
}
/*System.out.println("Even array:");  //way 1 of displaying the array
for(i=0;i<j;i++) {
	System.out.println(even[i]);
}
System.out.println("Odd array:");
for(i=0;i<k;i++) {
	System.out.println(odd[i]);*/
	System.out.println("Even array:"+Arrays.toString(even));//way 2 of displaying the array
	System.out.println("Odd array:"+Arrays.toString(odd));
s.close();
	}

}
