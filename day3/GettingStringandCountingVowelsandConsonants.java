package day3;
//getting a string and counting vowels and consonants(2 methods) 
import java.util.Scanner;
public class GettingStringandCountingVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,v=0,c=0;
System.out.println("Enter a string:");
String s1=s.nextLine();
s1.toLowerCase();
char ch[]=s1.toCharArray();
for(i=0;i<ch.length;i++) {
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		v++;
	}
	else if(ch[i]>='a'&&ch[i]<='z') {
		c++;
	}
}
/*for(i=0;i<s1.length();i++) {
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
		v++;
	}
	else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
		c++;
	}
}*/
System.out.println("The count of vowels:"+v);
System.out.println("The count of consonants:"+c);
s.close();
}
	}


