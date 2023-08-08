package javapracticeproblems;
import java.util.Scanner;
public class Main12 {
//write a program to count the number of occurrences of a given element in an array
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
					System.out.print("enter the size of the array");//10
					int size = sc.nextInt();
					int[] arr= new int[size];
					System.out.println("Enter the array elements:");//4,2,1,3,4,5,4,7,8,4
					for(int i=0;i<size;i++) {
						arr[i]=sc.nextInt();
					}
					System.out.print("Enter the element to count:");//4
					int element =sc.nextInt();
					int count=0;
					for(int i=0;i<size;i++) {
						if(arr[i]==element) {
							count++;
				
						}
					}
					System.out.println("Number of occurrences of"+element+"in the array:"+count);//4
				}
	}