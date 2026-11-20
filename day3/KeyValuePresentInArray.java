package day3;
//take key value from user and check if that value is present in array or not
import java.util.Scanner;
public class KeyValuePresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter size:");
int n=s.nextInt();
System.out.println("Enter key value:");
int k=s.nextInt();
int flag=0;
int arr[]=new int[n];
System.out.println("Enter elements:");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	if(arr[i]==k) {
		flag=1;
	}
}
if(flag==1) {
    System.out.println("Element found");
}
else {
	System.out.println("Element not found");
}
s.close();
	}

}
