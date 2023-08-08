package javapracticeproblems;

public class Main15 {
//Input string
//PPPPPP@PPP@PP$PP
//output
//7
//explanation
//4 groups can be found
//PPPPPP@
//PPP@
//PP$
//PP
		public static void main(String[] args) {
			String str ="PPPPPP@PPP@PP$PP";
			str = str.replace("@"," ");
			str =str.replace("$"," ");
			String arr[]=str.split(" ");
			int max=0;
			for(int i=0;i<arr.length;i++)
			{
				max=Math.max(max, arr[i].length());
			}
			System.out.println(max+1);
			}


}
