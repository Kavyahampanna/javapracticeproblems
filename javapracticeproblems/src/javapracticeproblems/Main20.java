package javapracticeproblems;
import java.util.Arrays;
public class Main20 {
//{1,2,3,4,5}
//sum=10
//{1} {1,2} {1,2,3} {1,2,3,4} {1,2,3,4,5}
//{2} {2,3} {2,3,4} {2,3,4,5}
//{3} {3,4} {3,4,5}
//{4} {4,5}
//{5}
//0 to 3
		public static void main(String[] args) {
		  int a[]= {1,2,3,4,5};
	      int sum=9;
	      System.out.println(subArray(a,sum));
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