package day4;
//string anagram
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		       
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the first string: ");
		        String s1 = scanner.nextLine();
		        System.out.print("Enter the second string: ");
		        String s2 = scanner.nextLine();	       
		        scanner.close();		        
		        if (s1.length() != s2.length()) {
		            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
		            return;
		        }		        
		        int[] charCounts = new int[256];		       
		        for (int i = 0; i < s1.length(); i++) {
		            charCounts[s1.charAt(i)]++;
		            charCounts[s2.charAt(i)]--;
		        }		        
		        boolean isAnagram = true;
		        for (int i = 0; i < 256; i++) {
		            if (charCounts[i] != 0) {
		                isAnagram = false;
		                break;
		            }
		        }
		        if (isAnagram) {
		            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
		        } else {
		            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are NOT anagrams.");
		        }
		    }

		    }