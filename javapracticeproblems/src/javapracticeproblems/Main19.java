package javapracticeproblems;
import java.util.Arrays;
public class Main19 {
//Given a vector of N positive integers and an integer X .THe task is to find the frequency of X in vector
//input arr= {1,2,3,4,4,3,4,5}
//k=4
//output=3
		public static void main(String[] args) {
			int arr[]= {10,2,4,35,73,20,10};
			int num=10,count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==num)
				{
					count++;
				}
			}
			System.out.println("the number" + num+  "is occured" +count+ "time");
	}

}
