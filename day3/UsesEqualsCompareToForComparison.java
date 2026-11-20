package day3;
//comparing strings-equals()-checks for content
//comparing String-==-checks for reference
//comparing string-compareTo-that uses ACSII value
public class UsesEqualsCompareToForComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hai";
String s2="hai";
String s3="hello";
String s4=new String("hai");
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
String s5="HAI";
System.out.println(s1.equals(s5));
System.out.println(s1.equalsIgnoreCase(s5));
//---------- starting == method----------
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
//---------- starting 'compare' method ----------
String s11="apple";
String s12="apple";
String s13="cat";
System.out.println(s11.compareTo(s12));
System.out.println(s11.compareTo(s13));
System.out.println(s13.compareTo(s11));
	}

}
