package javapracticeproblems;

public class Main7 {
//Given an array of integers,find the minimum sum subarray using kadane's algorithm
//input:[-2,3,-1,2]
//output:4
		
		    public static void main(String[] args) {
//		        int[] arr = {-2, 3, -1, 2};
//		        int maxSum = findMaximumSumSubarray(arr);
//		        System.out.println("Maximum sum subarray: " + maxSum);
//		    }
//
//		    private static int findMaximumSumSubarray(int[] arr) {
//		        if (arr == null || arr.length == 0) {
//		            return 0; // Return 0 for an empty array or null array
//		        }
//
//		        int currentSum = arr[0];
//		        int maxSum = arr[0];
//
//		        for (int i = 1; i < arr.length; i++) {
//		            currentSum = Math.max(arr[i], currentSum + arr[i]);
//		            maxSum = Math.max(maxSum, currentSum);
//		        }
//
//		        return maxSum;
//		    }
		    	int arr[]= {-2,3,-1,2};
		    	int maxsum=0;
		    	
		    	for(int i=0;i<arr.length;i++) {
		    		int tempsum=0;
		    		for(int j=i+1;j<arr.length;j++)
		    		{
		    			tempsum = tempsum+arr[j];
		    			if(tempsum>maxsum)
		    		{
		    			maxsum=tempsum;
		    		}
		    			
		    		}
		    	}
		    System.out.println(maxsum);
		    }
	}
//		    long maxi=Integer.MIN_VALUE;
//		    long sum=0;
//		    for(int i=0;i<n;i++)
//		    {
//		    	sum+=arr[i];
//		    	if(sum<0)
//		    		sum=0;
//		    	maxi=Math.max(maxi, sum);
//		    }
//		    return maxi;
//		    }
//		    }




