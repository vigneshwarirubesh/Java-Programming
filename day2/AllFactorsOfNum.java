package day2;
//printing all the factors of a number
import java.util.Scanner;

public class AllFactorsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		s.close();
	}

}
