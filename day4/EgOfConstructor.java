package day4;
//constructor(paramaterize ,default) this is a paramaterized constructor instance and local variables have diff names 
class student{
	int rollno;
	String name;
	student(int r,String n){
		rollno=r;
		name=n;
	}
	//paramaterized constructor when local variables have the same name
	/*
	 student(int rollno,String name){
	 rollno=rollno;
	 name=name;
	 }
	 */
	//this keyword refers to the current instance of a class
	/*student(int rollno,String name){
		this. rollno=rollno;
		this.name=name;
		 }
	*/
	//using static variable to store value
	/*
	 int rollno;
	 String name;
	 static String collegename="SIST";
	student(int rollno,String name){
	this.rollno=rollno;
	this.name=name;
	 }
*/
}
public class EgOfConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student(4,"vigu");
//student s2=new student();//prints default
//student s3=new student();//prints default
System.out.println("Roll no="+s1.rollno);
System.out.println("Name="+s1.name);
	}
}
