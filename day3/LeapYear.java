package day3;
//to check if a year is leap year or not
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the year:");
int year=s.nextInt();
if((year%4==0&&year%100!=0)||(year%400==0)){
	System.out.println("This is a leap year "+year);
}
else {
	System.out.println("This is not a leap year "+year);
}
s.close();
	}

}
