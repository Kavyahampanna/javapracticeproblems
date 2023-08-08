package javapracticeproblems;
import java.util.*;
public class Main23 {
	//Sample Input
	//Given with three arrays and one integer where you need to calculate the remaining gifts
	//available in the Santa Claus bag.
	//maxCapacity[] = {2,1,3,4}
	//giftsProvided = {1,1,2,3}
	//extraGift = 10
	//Sample output
	//Remaining gift is 7
	//Explanation
	//Fill the gifts till it reaches the max capacity with the extra gift.
	//2 is the max capacity and 1 is already given so extra gift needs to be added is 1
	//1 is the max capacity and 1 is already given so extra gift needs to be added is 0
	//3 is the max capacity and 2 is already given so extra gift needs to be added is 1
	//4 is the max capacity and 3 is already given so extra gift needs to be added is 1
	//Extra gift delivered is 3
	//10-3 = 7
		public static void main(String[] args) {
				int maxCapacity[]= {2,1,3,4};
				int giftProvided[]= {1,1,2,3};
				int extraGifts=10;
				for(int i=0;i<maxCapacity.length;i++) {
					if(extraGifts!=0 && maxCapacity[i]>giftProvided[i]) {
					int count = maxCapacity[i]-giftProvided[i];
					extraGifts=extraGifts-count;
				}
			}
			    System.out.println("Remaining gifts are"+ extraGifts);
	}
}