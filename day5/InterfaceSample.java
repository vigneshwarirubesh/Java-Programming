package day5;
//sample interface prg (interface uses 'implements' as a keyword)
interface structure{
	void draw();
}
class oval implements structure{
	public void draw() {
		System.out.println("Going to draw oval");
	}
}
class triangle implements structure{
	public void draw() {
		System.out.println("Going to draw triangle");
	}
}
public class InterfaceSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
structure o=new oval();
o.draw();
structure t=new triangle();
t.draw();
	}
}
