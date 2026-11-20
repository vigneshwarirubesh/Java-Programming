package day5;
//do that two array prg using array list
import java.util.Scanner;
import java.util.ArrayList;
public class EvenandOddInTwoArraysUsingArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size:");
int n=s.nextInt();
ArrayList<Integer> even=new ArrayList<Integer>();
ArrayList<Integer> odd=new ArrayList<>();
System.out.println("Enter elements:");
for(int i=0;i<n;i++) {
	int num=s.nextInt();
	if(num%2==0) {
		even.add(num);
	}
	else {
		odd.add(num);
	}
}
System.out.println("Even elements:"+even);
System.out.println("Odd elements:"+odd);
s.close();
	}
}
