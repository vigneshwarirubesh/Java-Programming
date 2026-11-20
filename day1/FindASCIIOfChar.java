package day1;
//prg to read a char & find its ASCII value
import java.util.Scanner;
public class FindASCIIOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a char:");
char l=s.nextLine().charAt(0);
System.out.println("The character is:"+l);
System.out.println("ASCII value="+(int)l);
s.close();
	}
}
