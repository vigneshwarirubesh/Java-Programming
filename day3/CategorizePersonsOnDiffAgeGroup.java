package day3;
//categorize persons on diff age group as child,teen and adult
import java.util.Scanner;
public class CategorizePersonsOnDiffAgeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter age:");
int n=s.nextInt();
if(n<=12) {
	System.out.println("Child");
}
else if(n>=13&&n<=19) {
	System.out.println("Teen");
}
else {
	System.out.println("Adult");
}
s.close();
	}

}
