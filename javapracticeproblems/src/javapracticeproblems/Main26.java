package javapracticeproblems;
public class Main26 {
//insert the key element at a given  index
//input:12345
//output:123845
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int key= 8;
		int arr2[] =new int[arr.length+1];
		int index=3;
		for(int i=arr.length-1,j=arr2.length-1;i>=index-1;i--,j--) {
			arr2[j]=arr[i];
			if(j==index) {
				arr2[j]=key;
			}
		}
		for(int i=0,k=0;i<index;i++,k++) {
			arr2[k]=arr[i];
			}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}