package javapracticeproblems;
public class Main8 {
//given an array with all integers between 1 to 100 except for one ,find the missing number
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};
		int i,j;
		boolean flag=false;
		for(i=0,j=1;i<a.length && j<a[a.length-1];i++,j++)
		{
			if(a[i]!=j)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("missing number is "+j);
		}else {
			System.out.println("no number is missing");
		}
			
		

		}

	}
