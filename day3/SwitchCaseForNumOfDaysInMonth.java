package day3;
//using switch case to print the no. of days in a month
import java.util.Scanner;
public class SwitchCaseForNumOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the month:");
int n=s.nextInt();
switch(n) {
case 1: case 3: case 5: case 9: case 11:
	System.out.println("30 days");
	break;
case 4: case 6: case 7: case 8: case 10: case 12:
	System.out.println("31 days");
	break;
case 2:
	System.out.println("28 days");
	break;
default:
	System.out.println("INVALID MONTH");
	break;
}
s.close();
	}

}
