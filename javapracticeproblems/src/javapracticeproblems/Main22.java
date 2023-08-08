package javapracticeproblems;

public class Main22 {
//Given an array of N strings,find the longest common prefix among all strings present in the array
//hello,helloAll,hell,helicopter
//HELlo
//HELloAll
//HELl
//HELicopter
//output:hel
	public static void main(String[] args) {
		String str[]= {"hello","helicopter","helipad"};
		int ind = 0;
		String s=str[0];
		int min1=100;
		
		for(int i=1;i<str.length;i++) {
			String s1=str[i];
			for(int k=0;k<Math.min(s1.length(),s.length());k++) {
				if(s.charAt(k)==s1.charAt(k))
					ind=k;
				else
					break;
			}
			if(min1>ind)
				min1=ind;
		}
			System.out.println(min1);
			System.out.println(str[0].substring(0,min1+1));
		}
}	