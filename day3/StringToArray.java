package day3;
//string to array
import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=s.nextLine();
		System.out.println("Entered String:"+s1);
		char charray[]=s1.toCharArray();
		System.out.println("Char Array:");
		for(int i=0;i<charray.length;i++) {
			System.out.println(charray[i]);	
		}
		s.close(); 
	}

}
