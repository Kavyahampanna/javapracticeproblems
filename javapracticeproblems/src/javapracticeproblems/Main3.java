package javapracticeproblems;
import java.util.*;
public class Main3 {
//remove the duplicates of an array
//input:1 3 2 4 4 3
//output: 1 3 2 4
		public static void main(String[] args) {
			LinkedList l1= new LinkedList();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of the list");
			int size = sc.nextInt();
			for(int i=0;i<size;i++)
			{
				l1.add(sc.nextInt());
				
			}
			for(int i=0;i<l1.size();i++)
			{
				for(int j=i+1;j<l1.size();j++)
				{
					if(l1.get(i).equals(l1.get(j)))
					{
						l1.remove(j);
						
					}
				}
			}
			System.out.println(l1);
	}

}
