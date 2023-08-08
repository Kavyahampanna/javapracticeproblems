package javapracticeproblems;

public class Main17 {
//Given an array A of size N of integers.your task is to find the minimum and maximum elements in the array
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 6, 4, 8};
        findMinMax(arr);
    }
}