package javapracticeproblems;
import java.util.ArrayList;
import java.util.List;
public class Main11 {
//Given a string write a function to generate all possible permutations of the characters in the string
//sample input
//enter a string abc
//sample output
//abc,acb,bac,bca,cab,cba
		
	    public static List<String> generatePermutations(String input) {
	        List<String> permutations = new ArrayList<>();
	        generatePermutationsHelper(input.toCharArray(), 0, permutations);
	        return permutations;
	    }

	    private static void generatePermutationsHelper(char[] chars, int currentIndex, List<String> permutations) {
	        if (currentIndex == chars.length - 1) {
	            permutations.add(new String(chars));
	        } else {
	            for (int i = currentIndex; i < chars.length; i++) {
	                swap(chars, currentIndex, i);
	                generatePermutationsHelper(chars, currentIndex + 1, permutations);
	                swap(chars, currentIndex, i); // Backtrack to restore the original order
	            }
	        }
	    }

	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }

	    public static void main(String[] args) {
	        String input = "abc";
	        List<String> permutations = generatePermutations(input);
	        System.out.println(String.join(",", permutations));
	    }
	}