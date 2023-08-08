package javapracticeproblems;
import java.util.Scanner;
public class Main13 {
//you are given two strings s1 and s2.you need to write a program to check if s2 is rotation of s1.
//A string is said to be a rotation of another string if it has the same characters
//as the original string but the order of the character is different
//eg=abcd = abcd, bcda,cdab nd dabc
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the first string:");
			String str1=sc.nextLine();
			System.out.print("enter the second string:");
			String str2=sc.nextLine();
			if(str1.length()!=str2.length()) {
				System.out.print("the two strings are not rotations of each other:");
				
			}else {
				String str=str1+str2;
				if(str.contains(str2)) {
					System.out.print("the two strings are rotations of each other:");
				}else {
					System.out.print("the two strings are not rotations of each other:");
				}
			}

		}

	}

