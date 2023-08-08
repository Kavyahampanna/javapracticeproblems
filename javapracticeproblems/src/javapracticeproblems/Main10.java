package javapracticeproblems;

public class Main10 {
//given an array of integers which is sorted in ascending order,and an integer target,write a function to search target in nums.
//if target exists,then return its index.otherwise,return -1 (binarySearch)
	
	    public static int binarySearch(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid; // Target found, return the index
	            } else if (nums[mid] < target) {
	                left = mid + 1; // Target is in the right half of the remaining array
	            } else {
	                right = mid - 1; // Target is in the left half of the remaining array
	            }
	        }

	        return -1; // Target not found
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
	        int target = 11;

	        int result = binarySearch(nums, target);

	        if (result != -1) {
	            System.out.println("Target found at index: " + result);
	        } else {
	            System.out.println("Target not found in the array.");
	        }
	    }
	}