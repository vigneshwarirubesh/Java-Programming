package day5;
//sample single inheritance
class Animal{
	String colour="white";
	void sleep() {
		System.out.println("Animal sleeping");
	}
}
class dog extends Animal{
	void eat() {
		System.out.println("Dog eating");
	}
}
public class InheritanceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d=new dog();
d.eat();
d.sleep();
System.out.println(d.colour);
	}

}
