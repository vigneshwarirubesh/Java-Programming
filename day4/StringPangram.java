package day4;
//String pangram
import java.util.Scanner;
public class StringPangram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();
		        scanner.close();		        
		        boolean[] alphabetPresent = new boolean[26];
		        int uniqueLettersCount = 0;		        
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);		            
		            if (ch >= 'a' && ch <= 'z') {
		                int index = ch - 'a'; 
		                if (!alphabetPresent[index]) {
		                    alphabetPresent[index] = true;
		                    uniqueLettersCount++;
		                }
		            } else if (ch >= 'A' && ch <= 'Z') {
		                int index = ch - 'A'; 
		                if (!alphabetPresent[index]) {
		                    alphabetPresent[index] = true;
		                    uniqueLettersCount++;
		                }
		            }
		        }		        
		        if (uniqueLettersCount == 26) {
		            System.out.println("The sentence is a pangram.");
		        } else {
		            System.out.println("The sentence is NOT a pangram.");
		        }
		    }
		}




