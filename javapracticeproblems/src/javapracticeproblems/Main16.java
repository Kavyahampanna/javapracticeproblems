package javapracticeproblems;

public class Main16 {
    public static void main(String[] args) {
        int n = 4; // Change this value to adjust the size of the pattern
        
        // Print the upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Print decreasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        
        // Print the lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Print decreasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}


