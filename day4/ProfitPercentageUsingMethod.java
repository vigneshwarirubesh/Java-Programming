package day4;
//find the profit percentage if selling price>cost price or loss percentage if cost
import java.util.Scanner;
public class ProfitPercentageUsingMethod{
	public static float ProfitOrLoss(float sp,float cp){
		float result;
		if(sp>cp){
			result=(sp-cp)*100/cp;
		}else {
			result=(cp-sp)*100/cp;
	    }
		return (result*100)/100.0f;
	}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter selling prize:");
			float sp=s.nextFloat();
			System.out.println("Enter cost prize:");
			float cp=s.nextFloat();
			System.out.println(ProfitOrLoss(sp,cp));
			s.close();
	}

}
