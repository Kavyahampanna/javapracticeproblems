package javapracticeproblems;
import java.util.Scanner;
public class Main6 {
//Find the sum of all prime numbers between  two given numbers
//Input:10 20 [excluding the first number and including the last number]
//output:60
//Explanation:11+13+17+19=60
//2 7
//15
//3+5+7=15
	  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int start = scanner.nextInt();

		        System.out.print("Enter the last number: ");
		        int end = scanner.nextInt();

		        // Make sure start is less than end
		        if (start >= end) {
		            System.out.println("Invalid input! The first number should be less than the last number.");
		            return;
		        }

		        long sum = 0;
		        for (int num = start + 1; num <= end; num++) {
		            if (isPrime(num)) {
		                sum += num;
		            }
		        }

		        System.out.println("Sum of prime numbers between " + start + " and " + end + " is " + sum);
		    }

		    // Function to check if a number is prime
		    private static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		}
