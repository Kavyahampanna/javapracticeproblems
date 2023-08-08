package javapracticeproblems;

public class Main2 {
//convert the decimal to binary number without using predefined method
//input:7
//output:111
	public static void main(String[] args) {
	int n=7;
	int rem=n;
	int out=0;
	while(rem>0)
	{
		int temp=rem%2;
		out=out*10+temp;
		rem=rem/2;
		}
	System.out.println(out);
	}

}
