package day2;
//washing machine problem for estimating time according to weight
import java.util.Scanner;
public class EstimatingTimeAccordingToWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int c=s.nextInt();
if(c>=0&&c<=2000) {
	System.out.println("Time Estimated:25 mins");
}
else if(c>=2001&&c<=4000) {
	System.out.println("Time Estimated:35 mins");
}
else if(c>4000&&c<=7000) {
	System.out.println("Time Estimated:45 mins");
}
else if(c>7000) {
	System.out.println("OVERLOADED");
}
else {
	System.out.println("INVALID");
}
s.close();
	}

}
