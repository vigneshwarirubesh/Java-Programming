package day5;
//Multi-level inheritance
class Aa{
	String colour="white";
	void sleep() {
		System.out.println("Animal sleeping");
	}
}
class Bb extends Aa{
	void eat() {
		System.out.println("Dog eating");
	}
}
class Cc extends Bb{
	void cry() {
		System.out.println("Puppy crying");
	}
}
public class MultiLevelInheritanceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cc p=new Cc();
p.eat();
p.sleep();
p.cry();
System.out.println(p.colour);
}
}