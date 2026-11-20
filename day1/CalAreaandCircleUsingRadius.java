package day1;
//using scanner to cal area of a circle using radius
import java.util.Scanner;
public class CalAreaandCircleUsingRadius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter radius:");
float r=s.nextFloat();
float area=3.14159f*r*r;
System.out.println("Area="+area);
s.close();
	}

}
