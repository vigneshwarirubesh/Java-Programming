package day5;
interface A{
	void show();
}
interface B{
	void print();
}
class C implements A,B{
	 public void show() {
		 System.out.println("Interface A");
	 }
	 public void print(){
		 System.out.println("Interface B");
	 }
}
public class MultipleInterfaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.show();
c.print();
	}

}
