package day5;
//calculating salry using basicpay and bonus
class employee{
	int Bonus=10000;
}
class programmer extends employee{
	int basicpay=25000;
	int salary=basicpay+Bonus;
}
public class CalcSalaryUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
programmer p=new programmer();
System.out.println("The basic pay of a programmer is:"+p.basicpay);
System.out.println("The bonus given to a programmer is:"+p.Bonus);
System.out.println("The salary of a programmer is:"+p.salary);
	}

}
