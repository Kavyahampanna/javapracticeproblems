package javapracticeproblems;

public class Main9 {
//1.move all the 0's to the end of the array
//2.all the non-zero elements must retain their original order
	public static void main(String[] args) {
		int arr[]= {1,2,4,0,7,6,0,3,5,0};
		int ind=0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[ind++]=arr[i];
			}
			else {
				count++;
			}
		}
		for(int i=arr.length-1;i>=arr.length-count;i--)
		{
			arr[i]=0;
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}



