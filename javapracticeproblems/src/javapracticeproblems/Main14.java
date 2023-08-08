package javapracticeproblems;

public class Main14 {

    public static void main(String[] args) {
        int n = 4;

        // Upper part of the hollow triangle
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}