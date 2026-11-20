package day5;
//diff classes for abstract class bank
abstract class bank{
	abstract void RateOfInterest();
}
class SBI extends bank{
	public void RateOfInterest(){
		System.out.println("The rate of interest is 20%");
	}
}
class canara extends bank{
	public void RateOfInterest(){
		System.out.println("The rate of interest is 15%");
	}
}
class indian extends bank{
	public void RateOfInterest(){
		System.out.println("The rate of interest is 10%");
	}
}
public class AbstractClassBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank s=new SBI();
s.RateOfInterest();
bank c=new canara();
c.RateOfInterest();
bank i=new indian();
i.RateOfInterest();
	}
}
