package javapracticeproblems;
public class Main21 {
//Given an array of n integers,and an integer K,find the number of pairs of elements in array whose sum is equal to K
//input: N=4,K=6 arr[]= {1,5,7,1} output:2
	public static void main(String[] args) {
		int a[]= {1,5,7,1};
		int target = 6;
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target){
					count++;	
				}
			}
		}
		System.out.println(count);
	}
	static String subArray(int a[],int total)
	{
		for(int i=0;i<a.length;i++)
		{
			int arrSum=0;
			for(int j=i;j<a.length;j++)
			{
				arrSum=arrSum+a[j];
				if(arrSum==total)
				{
					return i+" "+j;
				}
			}
		}
		return "-1";
	}
}