package day1;
//finding vowel
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the letter");
char c=s.nextLine().charAt(0);
if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
	System.out.println("Vowel");
}
else {
	System.out.println("Not a vowel");
}
s.close();
	}

}
