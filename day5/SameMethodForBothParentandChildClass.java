package day5;
//parent class and child class uses the same method(method overriding-when both parent and child class has same method using obj of child class only child method is called)
class Ani{
	void eat() {
		System.out.println("Animal eats");
	}
}
class Do extends Ani{
	void eat() {
		System.out.println("Dog eats");
		super.eat();//for displaying the method in parent class as both the methods have same name
	}
}
public class SameMethodForBothParentandChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ani a=new Ani();
Do d=new Do();
//a.eat();
d.eat();
	}

}
