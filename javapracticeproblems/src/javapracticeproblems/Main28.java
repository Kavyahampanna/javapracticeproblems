package javapracticeproblems;

public class Main28 {
//The code provided is a correct implementation to find the numth prime number within the given range from 1 to 10^4.
//It uses the Sieve of Eratosthenes algorithm to efficiently find prime numbers up to 10^4 and then returns the numth prime number.
//For example, if you call MathChallenge(16), it will correctly print 53 as the 16th prime number.
//MathChallenge (num) return the numth prime number. The range will be from 1 to 10^4. 
//For example: if num is 16 the output should be 53 as 53 is the 16th prime number.
	
	    public static int findNthPrime(int num) {
	        int n = 10000;
	        boolean[] isPrime = new boolean[n + 1];

	        // Assume all numbers from 2 to n are prime
	        for (int i = 2; i <= n; i++) {
	            isPrime[i] = true;
	        }

	        // Apply Sieve of Eratosthenes algorithm to find prime numbers
	        for (int p = 2; p * p <= n; p++) {
	            if (isPrime[p]) {
	                for (int i = p * p; i <= n; i += p) {
	                    isPrime[i] = false;
	                }
	            }
	        }

	        // Find the numth prime number
	        int count = 0;
	        for (int i = 2; i <= n; i++) {
	            if (isPrime[i]) {
	                count++;
	                if (count == num) {
	                    return i;
	                }
	            }
	        }
	        return -1; // If the numth prime number is not found (which should not be the case in this example).
	    }

	    public static void main(String[] args) {
	        int num = 16;
	        int result = findNthPrime(num);
	        System.out.println(result);
	    }
}