package javapracticeproblems;
import java.util.Arrays;
public class Main18 {
//Given an array arr[] and an integer K where K is smaller than size of array.task is to find the
//Kth smallest element in the given array. It is given that all array elements are distinct
		public static void main(String[] args) {
		   int arr[]= {10,2,4,35,73,20,10};
	       int k=3;
	       int temp;
	       for(int i=0;i<arr.length;i++)
	       {
	    	   for(int j=i+1;j<arr.length;j++) {
	    		   if(arr[j]<arr[i])
	    		   {
	    			   temp=arr[i];
	    			   arr[i]=arr[j];
	    			   arr[j]=temp;
	    		   }
	    	   }
	       }
	       System.out.println(arr[k-1]);
		}

	}