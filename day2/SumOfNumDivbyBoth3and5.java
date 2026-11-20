package day2;
//sum of all the numbers div by both 3 & 5
import java.util.Scanner;
public class SumOfNumDivbyBoth3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter m value:");
System.out.println("Enter n value:");
int m=s.nextInt();
int n=s.nextInt();
int sum=0;
for(int i=m;i<=n;i++) {
	if(i%3==0&&i%5==0){
		sum=sum+i;
	}
}
System.out.println(sum);
s.close();
	}

}
