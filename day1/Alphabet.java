package day1;
//check if it is an alphabet or not
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the letter");
		char a=s.nextLine().charAt(0);
		if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){
		//if(n1=='a'||n1=='A'||n1=='b'||n1=='B'||n1=='c'||n1=='C'||n1=='d'||n1=='D'||n1=='e'||n1=='E'||n1=='f'||n1=='F'||n1=='g'||n1=='G'||n1=='h'||n1=='H'||n1=='i'||n1=='I'||n1=='j'||n1=='J'||n1=='k'||n1=='K'||n1=='l'||n1=='L'||n1=='m'||n1=='M'||n1=='n'||n1=='N'||n1=='o'||n1=='O'||n1=='p'||n1=='P'||n1=='q'||n1=='Q'||n1=='r'||n1=='R'||n1=='s'||n1=='S'||n1=='t'||n1=='T'||n1=='u'||n1=='U'||n1=='v'||n1=='V'||n1=='w'||n1=='W'||n1=='x'||n1=='X'||n1=='y'||n1=='Y'||n1=='z'||n1=='Z') {
			System.out.println("It is a alphabet");
		}
		else {
			System.out.println("Not a alphabet");
		}
		s.close();
			}

		}



