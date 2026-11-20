package day1;
//to make user enter a greeting message and display it
import java.util.Scanner;
public class GreetingMessageDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter your Greeting!!");
String g=s.nextLine();
System.out.println(g);
s.close();
	}

}
