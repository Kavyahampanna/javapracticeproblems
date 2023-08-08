package javapracticeproblems;
public class Main27 {
//Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements,
//Note: 1st element of the array should be considered in the count of the result.
//For example,
//Arr[1-(7,4,8,2,9)
//As 7 is the first element, it will consider in the result. 8 and 9 are also the elements that are greater than all of its previous elements. Since total of 3 elements is present in the array that meets the condition. Hence the output-3.
//Example:
//Input
//5-> Value of N, represents size of Arr
//7-9 Value of Arr[@]
//4-> Value of Arr[1]
//8- Value of Arr[2]
//2-> Value of Arr[3]
//9-> Value of Arr[4]
//Output:
	static int countArrElements(int arr[], int n){
	int count=1;
	int max=arr[0];
	for(int i=1;i<n;i++){
	if(arr[i]>max){ 
		count++; 
		max= arr[i];
	}
	}
	return count;
	}
	public static void main(String[] args) {
		int arr[]= {7,9,11,18,19};
	int n=arr.length;
	System.out.println(countArrElements (arr,n));
	}
}