package day5;
//using abstract class we could never get 100% (only 0-99%) as even in this prg we used obj to call the class
abstract class shape{
	abstract void draw(); 
}
class rectangle extends shape{
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}
class circle extends shape{
	public void draw() {
		System.out.println("Drawing a circle");
	}
}
public class AbstractClassSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//rectangle r=new rectangle;
shape r=new rectangle();
r.draw();
shape c=new circle();
c.draw();
	}
}
