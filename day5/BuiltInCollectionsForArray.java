package day5;
//using built in collections for array operations
import java.util.ArrayList;
public class BuiltInCollectionsForArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>l1=new ArrayList<Integer>();
l1.add(10);
l1.add(12);
l1.add(5);
l1.add(2,50);
System.out.println(l1);
System.out.println(l1.size());
System.out.println(l1.contains(50));
System.out.println(l1.contains(100));
/*ArrayList l2=new ArrayList();
l2.add(100);
l2.add("Apple");
l2.add(10.5);
System.out.println(l2);*/
	}

}
