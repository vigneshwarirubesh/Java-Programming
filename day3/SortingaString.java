package day3;
//sorting a string
import java.util.Scanner;
import java.util.Arrays;
public class SortingaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=s.nextLine();
		char ch[]=s1.toCharArray();
		Arrays.sort(ch);
		System.out.println("After sorting");
		for(char x:ch) {
			System.out.println(x);
		}
		s.close();
	}

}
