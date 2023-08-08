package javapracticeproblems;
public class Main5 {
//Implement a stack data structure using an array

		int arr[];
		int top=-1;
		Main5()
			{
			int capacity=10; 
			arr=new int[capacity];
			}

			void push(int a)
			{
				if(arr.length-1>top)
				{
					arr[++top] = a;
			}
			else
				{
					int temp[] = new int[arr.length*2];
					temp[++top]=a;
					for(int i=0;i<arr.length; i++)
					{
					temp[i]=arr[i];
					}
					arr=new int[arr.length+1];
					for(int i=0;i<arr.length;i++)
					{
						arr[i]=temp[i];
					}
				}
			}
			void display()
			{
			for(int i=0;i<=top;i++)
				{
				System.out.println(arr[i]);
				}
			System.out.println();
			}
			
			int pop()
			{
				if(top!=-1)
				{
					int temp = arr[top];
					arr[top]=0;
					top=top-1;
					return temp;
				}
				else{
					throw new ArrayIndexOutOfBoundsException();
				}
			}
			int peek()
			{
				if(top!=-1) 
				{
					return arr[top];
				}
				else
					throw new ArrayIndexOutOfBoundsException();
			}
			boolean isEmpty()
			{
				if(top!=-1)
					return false; 
				return true;
			}
			public static void main(String[] args) {
			Main5 m= new Main5();
			m.push(10);
			m.display();
			m.pop();
			System.out.println(m.isEmpty());
			m.display();
	}

}
