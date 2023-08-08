package javapracticeproblems;
import java.util.Scanner;
public class Main4 {
//Convert binary to decimal number
//input:111
//output:7
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the binary number");
			int n =sc.nextInt();
			int temp = n;
			int count =0;
			int output =0;
			while(temp>0)
			{
				int rem =temp%10;
				if(rem!=0)
					output=output+(int)Math.pow(2, count);
				temp=temp/10;
				count++;
				
			}
			System.out.println(output);
	}
	
}
