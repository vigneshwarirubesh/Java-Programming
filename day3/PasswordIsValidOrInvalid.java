package day3;
//program to check if a entered password is valid or invalid
import java.util.Scanner;
public class PasswordIsValidOrInvalid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter password:");
String p=s.nextLine();
int small=0,upper=0,sp=0,digit=0;
for (int i=0;i<p.length();i++){
  if(p.charAt(i)>='0'&&p.charAt(i)<='9') {
	  digit=1;
  }
   if(p.charAt(0)>='A'&&p.charAt(0)<='Z'){
	  upper=1;
  }
   if(p.charAt(i)>='a'&&p.charAt(i)<='z') {
	  small=1;
  }
   if(p.charAt(i)=='!'||p.charAt(i)=='@'||p.charAt(i)=='#'||p.charAt(i)=='$'||p.charAt(i)=='*'){
	  sp=1;
  }
}
if(small==1&&upper==1&&sp==1&&digit==1) {
	System.out.println("VALID PASSWROD");
}
else {
	System.out.println("INVALID PASSWORD");
}
s.close();
	}
}


 
