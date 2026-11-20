package day1;
//prg using scanner and getting sum&average
import java.util.Scanner;
public class SumAverageUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner i=new Scanner(System.in);
System.out.println("Enter 3 numbers:");
int n=i.nextInt();
int s=i.nextInt();
int v=i.nextInt();
int sum=n+s+v;
System.out.println("Sum="+sum);
double average=sum/3.0;
//or float average=sum/3.0f or avg=(float)sum/3 
System.out.println("Average="+average);
i.close();
	}

}
